
package modelo;

public class Proveedor {
   private int id_proveedor;
   private String nombre;
   private String correo_electronico;
   private String telefono;
   private String direccion;
   private int id_inventario;
   
   
public Proveedor(){
    this.id_proveedor = 0;
    this.nombre = "";
    this.correo_electronico = "";
    this.telefono = "";
    this.id_inventario= 0; 
    
     
 }

    public Proveedor(int id_proveedor, String nombre, String correo_electronico, String telefono, String direccion, int id_inventario) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id_inventario = id_inventario;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
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

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }




}
