
package modelo;

import java.util.Date;

public class ExamenAdaptado {
    private int examenID;
    private int evaluacionID;
    private String examenAdaptado;
    private Date fechaExamen;

    
    public ExamenAdaptado(){};
    
    // Constructor, getters y setters
    public ExamenAdaptado(int evaluacionID, String examenAdaptado) {
        this.evaluacionID = evaluacionID;
        this.examenAdaptado = examenAdaptado;
        this.fechaExamen = new Date(); // Establece la fecha de examen a la fecha actual
    }

    public ExamenAdaptado(int examenID, int evaluacionID, String examenAdaptado, Date fechaExamen) {
        this.examenID = examenID;
        this.evaluacionID = evaluacionID;
        this.examenAdaptado = examenAdaptado;
        this.fechaExamen = fechaExamen;
    }
        
    

    // Getters
    public int getExamenID() {
        return examenID;
    }

    public int getEvaluacionID() {
        return evaluacionID;
    }

    public String getExamenAdaptado() {
        return examenAdaptado;
    }

    public Date getFechaExamen() {
        return fechaExamen;
    }

    public void setExamenID(int examenID) {
        this.examenID = examenID;
    }

    public void setEvaluacionID(int evaluacionID) {
        this.evaluacionID = evaluacionID;
    }

    public void setExamenAdaptado(String examenAdaptado) {
        this.examenAdaptado = examenAdaptado;
    }

    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    @Override
    public String toString() {
        return "ExamenAdaptado{" +
                "examenID=" + examenID +
                ", evaluacionID=" + evaluacionID +
                ", examenAdaptado='" + examenAdaptado + '\'' +
                ", fechaExamen=" + fechaExamen +
                '}';
    }
}


