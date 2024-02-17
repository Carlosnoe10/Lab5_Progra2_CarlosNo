package examenlab5progra2_carlosnoe;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.management.StringValueExp;

public class Civiles extends Usuarios {

    ArrayList<Tramites> tramites = new ArrayList();

    public Civiles(String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento, String NumeroIdentidad) {
        super(Nombre, Apellido, Contrasenya, FechaNacimiento, Sexo, Departamento, NumeroIdentidad);
    NumeroDeIdentidad();
    }

    public Civiles(String Nombre, String Apellido, String Contrasenya, Date FechaNacimiento, String Sexo, String Departamento) {
        super(Nombre, Apellido, Contrasenya, FechaNacimiento, Sexo, Departamento);
        NumeroDeIdentidad();
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

    public String getNumeroIdentidad() {
        return NumeroIdentidad;
    }

    public void setNumeroIdentidad(String NumeroIdentidad) {
        this.NumeroIdentidad = NumeroIdentidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "tramites= " + tramites;

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

    //Numero de identidad Primeros 2 numeros == 01 si es Francsico Morazan, 02 si es Cortes 03 si es comayagua
    //Segundos 2 numeros random del 01 al 28 si es de Franscisco Morazan, 01 y 12 si es cortes y 01 y 21 si es Comayagua
    // Segunos Cuartro digitos el Anio
    // y los ultimos 5 son random se debe validar que el numero no sea igual al entre otros
}
