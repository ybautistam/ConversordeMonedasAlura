import java.util.ArrayList;

public class lista {

    public  void historiacomversiones(ArrayList<Atributos> listaconversiones){

        if(listaconversiones.isEmpty()){

            System.out.println("tu historial esta vacio, intenta agregar algunas conversiones");

        }else {
            System.out.println("-------Historial de conversiones--------------------------------------");

            //mostrando la lista

            for (Atributos mostarlista : listaconversiones){
                System.out.println("Moneda original : " + mostarlista.getMonedabase());
                System.out.println("Cantidad ingresada: " + mostarlista.getMontoingresado());
                System.out.println("Moneda Destino :  " + mostarlista.getMonedafinal());
                System.out.println("Resultado de la conversion: " + mostarlista.getMostrarresultado());
                System.out.println("--------------------------------------------------------------------");
            }
        }
    }

}

