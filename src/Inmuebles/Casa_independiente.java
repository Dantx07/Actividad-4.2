package Inmuebles;

public class Casa_independiente extends Casa_urbana{

    protected static double Valor_metro_cuadrado = 3000000;

    public Casa_independiente(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, int Numero_habitaciones, int Numero_baños, int Cantidad_pisos) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños, Cantidad_pisos);
    }

    public void Imprimir(){
        super.Imprimir();
    }
}