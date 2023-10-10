package pe.integrador.optisprout.modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaRiegoAspersion implements Calculable{
    private List<Aspersor> aspersores;
    private Disposicion disposicion;
    private int tiempo;

    public SistemaRiegoAspersion() {
        this.aspersores = new ArrayList<>();
    }

    public SistemaRiegoAspersion(Disposicion disposicion, int tiempo) {
        this();
        this.disposicion = disposicion;
        this.tiempo = tiempo;
    }

    public Disposicion getDisposicion() {
        return disposicion;
    }

    public void setDisposicion(Disposicion disposicion) {
        this.disposicion = disposicion;
    }
    

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public SistemaRiegoAspersion addAspersores(Aspersor aspersor){
        this.aspersores.add(aspersor);
        return this;
    }

    @Override
    public String calcularDistanciaOptima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularCantidadAgua() {
        double cantidad;
        double caudalTotal = 0.0;
        for(Aspersor asp : this.aspersores){
            caudalTotal += asp.getCaudalAspersor();
        }
        return cantidad = this.aspersores.size() * caudalTotal * this.tiempo;
    }

    public double calcularDistanciaEntreAspersores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

    
}
