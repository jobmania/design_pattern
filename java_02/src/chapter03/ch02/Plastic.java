package chapter03.ch02;

public class Plastic extends Material {


    @Override
    public String toString() {
        return "재료는 플라스티";
    }

    @Override
    public void doPrinting() {
        System.out.println("플라스티 재료로 출력합니다");
    }
}
