package Inmuebles;

public class Apartaestudio extends Apartamento{

    protected static double Valor_metro_cuadrado = 1500000;

    public Apartaestudio(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, int Numero_habitaciones, int Numero_baños) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, 1, 1);
    }

    public void Imprimir() {
        super.Imprimir();
    }
}