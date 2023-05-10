package chapter02;

public class MyArray {

    int[] intArr;
    int count;

    public int ARRAY_CAPACITY;
    public static final int ERROR_NUM = -99999999;


    public MyArray(){
        count = 0;
        ARRAY_CAPACITY = 10;
        intArr = new int[ARRAY_CAPACITY];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_CAPACITY = size;
        intArr = new int[ARRAY_CAPACITY];
    }
}
