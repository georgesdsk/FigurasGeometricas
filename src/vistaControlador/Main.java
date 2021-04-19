package vistaControlador;

import abstractas.Figura;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

         Menu menu = new Menu();
         Gestora gestora = new Gestora();

        List<Figura> figuras = new ArrayList();
        Figura figuraSeleccionada = null;
        double dato1, dato2;

        int eleccion = 0, numFigura = 0;


        do {
            eleccion = menu.validarMenu();
            switch(eleccion){
                case 1 -> {
                    numFigura = menu.seleccionarFigura(figuras);
                    if(numFigura > -1){
                        figuraSeleccionada = figuras.get(numFigura);
                    }
                }

                case 2-> figuras.add(gestora.crearFigura());


            }

            }while(eleccion!= 3);




    }



}
