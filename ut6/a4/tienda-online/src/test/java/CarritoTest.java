

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.CarritoService;
import com.example.Producto;


public class CarritoTest {

     CarritoService servicio;

    @BeforeEach
    void setUp() {
        servicio = new CarritoService();
    }

    @Test
    void testSubtotalVariosProductos() {
        List<Producto> carrito = List.of(
            new Producto("teclado", 30, 2),
            new Producto("raton", 10, 1)
        );
        double resultado = servicio.calcularSubtotal(carrito);
        assertEquals(70.0, resultado, 0.001,"El subtotal debe ser precio*cantidad para cada producto sumado");
    }

    @Test
    void testSubtotalUnProducto() {
        List<Producto> carrito = List.of(new Producto("monitor", 200, 3));
        double resultado = servicio.calcularSubtotal(carrito);
        assertEquals(600.0, resultado, 0.001,"El subtotal de un producto debe ser precio * cantidad");
    }

    @Test
    void testSubtotalCarritoVacio() {
        double resultado = servicio.calcularSubtotal(Collections.emptyList());
        assertEquals(0.0, resultado, 0.001,"Un carrito vacío debe tener subtotal 0");
    }

    @Test
    void testSubtotalCantidadUno() {
        List<Producto> carrito = List.of(new Producto("auriculares", 50, 1));
        double resultado = servicio.calcularSubtotal(carrito);
        assertEquals(50.0, resultado, 0.001,"Con cantidad 1 el subtotal debe ser igual al precio");
    }

    @Test
    void testDescuentoCero() {
        double resultado = servicio.aplicarDescuento(100.0, 0);
        assertEquals(100.0, resultado, 0.001, "Con descuento 0% el precio no debe cambiar");
    }

    @Test
    void testDescuentoValido() {
        double resultado = servicio.aplicarDescuento(100.0, 10);
        assertEquals(90.0, resultado, 0.001, "Un descuento del 10% sobre 100 debe dar 90");
    }

    @Test
    void testDescuentoCienPorciento() {
        double resultado = servicio.aplicarDescuento(100.0, 100);
        assertEquals(0.0, resultado, 0.001, "Un descuento del 100% debe dejar el precio en 0");
    }

    @Test
    void testDescuentoNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
            () -> servicio.aplicarDescuento(100.0, -5), "Un descuento negativo debe lanzar IllegalArgumentException");
    }

    @Test
    void testDescuentoMayorDe100LanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
            () -> servicio.aplicarDescuento(100.0, 150),"Un descuento mayor de 100 debe lanzar IllegalArgumentException");
    }


    @Test
    void testEnvioSubtotalMenor100() {
        double resultado = servicio.calcularEnvio(99.99);
        assertEquals(5.0, resultado, 0.001,"Subtotales por debajo de 100 deben tener envío de 5€");
    }

    @Test
    void testEnvioSubtotalExactamente100() {
        double resultado = servicio.calcularEnvio(100.0);
        assertEquals(0.0, resultado, 0.001, "Un subtotal de exactamente 100€ debe tener envío gratis");
    }

    @Test
    void testEnvioSubtotalMayor100() {
        double resultado = servicio.calcularEnvio(150.0);
        assertEquals(0.0, resultado, 0.001,"Subtotales superiores a 100€ deben tener envío gratis");
    }



    @Test
    void testTotalSinDescuentoConEnvio() {
        List<Producto> carrito = List.of(new Producto("raton", 10, 1));
        double resultado = servicio.calcularTotal(carrito, 0);
        assertEquals(15.0, resultado, 0.001, "Total sin descuento con envío debe ser subtotal + 5");
    }

    @Test
    void testTotalConDescuentoEnvioGratis() {

        List<Producto> carrito = List.of(
            new Producto("teclado", 30, 2),
            new Producto("raton", 10, 1)
        );
        double resultado = servicio.calcularTotal(carrito, 10);
        assertEquals(68.0, resultado, 0.001, "Total con 10% descuento sobre 70€ más 5€ de envío debe ser 68€");
    }

    @Test
    void testTotalEnvioGratis() {
        List<Producto> carrito = List.of(new Producto("portatil", 200, 1));
        double resultado = servicio.calcularTotal(carrito, 0);
        assertEquals(200.0, resultado, 0.001,"Un pedido de 200€ sin descuento debe tener envío gratis");
    }
}
