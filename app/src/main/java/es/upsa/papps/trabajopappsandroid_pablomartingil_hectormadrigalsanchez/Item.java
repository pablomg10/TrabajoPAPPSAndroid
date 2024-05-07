package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;

public class Item {
    String name;
    String provincia;
    int imagen;

    public Item(String name, String provincia, int imagen) {
        this.name = name;
        this.provincia = provincia;
        this.imagen = imagen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
