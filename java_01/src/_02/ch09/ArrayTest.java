package _02.ch09;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int arr2[] = new int[10];

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] ids ;
        ids = new int[]{2, 3, 1, 41};
        for (int id : ids) {
            System.out.println(id);
        }

        int[] arr = new int[10];
        for (int i = 0, num=1; i < arr.length; i++,num++) {
            arr[i] = num;
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);

        int count = 0;
        double[] dArr = new double[5];
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for (double d : dArr) {
            mtotal *=d;
        }
        System.out.println("mtotal = " + mtotal);
        //

        mtotal = 1;
        for (int i = 0; i <count; i++) {
            mtotal *=dArr[i];
        }
        System.out.println("mtotal = " + mtotal);


        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch++;
        }

        for (int i = 0; i < alphabets.length; i++) {
            System.out.print(alphabets[i]);
        }




    }
}
