package factory_pattern.factory_second;

public abstract class Car  {
    /**
     * 추상클래스로 생성!!
     * Car를 상위 클래스로 만들고 각각의 제품을 하위 클래스로 만든다.
     * 팩토리에서 인스턴스를 생성한다.
     *
     */

    String produceName;
    public Car(String produceName){
        this.produceName = produceName;
    }

    @Override
    public String toString() {
        return produceName;
    }
}
