package PROG05_Ejerc1;

import java.time.LocalDate;
import java.time.Period;

//@author Jhorman
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

    //Metodos Get del cual obtendremos datos de los atributos de esta clase.
    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNumKM() {
        return numKM;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public double getPrecio() {
        return precio;
    }

    //nos devolvera los años que tiene el coche.
    public int get_Anios() {

        LocalDate f1 = this.fechaMatriculacion;
        LocalDate f2 = LocalDate.now();

        Period p = Period.between(f1, f2);

        return p.getYears();

    }

    public String getDniPropietario() {
        return dniPropietario;
    }
    
    //metodos set que nos permitiran modificar o actualizar los datos de los atributos de esta clase.

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNumKM(int numKM) {
        this.numKM = numKM;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    @Override
    //Este metodo nos devolvera toda la informacion que tenemos de nuestro vehiculo
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula + ", numKM=" + numKM + ", fechaMatriculacion=" + fechaMatriculacion + ", descripcion=" + descripcion + ", precio=" + precio + ", nombrePropietario=" + nombrePropietario + ", dniPropietario=" + dniPropietario + '}';
    }

}
