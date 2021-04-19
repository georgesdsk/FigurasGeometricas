package vistaControlador;

import abstractas.Figura;
import figuras.Circulo;
import figuras.Cuadrado;
import figuras.CuadradoCheto;
import figuras.Rectangulo;

import java.util.ArrayList;

public  class Gestora {

    Menu menu = new Menu();

    public Gestora() {
    }

    public  Figura crearFigura( ){

        Figura figura = null;

       switch(menu.eligirFigura()){

           case 1->figura = new Circulo(menu.validarMedida(1));
           case 2->figura = new Rectangulo(menu.validarMedida(1), menu.validarMedida(2));
           case 3->figura = new CuadradoCheto(menu.validarMedida(1)) ;

           default -> throw new IllegalStateException("Unexpected value: " + menu.eligirFigura());
       }

       return figura;

    }


}
