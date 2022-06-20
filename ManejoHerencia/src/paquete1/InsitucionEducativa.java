/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author E.N.D
 */
public class InsitucionEducativa  {
    protected String Nombre;
    protected String Siglas;

    public InsitucionEducativa(String nb, String sig) {
        Nombre = nb;
        Siglas = sig;
    }
    public InsitucionEducativa(String nombreremplazo) {
        Nombre = nombreremplazo;
    }

    public void establecerNombre(String c) {
        Nombre = c;
    }

    public void establecerSiglas(String c) {
        Siglas = c;
    }

    public String obtenerNombre() {
        return Nombre;
    }

    public String obtenerSiglas() {
        return Siglas;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre: %s\n"
                + "Siglas: %s\n",
                obtenerNombre(),
                obtenerSiglas());
  
        return reporte;
    }
}