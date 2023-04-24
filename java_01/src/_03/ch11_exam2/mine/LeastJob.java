package _03.ch11_exam2.mine;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("대기가 적은 순서대로 대기열에서 들고옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 상담원에게 배정");
    }
}
