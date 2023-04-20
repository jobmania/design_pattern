package _02.ch12_Exam.cafe;

public class CoffeeTest {
    public static void main(String[] args) {
        Person um = new Person("엄", 50000);
        Person kang = new Person("강", 32200);

        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        um.buyStarCoffee(starCoffee,Menu.STARAMERICANO);
        kang.buyBeanCoffee(beanCoffee,Menu.BEANLATTE);
    }
}
