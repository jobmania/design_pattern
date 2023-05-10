package chapter02;

public class MyArray {

<<<<<<< HEAD
    int[] intArr;   	//int array
    int count;  		//개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray()
    {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size)
    {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    // 맨뒤로 넣는다.
    public void addElement(int num)
    {
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;

    }

    public void insertElement(int position, int num) {
        // 배열이 꽉차있거나 초과한 경우 삽입 불가!
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        // 넣는 포지션이 배열 밖일 경우 불가!
        if(position < 0 || position > count){
            System.out.println("insert error!!");
            return;
        }
        // 넣는 위치 뒤의 배열 한칸씩 뒤로 이동
        for(int i = count-1 ; i>= position ; i --){
            intArr[i + 1] = intArr[i];
        }

        intArr[position] = num;
        count++;

    }

    public int removeElement(int position) {
        int ret = ERROR_NUM; // 먼저 ERROR값을 리턴한다는 가정하고 성공시 변경.
        if(isEmpty()){
            System.out.println("There is no element");
            return ret;
        }

        if(position < 0 || position>=count){
            System.out.println("remove error!!");
            return ret;
        }

        ret = intArr[position];
        // 삭제한 빈 곳에 하나씩 왼쪽으로 옮기기
        for (int i = position; i < count ; i++) {
            intArr[i] = intArr[i + 1];
        }
        count--;
        return ret;
    }

    public int getSize()
    {
        return count;
    }

    public boolean isEmpty()
    {
        if(count == 0){
            return true;
        }
        else return false;
    }

    // element 반환.
    public int getElement(int position)
    {
        if(position < 0 || position > count-1){
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for(int i=0; i<count; i++){
            System.out.println(intArr[i]);
        }

    }

    public void removeAll()
    {
        for(int i=0; i<count; i++){
            intArr[i] = 0;
        }
        count = 0;
    }
}

=======
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
>>>>>>> master
