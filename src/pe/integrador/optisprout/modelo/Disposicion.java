package pe.integrador.optisprout.modelo;

public class Disposicion implements Marcos{
    private String mensaje = "Para la disposición %s: ";
    private String tipo = "Triangular";
    private Aspersor aspersor;

    public Disposicion(String tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    @Override
    public double distanciaEntreLinea() {
        return switch (tipo.toLowerCase()) {
            case "cuadrado" -> aspersor.getRadioAlcance() * 1.4;
            case "rectangular" -> aspersor.getRadioAlcance() * 1.3;
            case "triangular" -> aspersor.getRadioAlcance() * 1.5;
            default -> 0.0;
        };
    }
    
    @Override
    public double distanciaMismaLinea() {
        return switch (tipo.toLowerCase()) {
            case "cuadrado" -> aspersor.getRadioAlcance() * 1.4;
            case "rectangular" -> aspersor.getRadioAlcance() * 1.4;
            case "triangular" -> aspersor.getRadioAlcance() * 1.7;
            default -> 0.0;
        };
    }

    @Override
    public double superficieRiego() {
        return this.distanciaEntreLinea() * this.distanciaMismaLinea();
    }    
    
}
