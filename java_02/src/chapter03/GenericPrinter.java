package chapter03;

public class GenericPrinter<T> {
    private T material; // 컴파일 타임때 변환이 이루어진다.

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return material;
    }

    public String toString(){
        return material.toString();
    }
}
