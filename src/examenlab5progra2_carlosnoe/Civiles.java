package examenlab5progra2_carlosnoe;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Civiles extends Usuarios{
    ArrayList<Tramites>tramites= new ArrayList();
    
    
    public Civiles(String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento, int NumeroIdentidad) {
        super(Nombre, Apellido, Contrasenya, FechaNacimiento, Sexo, Departamento, NumeroIdentidad);
    }

    public Civiles(String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento) {
        super(Nombre, Apellido, Contrasenya, FechaNacimiento, Sexo, Departamento);
    }
    
    

    public ArrayList<Tramites> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramites> tramites) {
        this.tramites = tramites;
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
        return super.toString()+"\n"
                + "tramites= " + tramites ;
                
    }
    
    @Override
    public int NumeroDeIdentidad(){
        Random random= new Random();
        int randi = random.nextInt(1/*minimo*/,999/*Maximo*/);

     return 0;           
    }
    
    //Numero de identidad Primeros 2 numeros == 01 si es Francsico Morazan, 02 si es Cortes 03 si es comayagua
    //Segundos 2 numeros random del 01 al 28 si es de Franscisco Morazan, 01 y 12 si es cortes y 01 y 21 si es Comayagua
    // Segunos Cuartro digitos el Anio
    // y los ultimos 5 son random se debe validar que el numero no sea igual al entre otros
}
