package _02.ch12_Exam.cafe;

public class Person {
    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffee starCoffee, int money){
        String message = starCoffee.bewing(money);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "님이" + money +"로" +message);
        }
    }


    public void buyBeanCoffee(BeanCoffee beanCoffee, int money){
        String message = beanCoffee.bewing(money);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "님이" + money +"로" +message);
        }
    }




}
