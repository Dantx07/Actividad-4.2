package Inmuebles;

public class Apartamento_familiar extends Apartamento{

    protected static double Valor_metro_cuadrado = 2000000;
    protected double Valor_admon;

    public Apartamento_familiar(int Identificador_inmobiliario, int Area_metros_cuadrados, String direccion, int Numero_habitaciones, int Numero_baños, float Valor_admon) {
        super(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños);
        this.Valor_admon = Valor_admon;
    }

    public void Imprimir() {
        super.Imprimir();
        System.out.println("El valor de la administracion es de: " + Valor_admon);
    }
}
