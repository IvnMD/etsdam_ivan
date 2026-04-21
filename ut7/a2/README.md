<center>

# UT7-A2 Refactorización del código

</center>

***Nombre:*** Iván Mesa Domínguez, Sebastián Laya González  
***Curso:*** 1º DAM  

### Objetivo de la práctica

El objetivo de esta práctica es mejorar la calidad del código analizado en la práctica anterior aplicando técnicas de refactorización.

En la práctica anterior se identificaron diferentes “malos olores” (code smells), es decir, problemas relacionados con el diseño y la mantenibilidad del código.

En esta práctica se debe corregir esos problemas, manteniendo en todo momento el comportamiento original del programa.

⚠️ Importante:

    El programa debe seguir funcionando exactamente igual
    No se debe modificar la funcionalidad, solo la estructura interna del código

#### **Instrucciones de la práctica**

Se trabajará sobre el mismo programa de gestión de pedidos utilizado en la práctica anterior.

El programa ya funciona correctamente, pero presenta problemas de diseño que ahora deben ser corregidos mediante refactorización.

El objetivo es transformar el código para que sea:

    Más claro
    Más organizado
    Más fácil de mantener
    Más fácil de ampliar

#### **Trabajo a realizar**
1. Revisión inicial

    - Revisa la lista de problemas detectados en la práctica anterior
    - Decide qué mejoras vas a aplicar

2. Refactorización del código

 - Debes aplicar, como mínimo, las siguientes técnicas:

    - Renombrado
    - Sustituir nombres poco claros por nombres descriptivos
    - Mejorar la comprensión del código
    - Extracción de métodos
    - Dividir bloques de código largos
    - Crear métodos con una única responsabilidad
    - Eliminación de código duplicado
    - Detectar código repetido
    - Reutilizar lógica mediante métodos
    - Simplificación de condiciones
    - Reducir la complejidad de estructuras condicionales
    - Mejorar la legibilidad 
    - División de métodos largos
    - Evitar que toda la lógica esté concentrada en un único método
    - Organizar el código en partes más pequeñas
3. Mejora del diseño (recomendado)

 - Además de lo anterior, puedes mejorar:

    - La organización de clases
    - La separación de responsabilidades
    - La estructura general del programa

### Requisitos

    - El programa debe producir exactamente la misma salida que el original
    - No se puede eliminar ninguna funcionalidad
    - El código debe compilar y ejecutarse correctamente
    - Los cambios deben realizarse de forma progresiva

## Entregable

Debes entregar:
1. Código original

    - El código sin modificar (tal como se proporcionó en la práctica anterior)
2. Código refactorizado

    - Versión mejorada del programa
3. Documento explicativo

    - El documento debe incluir:

        - Lista de cambios realizados
        - Técnica de refactorización aplicada en cada caso
        - Justificación de cada mejora


#### Indicaciones

    - No se trata de rehacer el programa desde cero
    - Se deben aplicar pequeñas mejoras progresivas
    - Es recomendable probar el programa tras cada cambio

## Código a analizar

El código a analizar es el siguiente:
```java
import java.util.ArrayList;

class Producto {

    String n;
    double p;
    int c;

    public Producto(String n, double p, int c) {
        this.n = n;
        this.p = p;
        this.c = c;
    }
}

public class Tienda {

    public static void main(String[] args) {

        ArrayList<Producto> lista = new ArrayList<>();

        lista.add(new Producto("Teclado", 30, 2));
        lista.add(new Producto("Raton", 15, 3));
        lista.add(new Producto("Monitor", 200, 1));

        double total = 0;

        for (int i = 0; i < lista.size(); i++) {

            Producto p = lista.get(i);

            double subtotal = p.p * p.c;

            if (p.c > 2) {
                subtotal = subtotal - (subtotal * 0.1);
            }

            System.out.println("Producto: " + p.n);
            System.out.println("Precio: " + p.p);
            System.out.println("Cantidad: " + p.c);
            System.out.println("Subtotal: " + subtotal);

            if (subtotal > 100) {
                System.out.println("Envio gratis");
            } else {
                System.out.println("Envio: 5 euros");
                subtotal = subtotal + 5;
            }

            total = total + subtotal;

            System.out.println("-------------------");
        }

        System.out.println("TOTAL PEDIDO: " + total);

        if (total > 500) {
            System.out.println("Cliente VIP");
        }

    }
}
```
## Código modificado

```java
package com.example;

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

```

## ***Cambios realizados*** 

**1. Renombrado de variables**

- Los atributos `n`, `p` y `c` de la clase `Producto` se han renombrado a `nombre`, `precio` y `cantidad` para mejorar la legibilidad del código.

**2. Encapsulación**

- Los atributos de `Producto` pasan a ser `private` y se añaden getters (`getNombre`, `getPrecio`, `getCantidad`) para acceder a ellos de forma controlada.

**3. Eliminación de "números mágicos"**

- Los valores `0.1`, `5.0`, `100.0`, `500.0` y `2` se sustituyen por constantes con nombre (`descuento`, `costeEnvio`, `minimoEnvioGratis`, `minimoVip`, `cantidadMinimaDescuento`), lo que facilita entender su significado y modificarlos en el futuro.

**4. Mejora de la funcionalidad de producto (modelo no anémico)**

- Se añade el método `calcularSubtotal()` dentro de `Producto`, ya que es una operación que pertenece al propio producto y no debería estar en el `main`.

**5. Sustitución del bucle con índice por foreach**

- El bucle `for (int i = 0; i < lista.size(); i++)` se sustituye por `for (Producto producto : productos)`, que es más legible y elimina la variable de índice innecesaria.

**6. Extracción de método**

- Se extrae el método `mostrarDetallesProducto(Producto p, double subtotal)` para separar la lógica de presentación del flujo principal, reduciendo la longitud del `main` y aplicando el principio de responsabilidad única.

**7. Eliminación de código repetitivo**

- Los múltiples `System.out.println` relacionados con el producto se agrupan dentro del método `mostrarDetallesProducto`, eliminando la repetición en el `main`.

**8. Documentación con Javadoc**

- Se añaden comentarios Javadoc en los métodos y constantes más relevantes para facilitar la comprensión del código a otros desarrolladores.

**9. Clase anidada**

- `Producto` se define como clase anidada estática dentro de `Tienda` para poder tener todo el código en un único archivo sin necesidad de usar herencia.


## ***Conclusiones*** 

Tras aplicar las técnicas de refactorización, el programa mantiene exactamente el mismo comportamiento que el original pero con una estructura interna mucho más clara y mantenible.

Se ha comprobado que pequeñas mejoras progresivas, como renombrar variables, extraer métodos o eliminar , tienen un impacto significativo en la legibilidad y calidad del código.

Además, se ha visto la importancia de aplicar los cambios de forma gradual y verificar tras cada uno que el programa sigue funcionando correctamente, ya que cualquier modificación puede introducir errores si no se comprueba.

