package com.company;

public class Tienda {
    private String nombre;
    private String propietario;
    private int identificador;
    private Ordenador[] ordenadores;
    private int cantidadOrdenadores;

    public Tienda(String nombre, String propietario, int identificador) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificador = identificador;
        this.ordenadores = new Ordenador[20];
        this.cantidadOrdenadores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Ordenador[] getOrdenadores() {
        return ordenadores;
    }

    public void setOrdenadores(Ordenador[] ordenadores) {
        this.ordenadores = ordenadores;
    }

    public int getCantidadOrdenadores() {
        return cantidadOrdenadores;
    }

    public void setCantidadOrdenadores(int cantidadOrdenadores) {
        this.cantidadOrdenadores = cantidadOrdenadores;
    }

    public void agregarOrdenador(Ordenador ordenador) {
        this.ordenadores[this.cantidadOrdenadores] = ordenador;
        this.cantidadOrdenadores++;
        System.out.println("Ordenador anyadido con exito al listado. ");
    }

    public void eliminarOrdenador(String marca) {
        boolean encontrado = false;
        for (int i = 0; i < this.cantidadOrdenadores; i++) {
            if (this.ordenadores[i].getMarca().equals(marca)) {
                encontrado = true;
                for (int j = i; j < this.cantidadOrdenadores - 1; j++) {
                    this.ordenadores[j] = this.ordenadores[j+1];
                }
                this.ordenadores[this.cantidadOrdenadores - 1] = null;
                this.cantidadOrdenadores--;
                System.out.println("El ordenador ha sido eliminado de la tienda.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Ordenador no encontrado en la tienda. ");
        }
    }

    public void buscarOrdenador(String marca) {
        boolean encontrado = false;
        for (int i = 0; i < this.cantidadOrdenadores; i++) {
            if (this.ordenadores[i].getMarca().equals(marca)) {
                encontrado = true;
                System.out.println("Ordenador encontrado: ");
                System.out.println(this.ordenadores[i]);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Ordenador no encontrado en la tienda");
        }
    }

    public void listarOrdenadores() {
        if (cantidadOrdenadores > 0) {
            for (int i = 0; i < cantidadOrdenadores; i++) {
                System.out.println("Ordenador #" + (i+1));
                System.out.println("Marca: " + ordenadores[i].getMarca());
                System.out.println("Cantidad de memoria: " + ordenadores[i].getMemoria());
                System.out.println("Características del procesador: " + ordenadores[i].getCaracteristicasProcesador());
                System.out.println("Sistema operativo: " + ordenadores[i].getSistemaOperativo());
                System.out.println("Precio: " + ordenadores[i].getPrecio());
                System.out.println("----------------------");
            }
        } else {
            System.out.println("La tienda no tiene ordenadores en inventario.");
        }
    }

    public int cantidadOrdenadores() {
        return this.cantidadOrdenadores;
    }

}
