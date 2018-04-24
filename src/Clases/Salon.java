package Clases;

public class Salon {

    private String nombre;
    private long codigo;

    public Salon(String nombre, long codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public String toString() {
        return nombre;
    }

}
