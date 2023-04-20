package _02.ch06_Exam;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void takeBus(int money){
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println(busNumber +  " 번호 "+ passengerCount + " 명 " + money+" 번돈");
    }
}
