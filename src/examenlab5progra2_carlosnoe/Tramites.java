package examenlab5progra2_carlosnoe;

import java.util.Date;

public class Tramites {
    public String Nombre;
    public String Descripcion;
    public Date FechaSoli;
    public int NumeroI;

    public Tramites(String Nombre, String Descripcion, Date FechaSoli, int NumeroI) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.FechaSoli = FechaSoli;
        this.NumeroI = NumeroI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaSoli() {
        return FechaSoli;
    }

    public void setFechaSoli(Date FechaSoli) {
        this.FechaSoli = FechaSoli;
    }

    public int getNumeroI() {
        return NumeroI;
    }

    public void setNumeroI(int NumeroI) {
        this.NumeroI = NumeroI;
    }

    @Override
    public String toString() {
        return "Nombre= " + Nombre + "\n"
                + "Descripcion= " + Descripcion + "\n"
                + "FechaSoli= " + FechaSoli + "\n"
                + "NumeroI=" + NumeroI;
    }

    
    
    
}
