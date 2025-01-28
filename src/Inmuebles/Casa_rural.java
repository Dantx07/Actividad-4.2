package Inmuebles;

public class Casa_rural extends Casa{

    protected static double Valor_metro_cuadrado = 1500000;
    protected double Distancia_cab_mun;
    protected double Altitud_nivel_mar;


    public Casa_rural(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, int Numero_habitaciones, int Numero_baños, int Cantidad_pisos, double Distancia_cab_mun, double Altitud_nivel_mar) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños, Cantidad_pisos);
        this.Altitud_nivel_mar = Altitud_nivel_mar;
        this.Distancia_cab_mun = Distancia_cab_mun;
    }

    public void Imprimir() {
        super.Imprimir();
        System.out.println("La distancia a la cabecera municipal de lu vivienda es de: " + Distancia_cab_mun + " m");
        System.out.println("La altura sobre el nivel del mar de lu vivienda es de: " + Altitud_nivel_mar + " m");
    }
}