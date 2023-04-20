package _02.ch11;

public class TwoDimensionTest {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,1,1}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
