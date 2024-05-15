/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.LibretaCalificacion;
/**
 *
 * @author utpl
 */
public class EjecutorDos {
    public static void main(String[]args){
        double[] notas = {10,9.0,10};
        String nombreEstudiante = "Rene Elizalde";
        
         LibretaCalificacion libreta = new LibretaCalificacion(nombreEstudiante,
               notas);
        
        libreta.establecerPromedio();
        //si se envia como comentado el metodo las notas no pueden se recibidas 
        //y es imposible el calcular el promedio 
        libreta.establecerPromedioCualitativo();
        //si se envia como comentado el metodo lel promedio no puede ser recibido 
        //y las condicionales no pueden ejecutarse y no puede arrojar un mensaje
        System.out.printf("\n%s\n", libreta);
    
}
}
