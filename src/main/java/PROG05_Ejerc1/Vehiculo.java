package PROG05_Ejerc1;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @author Jhorman
 * @version 2.0 
 */
/*Creamos clase Vehiculo que tendra los atributos que nos serviran para completar la informacion de un Vehiculo
y con sus metodos modificaremos y obtendremos esa informacion*/
public class Vehiculo {

    //Atributos de la clase Vehiculo
    private String marca;
    private String matricula;
    private int numKM;
    private LocalDate fechaMatriculacion;
    private String descripcion;
    private double precio;
    private String nombrePropietario;
    private String dniPropietario;

    //Metodo constructor vacio
    public Vehiculo() {
    }

    //Metodo contructor que actualizara todos los atributos de esta clase.
    /**
     *
     * @param marca Marca del vehiculo que estamos creando
     * @param matricula Matricula del vehiculo que estamos creando
     * @param numKM Numero de km que tiene en estos momentos el vehiculo
     * @param fechaMatriculacion Fecha de matriculacion del coche
     * @param descripcion descripciones del vehiculo
     * @param precio precio del vehiculo
     * @param nombrePropietario nombre propietario del vehiculo
     * @param dniPropietario DNI del propietario del vehiculo
     */
    public Vehiculo(String marca, String matricula, int numKM, LocalDate fechaMatriculacion, String descripcion, double precio, String nombrePropietario, String dniPropietario) {
        this.marca = marca;
        this.matricula = matricula;
        this.numKM = numKM;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombrePropietario = nombrePropietario;
        this.dniPropietario = dniPropietario;
    }

    /**
     *
     * @return devuelve la marca del vehiculo
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @return devuelve la matricula del vehiculo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @return Devuelve el km actual del vehiculo
     */
    public int getNumKM() {
        return numKM;
    }

    /**
     *
     * @return devuelve la fecha de metriculacion del vehiculo creado
     */
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    /**
     *
     * @return devuelve una descripcion sobre el vehiculo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @return devuelve el nombre del propietario del vehiculo
     */
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     *
     * @return devuelve el precio del vehiculo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @return devuelve años que tiene el vehiculo de antiguedad.
     */
    public int get_Anios() {

        LocalDate f1 = this.fechaMatriculacion;
        LocalDate f2 = LocalDate.now();

        Period p = Period.between(f1, f2);

        return p.getYears();

    }

    /**
     *
     * @return devuelve el dni del propietario el coche.
     */
    public String getDniPropietario() {
        return dniPropietario;
    }

    /**
     *
     * @param marca Actualiza la marca del Vehiculo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @param matricula Actualiza la matricula del vehiculo.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     *
     * @param numKM Actualiza los km del vehiculo.
     */
    public void setNumKM(int numKM) {
        this.numKM = numKM;
    }

    /**
     *
     * @param fechaMatriculacion actualiza la fecha de matriculacion del
     * vehiculo.
     */
    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    /**
     *
     * @param descripcion Actualiza la descripcion del vehiculo
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @param precio actualiza el precio del vehiculo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @param nombrePropietario Actualiza el nombre del propietario del
     * vehiculo.
     */
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    /**
     *
     * @param dniPropietario Actualiza el dni del propietario del Vehiculo.
     */
    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    /**
     *
     * @return devuelve una cadena de texto con toda la informacion del vehiculo.
     */
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula + ", numKM=" + numKM + ", fechaMatriculacion=" + fechaMatriculacion + ", descripcion=" + descripcion + ", precio=" + precio + ", nombrePropietario=" + nombrePropietario + ", dniPropietario=" + dniPropietario + '}';
    }

}
