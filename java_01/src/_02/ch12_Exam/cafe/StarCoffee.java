package _02.ch12_Exam.cafe;

public class StarCoffee {
    int money;
    public String bewing(int money){
        this.money += money;
        if(money==Menu.STARAMERICANO){
            return "별다방 아메리카노";
        } else if (money==Menu.STARLATTE) {
            return "별다방 라떼";
        }else{
            return null;
        }
    }
}
