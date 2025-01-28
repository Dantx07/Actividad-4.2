package Inmuebles;
import java.util.*;

public class Prueba_inmuebles {
    public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuacion rellenara algunos datos, por favor, \nrellene con los numeros de la opcion, gracias.");

        int Tipo_De_inmueble;

        System.out.println ("Ingrese el tipo de inmueble\n1. Vivienda\n2. Local");
        do {
            Tipo_De_inmueble = scanner.nextInt();

            if (Tipo_De_inmueble != 1 && Tipo_De_inmueble != 2) {
                System.out.println("Error: Debes ingresar solo el número 1 o 2.");
            }
        } while (Tipo_De_inmueble != 1 && Tipo_De_inmueble != 2);
        System.out.println("Ingrese el identificador inmobiliario: ");
        int Identificador_inmobiliario = scanner.nextInt();
        System.out.println("Ingrese los metros cuadrados: ");
        int Area_metros_cuadrados = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la direccion del inmobiliario: ");
        String direccion = scanner.nextLine();

        if (Tipo_De_inmueble == 1) {
            System.out.println("¿Cual es su tipo de vivienda? \n1. Casa \n2. Apartamento");
            int Tipo_de_vivienda = scanner.nextInt();
            if (Tipo_de_vivienda == 1)  {
                System.out.println("¿Cual es su tipo de casa? \n1. Casa rural \n2. Casa independiente \n3. Casa en conjunto cerrado");
                int Tipo_de_casa = scanner.nextInt();
                if (Tipo_de_casa == 1)  {
                    System.out.println("Ingrese el numero de habitaciones: ");
                    int Numero_habitaciones = scanner.nextInt();
                    System.out.println("Ingrese el numero de baños:");
                    int Numero_baños = scanner.nextInt();
                    System.out.println("Ingrese la cantidad de pisos: ");
                    int Cantidad_pisos = scanner.nextInt();
                    System.out.println("Ingrese la distancia hasta la cabecera municipal: ");
                    double Distancia_cab_mun = scanner.nextDouble();
                    System.out.println("Ingrese la altura sobre el nivel del mar: ");
                    double Altitud_nivel_mar = scanner.nextDouble();
                    Casa_rural Casa = new Casa_rural(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños, Cantidad_pisos, Distancia_cab_mun, Altitud_nivel_mar);
                    Casa.Calcular_precio(Casa_rural.Valor_metro_cuadrado);
                    System.out.println("Los datos de su inmueble son: ");
                    Casa.Imprimir();
                }   else if (Tipo_de_casa == 2) {
                        System.out.println("Ingrese el numero de habitaciones: ");
                        int Numero_habitaciones = scanner.nextInt();
                        System.out.println("Ingrese el numero de baños:");
                        int Numero_baños = scanner.nextInt();
                        System.out.println("Ingrese la cantidad de pisos: ");
                        int Cantidad_pisos = scanner.nextInt();
                        Casa_independiente Casa = new Casa_independiente(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños, Cantidad_pisos);
                        Casa.Calcular_precio(Casa_independiente.Valor_metro_cuadrado);
                        System.out.println("Los datos de su inmueble son: ");
                        Casa.Imprimir();
                    }   else if (Tipo_de_casa == 3) {
                            System.out.println("Ingrese el numero de habitaciones: ");
                            int Numero_habitaciones = scanner.nextInt();
                            System.out.println("Ingrese el numero de baños:");
                            int Numero_baños = scanner.nextInt();
                            System.out.println("Ingrese la cantidad de pisos: ");
                            int Cantidad_pisos = scanner.nextInt();
                            System.out.println("Ingrese el valor de la administracion: ");
                            float Valor_admon = scanner.nextFloat();
                            scanner.nextLine();
                            System.out.println("¿Tiene areas comunes?\n1. Si \n2. No");
                            int Areas_comu = scanner.nextInt();
                            String Areas_comunes = "";
                            if (Areas_comu == 1) {
                                Areas_comunes = "Si";
                            }   else if (Areas_comu == 2)    {
                                Areas_comunes = "No";
                            }
                            Casa_conjunto_cerrado Casa = new Casa_conjunto_cerrado(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños, Cantidad_pisos, Valor_admon, Areas_comunes);
                            Casa.Calcular_precio(Casa_conjunto_cerrado.Valor_metro_cuadrado);
                            System.out.println("Los datos de su inmueble son: ");
                            Casa.Imprimir();
                    }
            } else if (Tipo_de_vivienda == 2) {
                System.out.println("¿Cual es su tipo de apartamento? \n1. Apartamento familiar \n2. Apartaestudio");
                int Tipo_de_apartamento = scanner.nextInt();
                if (Tipo_de_apartamento == 1)   {
                    System.out.println("Ingrese el numero de habitaciones: ");
                    int Numero_habitaciones = scanner.nextInt();
                    System.out.println("Ingrese el numero de baños:");
                    int Numero_baños = scanner.nextInt();
                    System.out.println("Ingrese el valor de la administracion: ");
                    float Valor_admon = scanner.nextFloat();
                    Apartamento_familiar apartamento = new Apartamento_familiar(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Numero_habitaciones, Numero_baños, Valor_admon);
                    apartamento.Calcular_precio(Apartamento_familiar.Valor_metro_cuadrado);
                    System.out.println("Los datos de su inmueble son: ");
                    apartamento.Imprimir();
                }   else if (Tipo_de_apartamento == 2) {
                        Apartaestudio apartamento = new Apartaestudio(Identificador_inmobiliario, Area_metros_cuadrados, direccion, 1, 1);
                        apartamento.Calcular_precio(Apartaestudio.Valor_metro_cuadrado);
                        System.out.println("Los datos de su inmueble son: ");
                        apartamento.Imprimir();
                        }
            }

        }   else {
            System.out.println("¿Cual es su tipo de local? \n1. Local comercial \n2. Oficina");
            int Tipo_de_local = scanner.nextInt();
            if (Tipo_de_local == 1) {
                System.out.println("El local es interno o da a la calle? \n1. Interno \n2. Da a la calle");
                int Loc = scanner.nextInt();
                scanner.nextLine();
                String Localizacion = "";
                if (Loc == 1) {
                    Localizacion = "interna";
                } else if (Loc == 2) {
                    Localizacion = "que da al exterior";
                }
                System.out.println("¿En que centro comercial queda ubicado su local?");
                String Centro_comercial = scanner.nextLine();
                Locales_comerciales Local = new Locales_comerciales(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Localizacion, Centro_comercial);
                Local.Calcular_precio(Locales_comerciales.Valor_metro_cuadrado);
                System.out.println("Los datos de su inmueble son: ");
                Local.Imprimir();
            }   else if (Tipo_de_local == 2)    {
                    System.out.println("El local es interno o da a la calle? \n1. Interno \n2. Da a la calle");
                    int Loc = scanner.nextInt();
                    String Localizacion = "";
                    if (Loc == 1) {
                        Localizacion = "interna";
                    } else if (Loc == 2) {
                        Localizacion = "que da al exterior";
                    }
                    System.out.println("¿Es una oficina del gobierno? \n1. Si \n2. No");
                    boolean Gobierno = true;
                    int Gob = scanner.nextInt();
                    if (Gob == 1)   {
                        Gobierno = true;
                    }   else if (Gob == 2)  {
                        Gobierno = false;
                    }
                    Oficinas Local = new Oficinas(Identificador_inmobiliario, Area_metros_cuadrados, direccion, Localizacion, Gobierno);
                    Local.Calcular_precio(Oficinas.Valor_metro_cuadrado);
                    System.out.println("Los datos de su inmueble son: ");
                    Local.Imprimir();
            }
        }
    }
}
