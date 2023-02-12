package PROG05_Ejerc1_util;

import java.time.LocalDate;


 //@author Jhorman
 /*La clase validacion tendra metodos esticos que nos ayudaran a controlar los datos
que se ingresen cuando se cree o modifique un vehiculo*/
public class Validacion {

    //Este metodo controla si el numero ingresado es mayor que 0 devolviendo un true si es mayor y false si es menor.
    public static boolean esPositivo(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    //El metodo "fechaMAyorHoy" nos permitira saber si 
    public static boolean fechaMayorHoy(LocalDate fecha) {

        LocalDate hoy = LocalDate.now();

        if (hoy.isBefore(fecha)) {
            return true;
        } else {
            return false;
        }

    }

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
