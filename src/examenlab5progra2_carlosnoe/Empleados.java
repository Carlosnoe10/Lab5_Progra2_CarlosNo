package examenlab5progra2_carlosnoe;

import java.util.Date;

public class Empleados extends Usuarios{
    
    public String Carrera;
    public String PuestoLaboral;
    public int AnioTrabaj;
    
    public Empleados(String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento, int NumeroIdentidad) {
        super(Nombre, Apellido, Contrasenya, FechaNacimiento, Sexo, Departamento, NumeroIdentidad);
    }

    public Empleados(String Carrera, String PuestoLaboral, int AnioTrabaj, String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento) {
        super(Nombre, Apellido, Contrasenya, FechaNacimiento, Sexo, Departamento);
        this.Carrera = Carrera;
        this.PuestoLaboral = PuestoLaboral;
        this.AnioTrabaj = AnioTrabaj;
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

    public int getNumeroIdentidad() {
        return NumeroIdentidad;
    }

    public void setNumeroIdentidad(int NumeroIdentidad) {
        this.NumeroIdentidad = NumeroIdentidad;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"
                + "Carrera= " + Carrera + "\n"
                + "PuestoLaboral= " + PuestoLaboral + "\n"
                + "AnioTrabaj= " + AnioTrabaj ;
    }
    
    @Override
    public int NumeroDeIdentidad(){
        return 0;
    }
    
    
}
