package Inmuebles;

public class Oficinas extends Locales{

    protected static double Valor_metro_cuadrado = 3500000;
    protected boolean Gobierno;

    public Oficinas(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, String Localizacion, boolean Gobierno) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Localizacion);
        this.Gobierno = Gobierno;
    }

    public void Imprimir() {
        super.Imprimir();
        if (Gobierno == true) {
            System.out.println("La oficina pertenece al gobierno");
        } else {
            System.out.println("La oficina no pertenece al gobierno");
        }
    }
}
