package Inmuebles;

public class Casa extends Inmueble_vivienda{

    protected int Cantidad_pisos;

    public Casa(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, int Numero_habitaciones, int Numero_baños, int Cantidad_pisos) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños);
        this.Cantidad_pisos = Cantidad_pisos;
    }

    public void Imprimir ()    {
        super.Imprimir();
        System.out.println("La cantidad de pisos de la casa es de: " + Cantidad_pisos);
    }
}