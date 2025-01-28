package Inmuebles;

public class Locales_comerciales extends Locales{

    protected static double Valor_metro_cuadrado = 3000000;
    protected String Centro_comercial;


    public Locales_comerciales(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, String Localizacion, String Centro_comercial) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Localizacion);
        this.Centro_comercial = Centro_comercial;
    }

    public void Imprimir() {
        super.Imprimir();
        System.out.println("El local comercial queda en el centro comercial " + Centro_comercial);
    }
}