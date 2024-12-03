/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

public class Estudiante {
    private int estudianteID;
    private String nombre;
    private int edad;
    private String nivelAcademico;
    private Date fechaInscripcion;

    // Constructor, getters y setters
    
    public Estudiante(){};
    
    public Estudiante( int estudianteID, String nombre, int edad, String nivelAcademico, Date fechaInscripcion) {
        this.estudianteID = estudianteID;
        this.nombre = nombre;
        this.edad = edad;
        this.nivelAcademico = nivelAcademico;
        this.fechaInscripcion = fechaInscripcion;
    }



    // Getters
    public int getEstudianteID() {
        return estudianteID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    // Setters
    public void setEstudianteID(int estudianteID) {
        this.estudianteID = estudianteID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "estudianteID=" + estudianteID +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nivelAcademico='" + nivelAcademico + '\'' +
                ", fechaInscripcion=" + fechaInscripcion +
                '}';
    }
    
}

