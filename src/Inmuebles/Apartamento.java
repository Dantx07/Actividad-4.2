package Inmuebles;

public class Apartamento extends Inmueble_vivienda{


    public Apartamento(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, int Numero_habitaciones, int Numero_baños) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños);
    }

    public void Imprimir() {
        super.Imprimir();
    }
}