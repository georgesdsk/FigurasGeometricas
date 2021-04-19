package vistaControlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Validaciones {


  Scanner sc = new Scanner(System.in);


  public void ejemploLocalDate(String fechaEscrita){

      LocalDate fecha = LocalDate.now();
      fecha =  fecha.parse("2019-08-19");
      DateTimeFormatter formato = DateTimeFormatter.ISO_DATE;
      System.out.println(fecha);

  }



    public Date validarFecha()  {

        boolean fallo = false;
        Date fecha = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); //hace para que la fecha no se autoarregle


        do {
            System.out.println("Introduce la fecha de tu nacimiento (dia/mes/anio)");

            try {

                fecha = sdf.parse(sc.nextLine());
                fallo = false;

            }catch(ParseException e){

                fallo = true;
                System.out.println("Fecha introducida incorrectamente");
            }

        }while(fallo);

        return fecha;

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


    public  boolean afirmativo(){

        boolean afirmativo = false;

        System.out.println("Si su respuesta es si, pulsa 1, si no, pulsa 2");

        if(validarNumeroEntre(1,2) == 1){

            afirmativo = true;

        }

        return afirmativo;

    }

}
