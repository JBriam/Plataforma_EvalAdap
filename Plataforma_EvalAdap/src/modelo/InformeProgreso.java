
package modelo;

import java.util.Date;

public class InformeProgreso {
    private int informeID;
    private int estudianteID;
    private String progreso;
    private Date fechaInforme;
    
    public InformeProgreso(){};

    public InformeProgreso(int informeID, int estudianteID, String progreso, Date fechaInforme) {
        this.informeID = informeID;
        this.estudianteID = estudianteID;
        this.progreso = progreso;
        this.fechaInforme = fechaInforme;
    }
    
    public InformeProgreso(int estudianteID, String progreso ){
       this.estudianteID = estudianteID;
       this.progreso = progreso;
       this.fechaInforme = new Date();
    }

    // Getters y setters
    public int getInformeID() { return informeID; }
    public void setInformeID(int informeID) { this.informeID = informeID; }
    public int getEstudianteID() { return estudianteID; }
    public void setEstudianteID(int estudianteID) { this.estudianteID = estudianteID; }
    public String getProgreso() { return progreso; }
    public void setProgreso(String progreso) { this.progreso = progreso; }
    public Date getFechaInforme() { return fechaInforme; }
    public void setFechaInforme(Date fechaInforme) { this.fechaInforme = fechaInforme; }
}


