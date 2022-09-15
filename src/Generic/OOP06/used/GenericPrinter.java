package Generic.OOP06.used;

public class GenericPrinter<T> {
    private T material;

    // 메소드

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return this.material;
    }

    public String toString() {
        return material.toString();
    }

}// end class
