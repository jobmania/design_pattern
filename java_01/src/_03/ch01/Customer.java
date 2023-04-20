package _03.ch01;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;

    int bonusPoint;
    double bonusRatio;
    String agentID;

    public Customer(){
        customerGrade = "Silver";
        bonusRatio = 0.01;
    }


    public String showCustomerInfo(){
    return customerName + customerGrade + bonusPoint;
        }


    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
