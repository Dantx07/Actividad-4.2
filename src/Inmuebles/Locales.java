package Inmuebles;

public class Locales extends Inmueble{

    protected String Localizacion;


    public Locales(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, String Localizacion) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion);
        this.Localizacion = Localizacion;
    }

    public void Imprimir() {
        super.Imprimir();
        System.out.println("El local tiene una ubicacion " + Localizacion);
    }
}
