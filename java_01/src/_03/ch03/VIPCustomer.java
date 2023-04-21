package _03.ch03;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public VIPCustomer(int customerId, String customerName, int agentID){ //상위클래스 파라미터필요
        super(customerId, customerName);// 매개변수가 없을땐 쓰지 않아도 상위 클래스 생성자 호출.
        customerGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
        this.agentID = agentID;

        System.out.println("VIP Customer(int, String, int) Call");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    public int getAgentID(){
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 상담원 아이디는" + agentID;
    }
}
