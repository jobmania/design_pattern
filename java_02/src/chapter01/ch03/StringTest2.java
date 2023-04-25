package chapter01.ch03;

public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android  = new String("android");

        System.out.println(System.identityHashCode(java)); // 기존 인스턴스

        java = java.concat(android); // 연결
        System.out.println(java);
        System.out.println(System.identityHashCode(java)); // 새로운 인스턴스



    }
}
