package chapter03.ch02;

public class GenericPrinter <T extends Material>{
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

    public void doPrinting(){
        material.doPrinting();
    }
}
