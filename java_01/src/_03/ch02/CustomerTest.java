package _03.ch02;

public class CustomerTest {

    public static void main(String[] args) {
        int price = 10000;

        Customer customer = new Customer();
        customer.setCustomerName("엄준식");
        customer.setCustomerId(100);
        customer.bonusPoint = 1000;
        int cost = customer.calcPrice(price);
        System.out.println(customer.showCustomerInfo() +" "+ cost);


        Customer customer2 = new VIPCustomer(1020,"무자식");
        // Customer 생성, -> VIP Customer 생성
//        customer2.setCustomerName("무자식");
//        customer2.setCustomerId(1020);

        customer2.bonusPoint = 10000;
        cost = customer2.calcPrice(price);
        System.out.println(customer2.showCustomerInfo() +" "+ cost);


        Customer customerPark = new VIPCustomer(666,"뱅");
        cost = customerPark.calcPrice(price);
        System.out.println(customerPark.showCustomerInfo() +" "+ cost);   //VIP 메소드 요청됨.

        
    }
}
