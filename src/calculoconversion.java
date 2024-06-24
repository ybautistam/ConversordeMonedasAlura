public class calculoconversion {


    public  double convertir(String monedabase,Double monto,Double obtenertasacambio,String cambiofinal){
        Double resultadoConversion = monto * obtenertasacambio;
        System.out.println("tu cantidad ingresada de : " + monto + " " + monedabase + " es : " + resultadoConversion + " " + cambiofinal );
        return resultadoConversion;

    }
}

