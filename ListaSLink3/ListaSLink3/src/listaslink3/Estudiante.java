/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaslink3;

/**
 *
 * @author Usuario
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private char sexo;
    private String programaEstudia;

    public Estudiante(String nombre, int edad, char sexo, String programaEstudia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.programaEstudia = programaEstudia;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getProgramaEstudia() {
        return programaEstudia;
    }

    public void setProgramaEstudia(String programaEstudia) {
        this.programaEstudia = programaEstudia;
    }

}
