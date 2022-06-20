/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    
    protected Persona Beneficiario;
    protected int Prestamomeses;
    protected String Nombreciudadprestamo;
    
    
    public Prestamo(Persona p, int prestamo, String ciudad){
        Beneficiario = p;
        Prestamomeses = prestamo;
        Nombreciudadprestamo = ciudad;
    }
    
    public void establecerBeneficiario(Persona c) {
        Beneficiario = c;
    }
    
    public void establecerPrestamomeses(int  c) {
        Prestamomeses = c;
    }
    
    public void establecerNombreciudadprestamo(String  c) {
        Nombreciudadprestamo = c;
    }
    
    public Persona obtenerBeneficiario() {
        return Beneficiario;
    }

    public int obtenerPrestamomeses() {
        return Prestamomeses;
    }

    public String obtenerNombreciudadprestamo() {
        return Nombreciudadprestamo;
    }

    @Override
    public String toString() {
        String reporte = String.format("Beneficiario: %s\n"
                + "Tiempo del préstamo (meses): %d\n"
                + "Ciudad: %s\n",
                obtenerBeneficiario(),
                obtenerPrestamomeses(),
                obtenerNombreciudadprestamo());
        return reporte;
    }
}
    
    
    

