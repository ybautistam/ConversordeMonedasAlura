import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        //instanciar a la clase conectarApi
        conectarApi consultaApi = new conectarApi();

        //instanciar a la clase calculoconversion
        calculoconversion conversion = new calculoconversion();

        //creas un arraylist para poder agregar a los datos que se envian a la clase lista
        ArrayList<Atributos> listaconversiones = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        int opcion;

        System.out.println("\t\tConversor Alura\n");
        System.out.println("Dime tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("***********************************************");
        System.out.println("\t\t\tBienvenid@ " + nombre + "\t\t");
        System.out.println("***********************************************");
        System.out.println("elige una de las siguientes opciones: ");

        do{
            System.out.println("1.conversor de moneda\n");
            System.out.println("2.lista de conversiones\n");
            System.out.println("3.Salir del programa\n");
            System.out.println("ingresa una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Aqui tiene una lista de las monedas que desees convertir");
                    mostrarmonedas();


                    try {
                        System.out.println("escribe el nombre  de la moneda (segun la lista) que quieres comvertir : ");
                        String monedabase = entrada.next().toLowerCase();
                        System.out.println("Cantidad a convertir: ");
                        double cantidad = entrada.nextDouble();
                        System.out.println("escribe el nombre de la moneda(segun la lista) que quieres convertir A : ");
                        String convertirA = entrada.next().toLowerCase();

                        gsonexchangerateApi obtenermoneda = consultaApi.llamarapi(monedabase);
                        double obtenertasacambio = obtenermoneda.conversion(convertirA.toUpperCase());
                        double mostrarresultado = conversion.convertir(monedabase,cantidad,obtenertasacambio,convertirA);
                        Atributos atributos = new Atributos(monedabase,cantidad,convertirA,mostrarresultado);
                        listaconversiones.add(atributos);


                    }catch (RuntimeException e ){

                        System.out.println(e.getMessage());
                        System.out.println("finalizando la aplicacion");

                    }
                    break;

                case 2:

                    lista mostrarlista = new lista();
                    mostrarlista.historiacomversiones(listaconversiones);
                    break;

                case 3:
                    System.out.println("Hasta pronto " + nombre);
                    System.out.println("Finalizando programa");
                    break;

                default:
                    System.out.println("Opcion invalida!...");

            }

        }while(opcion !=3);


    }

    public static void mostrarmonedas(){
        System.out.println("----------------------------------------------");
        System.out.println(" USD \t\t  AED");
        System.out.println(" AFN \t\t  ALL");
        System.out.println(" AMD \t\t  ANG");
        System.out.println(" AOA \t\t  ARS");
        System.out.println(" AUD \t\t  AWG");
        System.out.println(" AZN \t\t  BAM");
        System.out.println(" BBD \t\t  BDT");
        System.out.println(" BGN \t\t  BHD");
        System.out.println(" BIF \t\t  BMD");
        System.out.println(" BND \t\t  BOB");
        System.out.println(" BRL \t\t  BRL");
        System.out.println(" BSD \t\t  BTN");
        System.out.println(" BWP \t\t  BYN");
        System.out.println(" BZD \t\t  CAD");
        System.out.println(" CDF \t\t  CHF");
        System.out.println(" CLP \t\t  CNY");
        System.out.println(" COP \t\t  CRC");
        System.out.println(" CUP \t\t  CVE");
        System.out.println(" CZK \t\t  DJF");
        System.out.println(" DKK \t\t  DOP");
        System.out.println(" DZD \t\t  EGP");
        System.out.println(" ERN \t\t  ETB");
        System.out.println(" EUR \t\t  FJD");
        System.out.println(" FKP \t\t  FOK");
        System.out.println(" GBP \t\t  GBP");
        System.out.println(" GEL \t\t  GGP");
        System.out.println(" GHS \t\t  GMD");
        System.out.println(" GNF \t\t  GTQ");
        System.out.println(" GYQ \t\t  HKD");
        System.out.println(" HNL \t\t  HRK");
        System.out.println(" HTG \t\t  HUF");
        System.out.println(" IDR \t\t  ILS");
        System.out.println(" IMP \t\t  JPY");
        System.out.println(" KRW \t\t  MUR");
        System.out.println(" MXN \t\t  PHP");
        System.out.println(" RUB \t\t  ZWL");
        System.out.println("----------------------------------------------");


    }


}

