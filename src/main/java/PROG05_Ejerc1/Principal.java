
package PROG05_Ejerc1;

import PROG05_Ejerc1_util.Validacion;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jhorman
 * @version 2.0
 */
/*Es nuestra clase principal donde ejecutaremos el programa donde pondremos la 
informacion de un Vehiculo y modificar esa informacion.*/
public class Principal {

    //Metodo main punto donde iniciara a ejecutarse y finalizara nuestro programa.
    
    public static void main(String[] args) {

        //Instanciamos un objeto de tipo scanner que usara el teclado como entrada de datos. 
        Scanner sn = new Scanner(System.in);
        //Con este comando evitaremos tener futuros problemas con espacios
        sn.useDelimiter("\n");
        //PAra no tener problemas si colocamos . como decimal
        sn.useLocale(Locale.US);

        boolean salir = false;
        int opcion;
        Vehiculo v = null;

        String marca, matricula, descripcion, nombreProp, DNIProp;
        int km = 0, km_new, dia, mes, anio;
        double precio;
        LocalDate fechaMatriculacion;

        //mintras que salir no sea "true" no saldremos del bucle
        while (!salir) {

            try {
                System.out.println("1. Nuevo Vehiculo.");
                System.out.println("2. Ver Matrícula.");
                System.out.println("3. Ver Número de Kilómetros.");
                System.out.println("4. Actualizar Kilómetros.");
                System.out.println("5. Ver años de antigüedad.");
                System.out.println("6. Mostrar propietario.");
                System.out.println("7. Mostrar descripción.");
                System.out.println("8. Mostrar Precio.");
                System.out.println("9. Salir.");
                System.out.print("Elige una opcion: ");
                opcion = sn.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("\nCreando vehiculo...");
                        System.out.print("Introduce la marca: ");
                        marca = sn.next();

                        System.out.print("Introduce la matricula: ");
                        matricula = sn.next();

                        System.out.print("Introduce el numero de km: ");
                        km = sn.nextInt();

                        if (!Validacion.esPositivo(km)) {
                            throw new Exception("\nkm no es positivo\n");
                        }

                        System.out.println("Introduce fecha de matriculacion");
                        System.out.print("dia: ");
                        dia = sn.nextInt();
                        System.out.print("mes: ");
                        mes = sn.nextInt();
                        System.out.print("año: ");
                        anio = sn.nextInt();

                        fechaMatriculacion = LocalDate.of(anio, mes, dia);

                        if (Validacion.fechaMayorHoy(fechaMatriculacion)) {
                            throw new Exception("\nfecha matriculacion es mayor que hoy\n");
                        }

                        System.out.print("Introduce la descripcion: ");
                        descripcion = sn.next();

                        System.out.print("Introduce el nombre del propietario: ");
                        nombreProp = sn.next();

                        System.out.print("Introduce el dni del propietario: ");
                        DNIProp = sn.next();

                        if (!Validacion.validarDNI(DNIProp)) {
                            throw new Exception("\nDNI no valido\n");
                        }

                        System.out.print("Introduce el precio: ");
                        precio = sn.nextDouble();

                        v = new Vehiculo(marca, matricula, km, fechaMatriculacion, descripcion, precio, nombreProp, DNIProp);
                        System.out.println("\n¡¡¡Vehiculo creado exitosamente!!!\n");

                        break;

                    case 2:
                        if (v != null) {
                            System.out.println("\nMatricula: " + v.getMatricula() + "\n");
                        } else {
                            System.out.println("\nNo se ha encontrado informacion de ningun vehiculo.Primero debe crear un vehiculo\n");
                        }
                        break;

                    case 3:

                        if (v != null) {
                            System.out.println("\nKM: " + v.getNumKM() + "\n");
                        } else {
                            System.out.println("\nNo se ha encontrado informacion de ningun vehiculo.Primero debe crear un vehiculo\n");
                        }
                        break;

                    case 4:

                        if (v != null) {

                            System.out.println("\nActualizando km, el nuevo km debe ser mayor al actual \"" + km + "km.\"");
                            System.out.print("km nuevo: ");

                            km_new = sn.nextInt();

                            if (!Validacion.esPositivo(km_new)) {
                                throw new Exception("\nkm debe ser positivo\n");
                            }
                            if (km_new > km) {
                                v.setNumKM(km_new);
                                km=v.getNumKM();
                                System.out.println("\n¡¡¡Los KM han sido actualizados exitosamente!!!\n");
                            } else {
                                throw new Exception("\nkm no actualizado.El km debe ser mayor al km actual.\n");
                            }

                        } else {
                            System.out.println("\nNo se ha encontrado informacion de ningun vehiculo.Primero debe crear un vehiculo\n");
                        }

                        break;

                    case 5:

                        if (v != null) {
                            System.out.println("\nAntiguedad: " + v.get_Anios() + " años.\n");
                        } else {
                            System.out.println("\nNo se ha encontrado informacion de ningun vehiculo.Primero debe crear un vehiculo\n");
                        }

                        break;

                    case 6:

                        if (v != null) {
                            System.out.println("\nPropietario:\nnombre: " +v.getNombrePropietario()+ "\nDNI: "+v.getDniPropietario() + "\n");
                        } else {
                            System.out.println("\nNo se ha encontrado informacion de ningun vehiculo.Primero debe crear un vehiculo\n");
                        }
                        break;

                    case 7:

                        if (v != null) {
                            System.out.println("\nDescripcion: " + v.getDescripcion());
                            System.out.println("Matricula: " + v.getMatricula());
                            System.out.println("KM: " + v.getNumKM() + "\n");
                        } else {
                            System.out.println("\nNo se ha encontrado informacion de ningun vehiculo.Primero debe crear un vehiculo\n");
                        }

                        break;

                    case 8:

                        if (v != null) {
                            System.out.println("\nPrecio: " + v.getPrecio() + " €\n");
                        } else {
                            System.out.println("\nNo se ha encontrado informacion de ningun vehiculo.Primero debe crear un vehiculo\n");
                        }
                        break;

                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("\nElige una opcion entre 1 y 9\n");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

}
