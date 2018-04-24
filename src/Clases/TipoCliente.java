/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Yoselin
 */
public class TipoCliente {

    private int coidgo;
    private String nombre;

    public TipoCliente(int coidgo, String nombre) {
        this.coidgo = coidgo;
        this.nombre = nombre;
    }

    public int getCoidgo() {
        return coidgo;
    }

    public String getNombre() {
        return nombre;
    }
}
