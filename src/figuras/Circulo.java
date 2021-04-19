package figuras;

import abstractas.Figura;

public class Circulo extends Figura {

    private static final double PI = 3.1416;
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getPerimetro() {

        return 2 * radio * PI;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
