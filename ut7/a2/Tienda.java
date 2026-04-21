package a2;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    /**
     * Coste de envío cuando no se alcanza el mínimo para envío gratis
     */
    private static final double costeEnvio = 5.0;
    /**
     * Subtotal mínimo para obtener envío gratis
     */
    private static final double minimoEnvioGratis = 100.0;
    /**
     * Total mínimo para ser considerado cliente VIP
     */
    private static final double minimoVip = 500.0;
    
    /**
     * Clase producto anidada en tienda para evitar herencias
     */
    static class Producto {

        /**
         * Porcentaje de descuento aplicado cuando la cantidad supera el mínimo
         */
        private static final double descuento = 0.1;
        /**
         * Cantidad mínima para aplicar descuento
         */
        private static final int cantidadMinimaDescuento = 2;

        private String nombre;
        private double precio;
        private int cantidad;

        /**
         * Constructor parametrico del producto
         * 
         * @param nombre   nombre del producto
         * @param precio   precio unitario
         * @param cantidad unidades pedidas
         */
        public Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        /**
         * Getters y setters
         */
        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        /**
         * Calcula el subtotal del producto.
         * Aplica un descuento si la cantidad supera el mínimo.
         * 
         * @return subtotal con o sin descuento
         */
        public double calcularSubtotal() {
            double subtotal = precio * cantidad;
            if (cantidad > cantidadMinimaDescuento) {
                subtotal -= subtotal * descuento;
            }
            return subtotal;
        }
    }

    /**
     * Muestra por consola los datos del producto y su subtotal.
     * 
     * @param p producto a mostrar
     * @param subtotal subtotal calculado
     */
    private static void mostrarDetallesProducto(Producto p, double subtotal) {
        System.out.println("Producto: " + p.getNombre());
        System.out.println("Precio: " + p.getPrecio());
        System.out.println("Cantidad: " + p.getCantidad());
        System.out.println("Subtotal: " + subtotal);
    }

    /**
     * Punto de entrada del programa.
     * Inicializa los productos, calcula el total del pedido y muestra el resultado.
     */
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Teclado", 30, 2));
        productos.add(new Producto("Raton", 15, 3));
        productos.add(new Producto("Monitor", 200, 1));

        double total = 0;

        for (Producto producto : productos) {
            double subtotal = producto.calcularSubtotal();
            double envio = 0;

            mostrarDetallesProducto(producto, subtotal);

            if (subtotal > minimoEnvioGratis) {
                System.out.println("Envio gratis");
            } else {
                System.out.println("Envio: 5 euros");
                envio = costeEnvio;
            }

            System.out.println("-------------------");

            total += subtotal + envio;
        }

        System.out.println("TOTAL PEDIDO: " + total);
        if (total > minimoVip) {
            System.out.println("Cliente VIP");
        }
    }
}