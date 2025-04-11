//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Crear un objeto de tipo funciono llamado algoraro
        Funcion algoraro = new Funcion();
        algoraro.base=10;
        algoraro.lado=2;
        algoraro.altura=3;
        algoraro.radio=7;
        short cubo = algoraro.calcularCubo(algoraro.base);
        int cuadrado = algoraro.calcularAreaCuadrado(algoraro.lado);
        double triangulo = algoraro.CalcularAreaTriangulo(algoraro.base, algoraro.altura);
        double cuboc= algoraro.CalcularVolumenCubo(algoraro.lado);
        double cuboe= algoraro.CalcularVolumenEsfera(algoraro.radio, algoraro.pi);
        double perimetroc= algoraro.CalcularPerimetroCirculo(algoraro.radio, algoraro.pi);
        int perimetrop= algoraro.CalcularPerimetroPentagono(algoraro.lado);

        System.out.println("el cubo del numero es "+cubo);
        System.out.println("el cuadrado de " + cuadrado);
        System.out.println("el area del triangulo es "+triangulo);
        System.out.println("el volumen del cubo es "+cuboc);
        System.out.println("el volumen de la esfera es "+cuboe);
        System.out.println("el perimetro del circulo es"+ perimetroc);
        System.out.println("el perimetro del pentagono es "+perimetrop);

    }
    public static String person(String name, int year){
        return (name+" you are "+year).toUpperCase();
    }
}