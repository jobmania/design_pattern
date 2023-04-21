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
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이 네발로 걷습니다.");
    }
}
class Eagle extends Animal{
    public void move(){
        System.out.println("독수리 하늘을 납니다.");
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
    }

    public static void animalMove(Animal animal){
        animal.move();
    }
}

