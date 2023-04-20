package _03.ch01;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("엄준식");
        customer.setCustomerId(100);
        customer.bonusPoint = 1000;
        System.out.println(customer.showCustomerInfo());


        VIPCustomer customer2 = new VIPCustomer();
        customer2.setCustomerName("무자식");
        customer2.setCustomerId(1020);
        customer2.bonusPoint = 10000;
        System.out.println(customer2.showCustomerInfo());
    }
}
