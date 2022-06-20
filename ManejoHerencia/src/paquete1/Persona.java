/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author E.N.D
 */
public class Persona  {
    protected String Nombre;
    protected String Apellido;
    protected String Username;
    
    public Persona(String nb, String ap, String usn) {
        Nombre = nb;
        Apellido = ap;
        Username = usn;
    }

    public Persona(String nombreremplazo) {
        Nombre = nombreremplazo;
    }

    public void establecerNombre(String c) {
        Nombre = c;
    }

    public void establecerApellido(String c) {
        Apellido = c;
    }

    public void establecerUsername(String c) {
        Username = c;
    }

    public String obtenerNombre() {
        return Nombre;
    }

    public String obtenerApellido() {
        return Apellido;
    }

    public String obtenerUsername() {
        return Username;
    }
    
    @Override
    public String toString() {
        String reporte = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerUsername());
        return reporte;
    }
}
    
    

