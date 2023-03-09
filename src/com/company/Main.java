package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda shop = new Tienda("GuadaShop", "Guada", 1413);
        boolean salir = false;
        while (!salir) {
            System.out.println("Que servicios necesita?");
            System.out.println("1. Agregar un ordenador");
            System.out.println("2. Eliminar un ordenador por marca");
            System.out.println("3. Buscar un ordenador por marca");
            System.out.println("4. Listar todos los ordenadores");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion)
            {
                case 1:
                    if (shop.cantidadOrdenadores() < 20) {
                        System.out.println("Indique la marca del ordenador: ");
                        String marca = scanner.nextLine();
                        System.out.println("Indique la cantidad de memoria del ordenador: ");
                        int cantidadMemoria = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Indique que características tiene el procesador del ordenador: ");
                        String caracteristicasProcesador = scanner.nextLine();
                        System.out.println("Indique el sistema operativo del ordenador: ");
                        String sistemaOperativo = scanner.nextLine();
                        System.out.println("Indique el precio del ordenador: ");
                        double precio = scanner.nextDouble();
                        scanner.nextLine();
                        Ordenador ordenador = new Ordenador(marca, cantidadMemoria, caracteristicasProcesador, sistemaOperativo, precio);
                        shop.agregarOrdenador(ordenador);
                    } else {
                        System.out.println("Lo siento.\nNo podemos guardar mas ordenadores en el almacen. ");
                    }
                    break;

                case 2:
                    System.out.println("Indique la marca del ordenador que quiere eliminar: ");
                    String marca = scanner.nextLine();
                    shop.eliminarOrdenador(marca);
                    break;

                case 3:
                    System.out.println("Indique la marca del ordenador que quiere buscar: ");
                    marca = scanner.nextLine();
                    shop.buscarOrdenador(marca);
                    break;

                case 4:
                    shop.listarOrdenadores();
                    break;

                case 5:
                    salir = true;
                    System.out.println("Cerrando el programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
        scanner.close();
    }

}

