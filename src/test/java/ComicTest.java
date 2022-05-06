import domain.Comic;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class ComicTest {

    private static Comic comicA;
    private static Comic comicB;

    @BeforeAll
    public static void setup() {
        comicA = new Comic("La muerte de Lobezno", "Marvel", 10.25f, 110, "Superheroes");
        comicB = new Comic("La muerte de Lobezno", "Marvel", 10.25f, 110, "Superheroes");
    }

    @Test
    public void getTitulo() {
        String titulo = comicA.getTitulo();
        assertEquals(comicB.getTitulo(), titulo);
    }

    @Test
    public void getEditorial() {
        String editorial = comicA.getEditorial();
        assertEquals(comicB.getEditorial(), editorial);
    }

    public void getPrecio() {
        float precio = comicA.getPrecio();
        assertEquals(comicB.getPrecio(), precio);
    }

    public void getPaginas() {
        int paginas = comicA.getPáginas();
        assertEquals(comicB.getPáginas(), paginas);
    }

    public void getCategoria() {
        String categoria = comicA.getCategoria();
        assertEquals(comicB.getCategoria(), categoria);
    }
}
