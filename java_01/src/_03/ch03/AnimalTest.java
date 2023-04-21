package _03.ch03;

import java.util.ArrayList;

class Animal {
    public void move(){
        System.out.println("동물이 움직입니다.");
    }

}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void read(){
        System.out.println("책읽는다~");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이 네발로 걷습니다.");
    }
    public void hunt(){
        System.out.println("호랑이 사냥한다~");
    }
}
class Eagle extends Animal{
    public void move(){
        System.out.println("독수리 하늘을 납니다.");
    }
    public void fly(){
        System.out.println("난다~");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList){
            animal.move();     // 다형성 구현 -> 똑같은 코드지만 인스턴스에 따라 인스턴스메소드가 구현됨.
        }


        animalMove(hAnimal);
        animalMove(tAnimal);
        animalMove(eAnimal);


        AnimalTest animalTest = new AnimalTest();
        animalTest.testDownCasting(animalList);
    }

    public static void animalMove(Animal animal){
        animal.move();
    }

    public void testDownCasting(ArrayList<Animal> list){
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            if(animal instanceof Human){
                Human human = (Human) animal;
                human.read();
            }

            if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunt();
            }


            if(animal instanceof Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            }

        }
    }
}

