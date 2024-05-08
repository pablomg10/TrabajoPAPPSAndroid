package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;
public class Restaurante {
    private String nombre;
    private String direccion;
    private String descripcion;
    private int imagen;

    public Restaurante(String nombre, String direccion, String descripcion, int imagen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
