package _02.ch08;

import java.util.Calendar;

public class SchoolTest {
    public static void main(String[] args) {
//        School school = new School(); 외부에서 생성 불가용~
        School school = School.getInstance();
        School school2 = School.getInstance();
        System.out.println(school==school2);// 같은 주소!

        Calendar calendar = Calendar.getInstance();//싱글톤, Canlendar = 시간에 대한 값 제공 util
    }
}
