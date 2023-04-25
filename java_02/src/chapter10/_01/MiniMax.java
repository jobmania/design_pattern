package chapter10._01;

import java.util.Arrays;

public class MiniMax {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

       // 내가품
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int min = arr[0];
//        int max = arr[arr.length - 1];
//        System.out.println(min +","+max);
//

        int max = arr[0];
        int min = arr[0];
        int maxPos =0;
        int minPos =0;

        for (int i = 0; i < arr.length; i++) {

            if(min>arr[i]){
                min = arr[i];
                minPos = i;
            }

            if(max<arr[i]){
                max = arr[i];
                maxPos = i;
            }
        }

        System.out.println("최솟값은" + min +"위치는 "+minPos);
        System.out.println("최댓값은" + max +"위치는 "+maxPos);



    }

}
