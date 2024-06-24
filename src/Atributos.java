public class Atributos {

    //atributos
    String monedabase;
    double montoingresado;
    String monedafinal;
    double mostrarresultado;



    //contructor
    public Atributos(String monedabase,double montoingresado,String monedafinal,double mostrarresultado){
        this.monedabase = monedabase;
        this.montoingresado = montoingresado;
        this.monedafinal = monedafinal;
        this.mostrarresultado = mostrarresultado;

    }

    //creando los metodos getters y setters

    public String getMonedabase() {
        return monedabase;
    }

    public void setMonedabase(String monedabase) {
        this.monedabase = monedabase;
    }

    public double getMontoingresado() {
        return montoingresado;
    }

    public void setMontoingresado(double montoingresado) {
        this.montoingresado = montoingresado;
    }

    public String getMonedafinal() {
        return monedafinal;
    }

    public void setMonedafinal(String monedafinal) {
        this.monedafinal = monedafinal;
    }

    public double getMostrarresultado() {
        return mostrarresultado;
    }

    public void setMostrarresultado(double mostrarresultado) {
        this.mostrarresultado = mostrarresultado;
    }

}

