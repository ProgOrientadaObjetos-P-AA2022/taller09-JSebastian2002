/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.InsitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {
    
    protected String Nivelestudio;
    protected InsitucionEducativa Centroeducativo;
    protected double Valorcarrera;
    protected double Valorprestamocarrera;

    public PrestamoEducativo(Persona p, int prestamo, String ciudad, String estudio,
            InsitucionEducativa in, double valorca) {
        
        super(p, prestamo, ciudad);
        Nivelestudio = estudio;
        Centroeducativo = in;
        Valorcarrera = valorca;
        
    }
        
    public void establecerNivelEstudio(String c) {
        Nivelestudio = c;
    }

    public void establecerCentroeducativo(InsitucionEducativa c) {
        Centroeducativo = c;
    }

    public void establecerValorcarrera(double c) {
        Valorcarrera = c;
    }

    public void calcularValorprestamocarrera() {
        Valorprestamocarrera = ( Valorcarrera / Prestamomeses)- (( Valorcarrera / Prestamomeses) * 0.10);
    }

    public String obtenerNivelestudio() {
        return Nivelestudio;
    }

    public InsitucionEducativa obtenerCentroeducativo() {
        return Centroeducativo;
    }

    public double obtenerValorcarrera() {
        return  Valorcarrera;
    }

    public double obtenerValorprestamocarrera() {
        return Valorprestamocarrera;
    }

    @Override
    public String toString() {
        String reporte = "\nEDUCATIVO\n";
        reporte = String.format("%s%s",reporte, super.toString());
        reporte = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                reporte,
                obtenerNivelestudio(),
                obtenerCentroeducativo(),
                obtenerValorcarrera(),
                obtenerValorprestamocarrera());
        return reporte;
    }
}