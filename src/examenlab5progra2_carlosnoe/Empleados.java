package examenlab5progra2_carlosnoe;

import java.util.Date;
import java.util.Random;

public class Empleados extends Usuarios {

    public String Carrera;
    public String PuestoLaboral;
    public int AnioTrabaj;

    public Empleados(String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento, String NumeroIdentidad) {
        super(Nombre, Apellido, Contrasenya, FechaNacimiento, Sexo, Departamento, NumeroIdentidad);
        NumeroDeIdentidad();
    }

    public Empleados(String Carrera, String PuestoLaboral, int AnioTrabaj, String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento) {
        super(Nombre, Apellido, Contrasenya, FechaNacimiento, Sexo, Departamento);
        this.Carrera = Carrera;
        this.PuestoLaboral = PuestoLaboral;
        this.AnioTrabaj = AnioTrabaj;
        NumeroDeIdentidad();
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getPuestoLaboral() {
        return PuestoLaboral;
    }

    public void setPuestoLaboral(String PuestoLaboral) {
        this.PuestoLaboral = PuestoLaboral;
    }

    public int getAnioTrabaj() {
        return AnioTrabaj;
    }

    public void setAnioTrabaj(int AnioTrabaj) {
        this.AnioTrabaj = AnioTrabaj;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getContrasenya() {
        return Contrasenya;
    }

    public void setContrasenya(String Contrasenya) {
        this.Contrasenya = Contrasenya;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getNumeroIdentidad() {
        return NumeroIdentidad;
    }

    public void setNumeroIdentidad(String NumeroIdentidad) {
        this.NumeroIdentidad = NumeroIdentidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Carrera= " + Carrera + "\n"
                + "PuestoLaboral= " + PuestoLaboral + "\n"
                + "AnioTrabaj= " + AnioTrabaj;
    }

    @Override
    public void NumeroDeIdentidad() {
        Random random = new Random();
        int primeros = 0;
        int Segundos = random.nextInt(10000/*minimo*/, 99999/*Maximo*/);
        int DiaFecha = this.FechaNacimiento.getYear();
        int Nacional = 0;

        if (this.Departamento.equalsIgnoreCase("Francisco Morazan")) {
            Nacional = 1;
            primeros = random.nextInt(01/*minimo*/, 28/*Maximo*/);
        } else if (this.Departamento.equalsIgnoreCase("Cortes")) {
            Nacional = 2;
            primeros = random.nextInt(01/*minimo*/, 12/*Maximo*/);
        } else if (this.Departamento.equalsIgnoreCase("Comayagua")) {
            Nacional = 3;
            primeros = random.nextInt(01/*minimo*/, 21/*Maximo*/);
        }
        String nom = "0" + String.valueOf(Nacional) + String.valueOf(primeros) + String.valueOf(DiaFecha ) + String.valueOf(Segundos);
        this.NumeroIdentidad=nom;  
    }
    

}
