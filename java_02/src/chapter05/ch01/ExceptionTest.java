package chapter05.ch01;

public class ExceptionTest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7};

        try {
            for (int i = 0; i <=10 ; i++) {
                System.out.println(arr[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
}
