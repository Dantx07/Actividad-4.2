package Inmuebles;

public class Inmueble_vivienda extends Inmueble{

    protected int Numero_habitaciones;
    protected int Numero_baños;

    public Inmueble_vivienda(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, int Numero_habitaciones, int Numero_baños) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion);
        this.Numero_baños = Numero_baños;
        this.Numero_habitaciones = Numero_habitaciones;
    }

    public void Imprimir() {
        super.Imprimir();
        System.out.println("El numero de baños de la vivienda es: " + Numero_baños);
        System.out.println("El numero de habitaciones de la vivienda es: " + Numero_habitaciones);
    }
}