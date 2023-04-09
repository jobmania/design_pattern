package ch08;

public class BooleanTest {
    // 멤버변수, 인스턴스변수

    public static void main(String[] args) {
        boolean isMarried = true;   // 지역변수
        /** var
         Local variable type inference
         추론 가능한 변수에 대한 자료형을 선언하지 않음
         컴파일 타임에 추론
         한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
         지역 변수만 사용 가능 (인스턴스 변수에 사용할 수 없음)
         반드시 변수를 초기화 하여야 함
         null을 넣을 수 없음
         */
        System.out.println(isMarried);
    }
}
