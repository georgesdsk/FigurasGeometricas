package vistaControlador;

import abstractas.Figura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    StringBuilder sb = new StringBuilder();
    private String MENSAJE_MENU= "Que desea realizar " +
            "\n 1) Seleccionar figura" +
            "\n 2) Crear Figura" +
            "\n 3) Salir";

    private String ELIGIR_FIGURA = "Que figura desea crear?" +
            "\n 1) Circulo" +
            "\n 2) Rectangulo" +
            "\n 3) Cuadrado";


    private String DATO1 = "Cuanto mide el dato 1?";
    private String DATO2 = "Cuanto mide el dato 2?";

    private String ARRAY_VACIO = "No hay ninguna figura en al lista, anade alguna.";

    Scanner sc = new Scanner(System.in);


    public int validarMenu(){

        System.out.println(MENSAJE_MENU);
       return validarNumeroEntre(1,2);//las dos elecciones posible
}


    public int seleccionarFigura(List<Figura> figuras){

        int contador = 0, numFigura = 0;

        if(figuras.isEmpty()){

            System.out.println(ARRAY_VACIO);
            numFigura = -1;

        }else{

            for (Figura figura: figuras
                 ) {
                sb.append(contador++ );
                sb.append(") ");
                sb.append(figura.toString());
                sb.append('\n');
            }

            System.out.println(sb.toString());

            numFigura = validarNumeroEntre(0,figuras.size()-1);

        }

        return numFigura;

    }

    public int validarMedida(int dato){

        int numero = 0;

        if(dato == 1){
            System.out.println(DATO1);
            numero = validarNumeroEntre(0,100);
        }else{
            System.out.println(DATO2);
            numero = validarNumeroEntre(0,100);
        }

return numero;

    }


    public int eligirFigura(){
        System.out.println(ELIGIR_FIGURA);
        return validarNumeroEntre(1,3);

    }





    public int validarNumeroEntre(int min, int max){

        int numero = 0;
        boolean fallo = false;

        do{
            System.out.println("Introduce un numero de "+min +" a "+ max );

            try {
                numero = Integer.parseInt(sc.nextLine());
                fallo = false;

            }catch(IllegalArgumentException e){
                fallo = true;
                System.out.println("fallo");
            }

        }while(fallo || numero > max || numero < min);

        return numero;

    }

    public void mostrarFiguras(List<Figura> figuras){



    }



}
