package Models;

public class Libro {

    private String titulo = "";
    private String autor = "";
    private int anioPublicacion = 0;
    private double precio = 0;

    // metodo set titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // metodo get titulo

    public String getTitulo(){
        return this.titulo;
    }

    //metodo set autor
    public void setAutor(String autor){
        this.autor = autor;

    }

    //metodo get autor
    public String getAutor(){
        return this.autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", precio=" + precio +
                '}';
    }




}
