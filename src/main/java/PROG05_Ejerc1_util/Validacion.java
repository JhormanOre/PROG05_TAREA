package PROG05_Ejerc1_util;

import java.time.LocalDate;


 //@author Jhorman

/**
 * 
 * @author Jhorman
 * @version 2.0
 */
 /*Esta clase tendra metodos esticos que nos ayudaran a controlar los datos
que se ingresen cuando se cree o modifique un vehiculo*/
public class Validacion {

    /**
     * 
     * @param num Hace refencia al num de km.
     * @return devuelve tru si el numero de km es mayor que 0 me devolvera true de lo contraio false
     */
    public static boolean esPositivo(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param fecha fecha en que se matricula el coche 
     * @return nos devolvera true si la fecha es anterior a hoy y false si no lo es 
     */
    public static boolean fechaMayorHoy(LocalDate fecha) {

        LocalDate hoy = LocalDate.now();

        if (hoy.isBefore(fecha)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 
     * @param DNI dni del propietario del coche
     * @return nos devolvera true si el dni del propietario es uno oficial.
     */
    public static boolean validarDNI(String DNI) {

        if (DNI.length() != 9) {
            return false;
        }

        String DNInum = DNI.substring(0, DNI.length() - 1);
        char DNILetra = DNI.charAt(DNI.length() - 1);

        int numDNI;

        try {
            numDNI = Integer.parseInt(DNInum);
        } catch (NumberFormatException e) {
            return false;
        }

        if (!Character.isAlphabetic(DNILetra)) {
            return false;
        }

        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = numDNI % 23;

        char DNILetraNuevo = letrasNIF[resto];

        String DNINuevo = DNInum + DNILetraNuevo;

        if (DNI.equals(DNINuevo)) {
            return true;
        } else {
            return false;
        }

    }

}
