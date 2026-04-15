import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotasTest {

    @Test
    void testMediaSimple() {
        assertEquals(7, CalculadoraNotas.calcularMedia(new int[] { 6, 7, 8 }));
    }

    @Test
    void testMediaDecimal() {
        assertEquals(8.5, CalculadoraNotas.calcularMedia(new int[] { 10, 9, 8, 7 }));
    }

    @Test
    void testListaVacia() {
        IllegalArgumentException excepcion = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraNotas.calcularMedia(new int[] {});
        });
        assertEquals("Lista vacía", excepcion.getMessage());
    }

    @Test
    void testNotaFueraRango() {
        IllegalArgumentException excepcion = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraNotas.calcularMedia(new int[] { 11 });
        });
        assertEquals("Nota fuera de rango", excepcion.getMessage());

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraNotas.calcularMedia(new int[] { -2 });
        });
        assertEquals("Nota fuera de rango", excepcion.getMessage());
    }

}