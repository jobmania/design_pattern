package _02.ch06;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public void takeSubway(int money){
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNumber +  " 번호 "+ passengerCount + " 명 " + money+" 번돈");
    }

}
