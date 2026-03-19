# UT6-A2 Introducción a las pruebas en Java con JUnit

### Objetivo de la práctica

El objetivo de esta práctica es aprender a comprobar el funcionamiento de un programa utilizando diferentes técnicas de prueba:

1. pruebas manuales
2. comprobaciones con de resultados
3. pruebas automatizadas con `JUnit`

### Descripción del programa

Se proporciona una función que calcula la **nota media de un alumno** a partir de una lista de calificaciones.

Las reglas que debe cumplir la función son:

- Recibe una lista de números.
- Cada nota debe estar entre **0 y 10**.
- Devuelve la **media aritmética** de las notas.
- Si la lista está vacía se debe producir un **error**.
- Si una nota no es válida se debe producir un **error**.

```java
public class CalculadoraNotas {

    public static double calcularMedia(int[] notas) {

        if(notas.length == 0){
            throw new IllegalArgumentException("Lista vacía");
        }

        int suma = 0;

        for(int nota : notas){

            if(nota < 0 || nota > 10){
                throw new IllegalArgumentException("Nota fuera de rango");
            }

            suma += nota;
        }

        return suma / notas.length;
    }
}
```

### Pruebas manuales

Crea un pequeño programa llamado `Main.java` que utilice la función `calcular_media` y prueba distintos casos.

Debes comprobar al menos:

- varias notas

- una sola nota

- lista vacía

- nota fuera de rango

Usa la función `System.out.println()` para observar los resultados. Ejemplo:

```java
if(CalculadoraNotas.calcularMedia(new int[]{6,7,8}) != 7){
    System.out.println("Error en el cálculo de la media");
}
```


Inserta el código del programa aquí:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Pruebas manuales de CalculadoraNotas ===\n");

        // --- Varias notas ---
        System.out.println("Caso 1 — Varias notas: [6, 7, 8]");
        if (CalculadoraNotas.calcularMedia(new int[]{6, 7, 8}) != 7) {
            System.out.println("  ERROR: se esperaba 7");
        } else {
            System.out.println("  OK: resultado = 7.0");
        }

        // --- Varias notas con media decimal ---
        System.out.println("\nCaso 2 — Varias notas con decimal: [10, 9, 8, 7]");
        if (CalculadoraNotas.calcularMedia(new int[]{10, 9, 8, 7}) != 8.5) {
            System.out.println("  ERROR: se esperaba 8.5");
        } else {
            System.out.println("  OK: resultado = 8.5");
        }

        // --- Una sola nota ---
        System.out.println("\nCaso 3 — Una sola nota: [5]");
        if (CalculadoraNotas.calcularMedia(new int[]{5}) != 5) {
            System.out.println("  ERROR: se esperaba 5");
        } else {
            System.out.println("  OK: resultado = 5.0");
        }

        // --- Lista vacía (debe lanzar excepción) ---
        System.out.println("\nCaso 4 — Lista vacía: []");
        try {
            CalculadoraNotas.calcularMedia(new int[]{});
            System.out.println("  ERROR: debería haber lanzado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("  OK: excepción capturada → " + e.getMessage());
        }

        // --- Nota fuera de rango (debe lanzar excepción) ---
        System.out.println("\nCaso 5 — Nota fuera de rango: [5, 12]");
        try {
            CalculadoraNotas.calcularMedia(new int[]{5, 12});
            System.out.println("  ERROR: debería haber lanzado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("  OK: excepción capturada → " + e.getMessage());
        }

        // --- Nota negativa (debe lanzar excepción) ---
        System.out.println("\nCaso 6 — Nota negativa: [-1, 5, 8]");
        try {
            CalculadoraNotas.calcularMedia(new int[]{-1, 5, 8});
            System.out.println("  ERROR: debería haber lanzado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("  OK: excepción capturada → " + e.getMessage());
        }

        System.out.println("\n=== Fin de las pruebas manuales ===");
    }
}
```

Adjunta una captura de pantalla de la terminal de:

+ Varias notas:

![](/daw/img/img/001.png)

+ Una sola nota:

![](/daw/img/img/002.png)

+ Lista vacía

![](/daw/img/img/003.png)

+ Nota fuera de rango

![](/daw/img/img/004.png)

### Tests con **JUnit**

Crea una clase llamada `CalculadoraNotasTest.java`, debes implementar **al menos 5 tests**, incluyendo:

+ cálculo correcto de media

+ media con decimales

+ lista vacía

+ nota fuera de rango

Ejemplo de test:

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotasTest {

    @Test
    void testMediaSimple(){
        assertEquals(7, CalculadoraNotas.calcularMedia(new int[]{6,7,8}));
    }

}
```

Inserta el código del programa aquí con todos los tests:

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotasTest {

    @Test
    void testMediaSimple() {
        // [6, 7, 8] → media = 7.0
        assertEquals(7.0, CalculadoraNotas.calcularMedia(new int[]{6, 7, 8}));
    }

    @Test
    void testMediaConDecimales() {
        // [10, 9, 8, 7] → media = 8.5
        assertEquals(8.5, CalculadoraNotas.calcularMedia(new int[]{10, 9, 8, 7}));
    }

    @Test
    void testMediaUnaSolaNota() {
        // Una sola nota → la media es la propia nota
        assertEquals(5.0, CalculadoraNotas.calcularMedia(new int[]{5}));
    }

    @Test
    void testListaVacia() {
        assertThrows(IllegalArgumentException.class,
                () -> CalculadoraNotas.calcularMedia(new int[]{}));
    }

    @Test
    void testNotaFueraDeRango() {
        assertThrows(IllegalArgumentException.class,
                () -> CalculadoraNotas.calcularMedia(new int[]{5, 12}));
    }

    @Test
    void testNotaNegativa() {
        assertThrows(IllegalArgumentException.class,
                () -> CalculadoraNotas.calcularMedia(new int[]{-1, 5, 8}));
    }

    @Test
    void testNotasEnLimitesExtremos() {
        // 0 y 10 son valores válidos → media = 5.0
        assertEquals(5.0, CalculadoraNotas.calcularMedia(new int[]{0, 10}));
    }
}
```


Ejecuta los tests desde tu **IDE**, si todos los tests son correctos debe aparecer un resultado similiar a:

### Ejecución de los tests

Para poder ejecutar los tests debes tener **JUnit** configurado en tu proyecto.

Puedes ejecutar los tests desde tu IDE (IntelliJ, Eclipse o Visual Studio Code) usando la opción "Run Test" o el panel de testing.

> En Visual Studio Code, asegúrate de tener instalada la extensión "Extension Pack for Java". 
Los tests se pueden ejecutar desde el botón "Run Test" que aparece encima de cada método.


```
Tests run: 5
Tests passed: 5
```
### Reflexión final

Responde a las siguientes preguntas:

- ¿Todos tus tests pasan correctamente?

Sí, los 7 tests pasan correctamente una vez corregido el error del código original.

- En caso de que alguno falle, explica por qué.

Con el código original (tipo de retorno `int`), el test `testMediaConDecimales` habría fallado porque
`[10, 9, 8, 7]` devuelve `8` en lugar de `8.5`. La división entera en Java trunca el resultado hacia
cero, por lo que `34 / 4` da `8` y no `8.5`.

- ¿Has detectado algún error en el código proporcionado? Explica cuál es.

Sí. El código original declaraba la función con tipo de retorno `int`:

```java
public static int calcularMedia(int[] notas) {
    ...
    return suma / notas.length;   // división entera: 34/4 = 8, no 8.5
}
```

En Java, dividir dos valores `int` siempre produce un `int` (truncando el decimal).
Para devolver resultados correctos con decimales se necesitan dos cambios:

1. Cambiar el tipo de retorno de `int` a `double`.
2. Añadir un cast explícito en la división para forzar aritmética de coma flotante.

```java
public static double calcularMedia(int[] notas) {
    ...
    return (double) suma / notas.length;   // 34.0/4 = 8.5 ✓
}
```

### Entrega

Debes entregar a traves de tu repositorio de **GitHub** los siguientes archivos:

- Este archivo `README.md` con las capturas de pantalla e inserciones de  solicitadas.
- El archivo `CalculadoraNotas.java`
- El archivo `Main.java`
- El archivo `CalculadoraNotasTest.java`

