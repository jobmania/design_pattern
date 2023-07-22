package chapter06.prac;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee kena = new KenyaAmericano();
        kena.brewing();

        System.out.println("=================");

        Coffee kenyLatte = new Latte(new KenyaAmericano());
        kenyLatte.brewing();

        Coffee etiopiaLattee = new Latte(new EtiopiaAmericano());
        etiopiaLattee.brewing();

        System.out.println("=================");


        Coffee whippedCreamEtiopia = new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
        whippedCreamEtiopia.brewing();

    }
}
