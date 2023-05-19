package chapter03.ch02;

public class Powder extends Material {

    @Override
    public String toString() {
        return "재료는 파우더";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다");
    }
}
