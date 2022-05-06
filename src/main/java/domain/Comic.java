package domain;

public class Comic {

    private String titulo;
    private String editorial;
    private float precio;
    private int páginas;
    private String categoria;

    public Comic () {

    }

    public Comic(String titulo, String editorial, float precio, int páginas, String categoria) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.precio = precio;
        this.páginas = páginas;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPáginas() {
        return páginas;
    }

    public void setPáginas(int páginas) {
        this.páginas = páginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
