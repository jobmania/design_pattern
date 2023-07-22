package chapter06.prac;

public class WhippedCream extends Decorator{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("휘핑크림추각");
    }
}
