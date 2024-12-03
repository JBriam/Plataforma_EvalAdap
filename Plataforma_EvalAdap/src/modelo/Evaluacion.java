
package modelo;

public class Evaluacion {
    private int evaluacionID;
    private int estudianteID;
    private String resultadosAnteriores;
    private double tiempoPromedioRespuesta;
    private String dificultadPercibida;

    // Constructor
    public Evaluacion(){};
    
    public Evaluacion(int evaluacionID, int estudianteID, String resultadosAnteriores, 
                      double tiempoPromedioRespuesta, String dificultadPercibida) {
        this.evaluacionID = evaluacionID;
        this.estudianteID = estudianteID;
        this.resultadosAnteriores = resultadosAnteriores;
        this.tiempoPromedioRespuesta = tiempoPromedioRespuesta;
        this.dificultadPercibida = dificultadPercibida;
    }
    
    public Evaluacion( int estudianteID, String resultadosAnteriores, 
                      double tiempoPromedioRespuesta, String dificultadPercibida) {
        
        this.estudianteID = estudianteID;
        this.resultadosAnteriores = resultadosAnteriores;
        this.tiempoPromedioRespuesta = tiempoPromedioRespuesta;
        this.dificultadPercibida = dificultadPercibida;
    }

    // Getters
    public int getEvaluacionID() {
        return evaluacionID;
    }

    public int getEstudianteID() {
        return estudianteID;
    }

    public String getResultadosAnteriores() {
        return resultadosAnteriores;
    }

    public double getTiempoPromedioRespuesta() {
        return tiempoPromedioRespuesta;
    }

    public String getDificultadPercibida() {
        return dificultadPercibida;
    }

    // Setters
    public void setEvaluacionID(int evaluacionID) {
        this.evaluacionID = evaluacionID;
    }

    public void setEstudianteID(int estudianteID) {
        this.estudianteID = estudianteID;
    }

    public void setResultadosAnteriores(String resultadosAnteriores) {
        this.resultadosAnteriores = resultadosAnteriores;
    }

    public void setTiempoPromedioRespuesta(double tiempoPromedioRespuesta) {
        this.tiempoPromedioRespuesta = tiempoPromedioRespuesta;
    }

    public void setDificultadPercibida(String dificultadPercibida) {
        this.dificultadPercibida = dificultadPercibida;
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "evaluacionID=" + evaluacionID +
                ", estudianteID=" + estudianteID +
                ", resultadosAnteriores='" + resultadosAnteriores + '\'' +
                ", tiempoPromedioRespuesta=" + tiempoPromedioRespuesta +
                ", dificultadPercibida='" + dificultadPercibida + '\'' +
                '}';
    }
}
