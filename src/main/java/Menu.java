import domain.Comic;
import domain.Figura;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner keyboard;

    private ArrayList<Comic> catalagoComics;
    private ArrayList<Figura> catalogoFiguras;

    public Menu () {
        keyboard = new Scanner(System.in);
        catalagoComics = new ArrayList<>();
        catalogoFiguras = new ArrayList<>();
    }

    public void showMenu() {
        String choice;

        do {
            System.out.println("Tienda de Comics: ");
            System.out.println("1. Añadir Comics: ");
            System.out.println("2. Añadir Figura: ");
            System.out.println("3. Ver catalogo Comics: ");
            System.out.println("4. Ver catalogo Figuras: ");
            System.out.println("5. Modificar Comics: ");
            System.out.println("6. Modificar Figura: ");
            System.out.println("7. Borrar Comics: ");
            System.out.println("8. Borrar figura: ");
            System.out.println("s ó S. Salir");
            System.out.println("Opción: ");
            choice = keyboard.nextLine();

            switch (choice) {
                case "1":
                    addComics();
                    break;
                case "2":
                    addFigura();
                    break;
                case "3":
                    showComics();
                    break;
                case "4":
                    showFigura();
                    break;
                case "5":
                    //modifyTeam();
                    break;
                case "6":
                    //modifyPlayer();
                    break;
                case "7":
                    //modifyClothing();
                    break;
                case "8":
                    //showTeam();
                    break;
            }
        } while (!choice.equalsIgnoreCase("s"));
    }

    private void addComics() {
        System.out.print("Titulo : ");
        String titulo = keyboard.nextLine();
        System.out.print("Editorial : ");
        String editorial = keyboard.nextLine();
        System.out.print("Precio: ");
        float precio = keyboard.nextFloat();
        System.out.print("Número Páginas : ");
        int paginas = keyboard.nextInt();
        System.out.print("Categoria : ");
        String categoria = keyboard.nextLine();
        Comic comic = new Comic(titulo.trim(), editorial.trim(), precio, paginas, categoria.trim());
        catalagoComics.add(comic);
    }

    private void addFigura() {
        System.out.print("Personaje : ");
        String personaje = keyboard.nextLine();
        System.out.print("fabricante : ");
        String fabricante = keyboard.nextLine();
        System.out.print("Tamaño en cm : ");
        int altura = keyboard.nextInt();
        System.out.print("Precio: ");
        float precio = keyboard.nextFloat();
        Figura figura = new Figura(personaje.trim(), fabricante.trim(), altura, precio);
        catalogoFiguras.add(figura);
    }

    private void showComics() {
        for (Comic comic : catalagoComics) {
            System.out.println("Titulo: " + comic.getTitulo());
            System.out.println("Editorial: " + comic.getEditorial());
            System.out.println("Precio: " + comic.getPrecio() + "€");
            System.out.println("Número Páginas: " + comic.getPáginas());
            System.out.println("Categoria: " + comic.getCategoria());
        }
    }

    private void showFigura() {
        for (Figura figura : catalogoFiguras) {
            System.out.println("Personaje:  " + figura.getPersonaje());
            System.out.println("fabricante: " + figura.getFabricante());
            System.out.println("Tamaño: " + figura.getAltura() + "cm");
            System.out.println("Precio: " + figura.getPrecio() + "€");
        }
    }
}
