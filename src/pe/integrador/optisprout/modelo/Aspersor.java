package pe.integrador.optisprout.modelo;

public class Aspersor {

    private int idAspersor;
    private int radioAlcance;
    private double caudalAspersor;
    private static int ultimoId;

    public Aspersor() {
        this.idAspersor = ++ultimoId;
    }

    public Aspersor(int radioAlcance, double caudalAspersor) {
        this();
        this.radioAlcance = radioAlcance;
        this.caudalAspersor = caudalAspersor;
    }

    public int getIdAspersor() {
        return idAspersor;
    }

    public void setIdAspersor(int idAspersor) {
        this.idAspersor = idAspersor;
    }

    public int getRadioAlcance() {
        return radioAlcance;
    }

    public void setRadioAlcance(int radioAlcance) {
        this.radioAlcance = radioAlcance;
    }

    public double getCaudalAspersor() {
        return caudalAspersor;
    }

    public void setCaudalAspersor(double caudalAspersor) {
        this.caudalAspersor = caudalAspersor;
    }

   

    public double calcularPluviometria() {
        double pp = 3600 * (caudalAspersor / (Math.PI * (radioAlcance * radioAlcance)));
        return pp;
    }

    @Override
    public String toString() {
        return "Información de Aspersores: "
                + "\nidAspersor= " + idAspersor
                + "\nradioAlcance= " + radioAlcance
                + "\ncaudalAspersor= " + caudalAspersor
                + "\nPluviometría= " + calcularPluviometria();
    }

   
}
