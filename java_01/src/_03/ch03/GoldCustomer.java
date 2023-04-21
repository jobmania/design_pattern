package _03.ch03;

public class GoldCustomer extends Customer{
    double salesRatio;
    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "GOLD";
        salesRatio = 0.1;
        bonusRatio = 0.02;
        System.out.println("Gold Customer(int, String) Call");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

}
