package Inmuebles;

public class Casa_conjunto_cerrado extends Casa_urbana{

    protected static double Valor_metro_cuadrado = 2500000;
    protected double Valor_admon;
    protected String Areas_comunes;

    public Casa_conjunto_cerrado(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, int Numero_habitaciones, int Numero_baños, int Cantidad_pisos, double Valor_admon, String Areas_comunes) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños, Cantidad_pisos);
        this.Valor_admon = Valor_admon;
        this.Areas_comunes = Areas_comunes;
    }

    public void Imprimir() {
        super.Imprimir();
        System.out.println("El valor de la administracion es: " + Valor_admon);
        System.out.println("¿Tiene areas comunes?: " + Areas_comunes);
    }
}