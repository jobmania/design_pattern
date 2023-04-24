package _03.ch09;

public interface Buy {
    void buy();


    default void order(){
        System.out.println("buy order ");
    }
}
