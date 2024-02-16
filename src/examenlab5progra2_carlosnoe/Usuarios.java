package examenlab5progra2_carlosnoe;

import java.util.Date;

abstract public class Usuarios {

    public String Nombre;
    public String Apellido;
    public String Contrasenya;
    public Date FechaNacimiento;
    public String Sexo;
    public String Departamento;
    public int NumeroIdentidad;

    public Usuarios(String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento, int NumeroIdentidad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Contrasenya = Contrasenya;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
        this.Departamento = Departamento;
        this.NumeroIdentidad = NumeroIdentidad;
    }

    public Usuarios(String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Contrasenya = Contrasenya;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
        this.Departamento = Departamento;
    }

    public int NumeroDeIdentidad(){
        return 0;
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

    public int getNumeroIdentidad() {
        return NumeroIdentidad;
    }

    public void setNumeroIdentidad(int NumeroIdentidad) {
        this.NumeroIdentidad = NumeroIdentidad;
    }

    @Override
    public String toString() {
        return "Nombre= " + Nombre + "\n"
                + "Apellido= " + Apellido + "\n"
                + "Contrasenya= " + Contrasenya + "\n"
                + "FechaNacimiento= " + FechaNacimiento + "\n"
                + "Sexo= " + Sexo + ""
                + "Departamento= " + Departamento + "\n"
                + "NumeroIdentidad= " + NumeroIdentidad;
    }

}