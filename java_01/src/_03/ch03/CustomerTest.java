package _03.ch03;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerArrayList = new ArrayList<>();
        Customer customer1 = new Customer(1000,"엄");
        Customer customer2 = new Customer(1001,"파");
        Customer customer3 = new GoldCustomer(123,"도");
        Customer customer4 = new VIPCustomer(444,"랄",12);

        customerArrayList.add(customer1);
        customerArrayList.add(customer2);
        customerArrayList.add(customer3);
        customerArrayList.add(customer4);


        System.out.println("고객정보출력");

        for(Customer c : customerArrayList){
            System.out.println(c.showCustomerInfo());
        }

        System.out.println("할인율 및 보너스 내용");

        int price = 10000;
        for(Customer c : customerArrayList){
            int cost = c.calcPrice(price);
            System.out.println(c.getCustomerName() + "님의 " + cost + " 비용");
            System.out.println(c.getCustomerName() + "님의  적립" + c.bonusPoint + " 보너스");

        }

    }
}
