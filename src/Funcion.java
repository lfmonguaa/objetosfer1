public class Funcion {
    //Atributos para nuestro ejemplo
    int lado;
    double altura;
    double radio;
    short base;
    double pi=3.141592;
    //Metodos para nuestro ejemplo

    public short calcularCubo(short base) {

        return (short) (base * base * base);
    }

    public int calcularAreaCuadrado(int lado) {

        return  (lado * lado);
    }
    public double CalcularAreaTriangulo(short base,double altura){

        return  ((base*(altura*altura))/2);
    }
    public double CalcularVolumenCubo(int lado) {

        return (lado * lado * lado);
    }
    public double CalcularVolumenEsfera(double radio,double pi) {

        return ((double) 4 /3*(pi)*(radio*radio*radio));
    }
    public double CalcularPerimetroCirculo(double radio,double pi) {

        return (2*pi*radio);
    }
    public int CalcularPerimetroPentagono(int lado) {

        return (lado+lado+lado+lado+lado);
    }

}
