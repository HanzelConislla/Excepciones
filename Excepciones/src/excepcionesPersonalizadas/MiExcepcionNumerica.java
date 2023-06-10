/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author Estudiante
 */
public class MiExcepcionNumerica extends Exception{
    
    private final static String Mensaje = ""
            + "Error de conversion numerica, "
            + "Ingresa un texto que contenga un numero ";

    public MiExcepcionNumerica() {
        super(Mensaje);
    }
    
    
}
