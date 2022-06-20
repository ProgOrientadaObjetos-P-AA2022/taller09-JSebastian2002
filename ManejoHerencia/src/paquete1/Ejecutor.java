/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;
/**
 *
 * @author reroes
 */
public class Ejecutor { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean salir = false;
        int seleccion;
        while (!salir) {
            System.out.println("Menu de opciones");
            System.out.println("Seleccione");
            System.out.println("1. Préstamo de tipo PrestamoAutomovil ");
            System.out.println("2. Préstamo de tipo PrestamoEducativo ");
            System.out.println("3. Salir");
            try {
                System.out.println("Ingrese que desea seleccionar");
                seleccion = entrada.nextInt();
                switch (seleccion) {
                    case 1:
                        System.out.println("Ha seleccionado el prestamo de un automovil");   
                        String nombre;
                        String apellido;
                        String usuario;
                        String nombreIns;
                        String siglas;
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        System.out.println("Ingrese el nombre");
                        nombre = entrada.nextLine();
                        System.out.println("Ingrese el apellido");
                        apellido = entrada.nextLine();
                        System.out.println("Ingrese el usurio");
                        usuario = entrada.nextLine();
                        System.out.println("Ingrese el nombre de la Institucion");
                        nombreIns = entrada.nextLine();
                        System.out.println("Ingrese las siglas de la institucion");
                        siglas = entrada.nextLine();
                        Persona ps1 = new Persona(nombre, apellido, usuario);
                        ps1.establecerNombre(nombre);
                        ps1.establecerApellido(apellido);
                        ps1.establecerUsername(usuario);
                        InsitucionEducativa ed1 = new InsitucionEducativa(nombreIns, siglas);
                        ed1.establecerNombre(nombreIns);
                        ed1.establecerSiglas(siglas);        
                        int meses;
                        String ciudad;   
                        System.out.println("Ingrese la cantidad de meses a cancelar");
                        meses = entrada.nextInt();
                        System.out.println("Ingrese el nombre de la ciudad donde se realizo el prestamo");
                        ciudad = entrada.nextLine();
                        String auto;
                        String marca;
                        String nombre2;
                        String apellido2;
                        String usuario2;
                        double valorautomovil;
                        System.out.println("--------------------------------------------------------------------------------------------------------");                     
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        System.out.println("Ingrese el tipo de auto");
                        auto = entrada.nextLine();
                        System.out.println("Ingrese la marcar del auto");
                        marca = entrada.nextLine();
                        System.out.println("Ingrese el nombre del garante");
                        nombre2= entrada.nextLine();
                        System.out.println("Ingrese el apellido del garante");
                        apellido2 = entrada.nextLine();
                        System.out.println("Ingrese el usuario");
                        usuario2 = entrada.nextLine();
                        System.out.println("Ingrese el valor del auto");
                        valorautomovil = entrada.nextDouble();
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        Persona ps2 = new Persona(nombre2, apellido2, usuario2);
                        ps2.establecerNombre(nombre2);
                        ps2.establecerApellido(apellido2);
                        ps2.establecerUsername(usuario2);        
                        PrestamoAutomovil at1 = new PrestamoAutomovil(meses, ciudad.toLowerCase(), auto, marca, ps2, ps1, valorautomovil);
                        at1.establecerBeneficiario(ps1);
                        at1.establecerPrestamomeses(meses);
                        at1.establecerNombreciudadprestamo(ciudad);
                        at1.establecerTipoautomivol(auto);
                        at1.establecerMarcavehiculo(marca);
                        at1.establecerGarante1(ps2);
                        at1.establecerValorautomovil(valorautomovil);
                        at1.calcularValorprestamoautomovil();
                        System.out.printf("%s\n", at1);
                        break;
                    case 2:
                        System.out.println("Ha seleccionado el prestamo educativo");
                        String estudio;
                        String nombrecarrera;
                        double valor;
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        System.out.println("Ingrese el nivel de estudio");
                        estudio = entrada.nextLine();
                        System.out.println("Ingrese  valor de la carrera");
                        valor = entrada.nextDouble();
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        PrestamoEducativo pe1 = new PrestamoEducativo(ed1,ps1,nombre, apellido, usuario, ciudad,meses,valorcarrera,estudio);
                        pe1.establecerBeneficiario(ps1);
                        pe1.establecerPrestamomeses(meses);
                        pe1.establecerNombreciudadprestamo(ciudad);
                        pe1.establecerNivelEstudio(estudio);
                        pe1.establecerCentroeducativo(ed1);
                        pe1.establecerValorcarrera(valor);
                        pe1.calcularValorprestamocarrera();
                        System.out.printf("%s\n", pe1);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                entrada.next();
            }
        }
 
    }
 
}
  