package chapter03;

public class GenericPrinterTest {

    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        var skd = "엄"; // var는 지역변수 (메소드 안의 변수)에서만 사용 가능함 ㅇㅇ.(즉, 클래스 변수, 인스턴스 변수에선 사용 x)

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);
    }
}
