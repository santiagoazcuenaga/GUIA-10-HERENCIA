package herenciaejextra1;

import entidades.Circulo;

/**
 *
 * @author franc
 */
public class HerenciaEjExtra1 {

   
    public static void main(String[] args) {
       Circulo circulo = new Circulo(5);
        System.out.println("El area es: "+circulo.area());
        System.out.println("El perimetro es: "+circulo.perimetro());
    }

}
