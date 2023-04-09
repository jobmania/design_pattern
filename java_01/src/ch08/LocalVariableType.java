package ch08;

public class LocalVariableType {
    public static void main(String[] args) {

        /** var
         Local variable type inference
         추론 가능한 변수에 대한 자료형을 선언하지 않음
         컴파일 타임에 추론
         한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
         지역 변수만 사용 가능 (인스턴스 변수에 사용할 수 없음)
         반드시 변수를 초기화 하여야 함
         null을 넣을 수 없음
         */
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println("str = " + str);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        str = " a";
//        str = 1; // 실행안됨

    }
}
