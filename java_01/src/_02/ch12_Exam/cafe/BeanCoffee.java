package _02.ch12_Exam.cafe;

public class BeanCoffee {
    int money;
    public String bewing(int money){
        this.money += money;
        if(money==Menu.BEANAMERICANO){
            return "콩 아메리카노";
        } else if (money==Menu.BEANLATTE) {
            return "콩 라떼";
        }else{
            return null;
        }
    }
}
