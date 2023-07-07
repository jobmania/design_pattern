package chapter04.practice;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이자식", 33, 5000);
        TravelCustomer customerUng = new TravelCustomer("응애", 11, 300);
        TravelCustomer customerHong = new TravelCustomer("홍구 ", 55, 9900);

        List<TravelCustomer> customers = new ArrayList<>();
        customers.add(customerLee);
        customers.add(customerUng);
        customers.add(customerHong);

        /// 이름
        customers.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        // 총비용
        int sum = customers.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("sum = " + sum);


        // 20세이상만 걸림
        customers.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).forEach(s -> System.out.println(s));


    }
}
