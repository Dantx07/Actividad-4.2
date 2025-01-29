package Inmuebles;

public class Inmueble {

    protected int Identificador_inmobiliario;
    protected int Area_metros_cuadrados;
    protected String direccion;
    protected double Precio_venta;

    public Inmueble (int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion) {
        this.Identificador_inmobiliario = Identificador_inmobiliario;
        this.Area_metros_cuadrados = Area_metros_cuadrados;
        this.direccion = direccion;
    }

    double Calcular_precio (double Valor_metro_cuadrado)    {
        Precio_venta = Area_metros_cuadrados*Valor_metro_cuadrado;
        return Precio_venta;
    }

    public void Imprimir()  {
        System.out.println("Identificador inmobiliario: " + Identificador_inmobiliario);
        System.out.println("El area total del inmueble es: " + Area_metros_cuadrados + " metros cuadrados");
        System.out.println("La direccion del inmueble es: " + direccion);
        System.out.println("El precio de venta del inmueble es: " + Precio_venta + " $");
    }
}