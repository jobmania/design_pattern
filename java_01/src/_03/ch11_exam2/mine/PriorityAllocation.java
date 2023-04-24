package _03.ch11_exam2.mine;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("우선순위 상담전화 순서대로 대기열에서 들고옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 상담원에게 배정");
    }
}
