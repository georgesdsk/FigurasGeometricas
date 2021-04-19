package figuras;

import abstractas.Figura;

public class Rectangulo extends Figura {

    private double ladoMenor, ladoMayor;


    public Rectangulo(double ladoMenor, double ladoMayor) {
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    @Override
    public double getPerimetro() {
        return (ladoMenor + ladoMayor) *2 ;
    }

    @Override
    public double getArea() {

        return ladoMenor  *ladoMayor;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ladoMenor=" + ladoMenor +
                ", ladoMayor=" + ladoMayor +
                '}';
    }
}
