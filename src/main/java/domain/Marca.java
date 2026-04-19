/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Nacho
 */
public class Marca {
    
    private String nombre; //simple definicion de atributos
    private String pais;

    public Marca(String nombre, String pais) { //constructor de objetos tipo Marca
        this.nombre = nombre;
        this.pais = pais;
    }

    public Marca (String nombre){
    this.nombre=nombre;
}
    
    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
