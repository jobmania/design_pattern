package chapter02.ch02;

public class ObjectArray {

    private int cout;
    private Object[] array;
    public int ARRAY_SIZE;

    public ObjectArray()
    {
        ARRAY_SIZE = 10;
        array = new Object[ARRAY_SIZE];
    }

    public ObjectArray(int size)
    {
        ARRAY_SIZE = size;
        array = new Object[ARRAY_SIZE];
    }

}
