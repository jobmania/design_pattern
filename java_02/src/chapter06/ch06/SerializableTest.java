package chapter06.ch06;


import java.io.*;

//class Person implements Serializable  {
class Person implements Externalizable  {

    // 파일에
    private static final long serialVersionUID = 1L;


    String name;
    String job;
//    transient String job;
    // transient : 직렬화 하지 않으려는 멤버 변수에 사용함 (Socket등 직렬화 할 수 없는 객체)

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Person() {
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(job);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        job = in.readUTF();
        name = in.readUTF();
    }
}
public class SerializableTest {
    public static void main(String[] args) {
        Person personUm = new Person("엄준식", "무직");
        Person personSon = new Person("손원철", "자택경비원");

        try ( FileOutputStream fos = new FileOutputStream("serial.out");
              ObjectOutputStream oos = new ObjectOutputStream(fos); // 보조스트림
            ){
            oos.writeObject(personUm);
            oos.writeObject(personSon);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //////////
        try(FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
            Person ps1 =(Person) ois.readObject();
            Person ps2 =(Person) ois.readObject();

            System.out.println("ps1 = " + ps1);
            System.out.println("ps2 = " + ps2);
        }catch (IOException | ClassNotFoundException e){

        }



    }
}
