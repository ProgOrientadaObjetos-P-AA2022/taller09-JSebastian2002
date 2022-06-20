/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil  extends Prestamo{
    
    protected String Tipoautomivol;
    protected String Marcavehiculo;
    protected Persona Garante1;
    protected double Valorautomovil;
    protected double Valorprestamoautomovil;

    public PrestamoAutomovil(Persona p, int prestamo, String ciudad, String tipocarro, String marca,
            Persona pr, double costocarro) {
        super(p, prestamo, ciudad);  
        
        Tipoautomivol = tipocarro;
        Marcavehiculo =  marca;
        Garante1 = pr;
        Valorautomovil = costocarro;
    }
    
    public void establecerTipoautomivol(String c) {
        Tipoautomivol = c;
    }

    public void establecerMarcavehiculo(String c) {
        Marcavehiculo = c;
    }

    public void establecerGarante1(Persona c) {
        Garante1 = c;
    }

    public void establecerValorautomovil(double c) {
        Valorautomovil = c;
    }

    public void calcularValorprestamoautomovil() {
        Valorprestamoautomovil = Valorautomovil / Prestamomeses;
    }

    public String obtenerTipoautomivol() {
        return Tipoautomivol;
    }

    public String obtenerMarcavehiculo() {
        return Marcavehiculo;
    }

    public Persona obtenerGarante1() {
        return Garante1;
    }

    public double obtenerValorautomovil() {
        return Valorautomovil;
    }

    public double obtenerValorprestamoautomovil() {
        return Valorprestamoautomovil;
    }

    @Override
    public String toString() {
        
        String reporte = "AUTOMOVIL\n";
        reporte  = String.format("%s\n%s",reporte , super.toString());
        reporte  = String.format("%s\n"
                + "Tipo de automóvil: %s\n"
                + "Marca de automóvil: %s\n"
                + "Garante: %s\n"
                + "Valor de automóvil: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                reporte,
                obtenerTipoautomivol(),
                obtenerMarcavehiculo(),
                obtenerGarante1(),
                obtenerValorautomovil(),
                obtenerValorprestamoautomovil());
        return reporte;
    }
}