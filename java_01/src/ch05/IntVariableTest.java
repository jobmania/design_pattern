package ch05;

public class IntVariableTest {
    public static void main(String[] args) {
        byte bs = -128 ; // -128 ~ 127
        System.out.println("bs = " + bs);

        long iVal = 12345678900L; // int시 too large - > –2,147,483,648 ~ 2,147,483,647
        System.out.println("iVal = " + iVal);
        
    }
}
