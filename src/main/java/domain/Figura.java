package domain;

import java.util.SplittableRandom;

public class Figura {

    private String personaje;
    private String fabricante;
    private int altura;
    private float precio;

    public Figura(String personaje, String fabricante, int altura, float precio) {
        this.personaje = personaje;
        this.fabricante = fabricante;
        this.altura = altura;
        this.precio = precio;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
