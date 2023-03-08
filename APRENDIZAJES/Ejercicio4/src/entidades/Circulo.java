package entidades;

/**
 *
 * @author franc
 */
public class Circulo implements UwU {
    
    public int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }
    

    @Override
    public double area() {
        return PI*(radio*radio);
    }

    @Override
    public double perimetro() {
        return PI * (2*radio);
    }

}
