package chapter10._02;

public class BinarySearchProblem {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};


        //
        // 83의 위치를 찾아보세요
        //88의 위치를 찾아보세요
        // 단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어짐
        //수가 정렬된 상태에서는 이진 탐색(binary search)을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있음

        int targetNum = 83;

        int low = 0;
        int high = numbers.length-1;
        int mid = 0;
        boolean find = false;

        while (low<=high) {
            mid = (low+high)/ 2;
            int midNum = numbers[mid];

            if (targetNum == midNum) {
                find = true;
                break;
            } else if (targetNum > midNum) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        if(find){
            System.out.println("위치는 " + (mid+1)+ "번째");
        }else {
            System.out.println("답이없다");

        }



    }
}