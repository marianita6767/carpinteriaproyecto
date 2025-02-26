/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author adso 2846960
 */
public class Cliente {
    private int codigo;
    private String identificación;
    private int número;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    
 
    
public Cliente(){
this.codigo = 0;
this.identificación = "";
this.número = 0;
this.nombre = "";
this.apellido = "";
this.telefono = "";
this.direccion = "";

}

    public Cliente(int codigo, String identificación, int número, String nombre, String apellido, String telefono, String direccion) {
        this.codigo = codigo;
        this.identificación = identificación;
        this.número = número;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}






