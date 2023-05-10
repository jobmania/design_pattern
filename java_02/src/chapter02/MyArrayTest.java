package chapter02;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.addElement(10);
        myArray.addElement(20);
        myArray.addElement(30);
        myArray.addElement(40);
        myArray.insertElement(1,100);
        myArray.printAll();

        System.out.println("=============");
        myArray.removeElement(1);
        myArray.printAll();
        System.out.println("=============");

        myArray.addElement(70);
        myArray.printAll();
        System.out.println("=============");
        System.out.println(myArray.getElement(1));
        System.out.println("=============");

    }
}
