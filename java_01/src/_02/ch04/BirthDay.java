package _02.ch04;

public class BirthDay {

    private int day;
    private int month;
    private int year;

     boolean isValid = true; // 초기값 지정안하면 false로 선언됨.

    public BirthDay(){
        isValid = true;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12){
            isValid = false;
            return;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void printThis(){
        System.out.println(this);
    }


}
