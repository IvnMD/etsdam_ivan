<center>

# UT6-A1 DISEÑO DE CASOS DE PRUEBA — FUNCIÓN CÁLCULO DE NOTA MEDIA

</center>

***Nombre:*** Iván Mesa Domínguez

***Curso:*** 1º DAM

### ÍNDICE

+ [Introducción](#id1)
+ [Objetivos](#id2)
+ [Material empleado](#id3)
+ [Desarrollo](#id4)
+ [Conclusiones](#id5)


#### ***Introducción***. <a name="id1"></a>

En el desarrollo de software, las pruebas son una fase fundamental del ciclo de vida de una aplicación. Antes de implementar pruebas automatizadas, es necesario analizar el comportamiento esperado del programa y diseñar los casos de prueba que permitirán verificar su correcto funcionamiento.

Una **caso de prueba** es un conjunto de condiciones o variables bajo las cuales se determinará si un sistema funciona correctamente. Los casos de prueba se clasifican en tres tipos principales:

- **Casos normales:** verifican el comportamiento esperado con entradas válidas y representativas.
- **Casos límite:** comprueban el comportamiento en los extremos del rango de valores permitidos.
- **Casos erróneos:** validan que el sistema gestiona correctamente entradas inválidas o situaciones de error.

En esta actividad se analiza una función que calcula la **nota media aritmética** de un alumno a partir de una lista de calificaciones comprendidas entre 0 y 10.


#### ***Objetivos***. <a name="id2"></a>

- Analizar el comportamiento esperado de una función de cálculo de nota media.
- Identificar las situaciones que deben ser verificadas mediante pruebas.
- Diseñar una tabla completa de casos de prueba que cubra los escenarios normales, límite y erróneos.
- Aplicar criterios de calidad en el diseño de pruebas de software.


#### ***Material empleado***. <a name="id3"></a>

**Software:**
- Especificación funcional de la función `calcular_media(calificaciones)`

**Especificación de la función analizada:**

| Parámetro | Descripción |
|---|---|
| Entrada | Lista de números (calificaciones del alumno) |
| Rango válido | Cada nota debe estar entre 0 y 10 (inclusive) |
| Salida | Media aritmética de las calificaciones |
| Error — lista vacía | Si la lista no contiene elementos, se indica que no es posible calcular la media |
| Error — valor inválido | Si alguna nota no es numérica o está fuera del rango, se produce un error de validación |

**Ejemplos de funcionamiento proporcionados:**

| Entrada | Resultado esperado |
|---|---|
| [6, 7, 8] | 7 |
| [10, 9, 8, 7] | 8.5 |
| [] | Error |
| [5, 12] | Error |
| [7, "a", 5] | Error |


#### ***Desarrollo***. <a name="id4"></a>

Tras analizar las especificaciones de la función, se han identificado los siguientes escenarios:

1. Listas con varias calificaciones válidas y resultado entero o decimal.
2. Listas con un único elemento en los valores extremos del rango (0 y 10).
3. Lista que combina el valor mínimo y máximo permitidos.
4. Lista vacía sin elementos.
5. Lista con una nota superior al máximo permitido (> 10).
6. Lista con una nota inferior al mínimo permitido (< 0).
7. Lista con un valor no numérico.

Tabla de casos de prueba:

| ID | ENTRADA | RESULTADO ESPERADO | TIPO DE CASO |
|---|---|---|---|
| CP1 | [6, 7, 8] | 7 | Caso normal |
| CP2 | [10, 9, 8, 7] | 8.5 | Caso normal |
| CP3 | [5, 5, 5, 5] | 5 | Caso normal |
| CP4 | [0] | 0 | Caso límite |
| CP5 | [10] | 10 | Caso límite |
| CP6 | [0, 10] | 5 | Caso límite |
| CP7 | [] | Error: lista vacía | Caso erróneo |
| CP8 | [5, 12] | Error: nota fuera de rango | Caso erróneo |
| CP9 | [7, "a", 5] | Error: valor no numérico | Caso erróneo |
| CP10 | [-1, 5, 8] | Error: nota fuera de rango | Caso erróneo |

**Justificación de cada caso:**

- **CP1:** Verifica el caso más común: lista con varias notas válidas y media con resultado entero.
- **CP2:** Verifica que la función calcula correctamente medias con resultado decimal.
- **CP3:** Comprueba que la media es correcta cuando todas las notas son iguales.
- **CP4:** Prueba el valor mínimo permitido (0) como único elemento de la lista.
- **CP5:** Prueba el valor máximo permitido (10) como único elemento de la lista.
- **CP6:** Combina los valores extremos del rango para verificar el cálculo en los límites.
- **CP7:** Verifica que la función gestiona correctamente una lista vacía.
- **CP8:** Comprueba que se detecta una nota por encima del rango permitido (12 > 10).
- **CP9:** Valida que la función rechaza valores no numéricos en la lista.
- **CP10:** Comprueba que se detecta una nota por debajo del rango permitido (-1 < 0).


#### ***Conclusiones***. <a name="id5"></a>

El diseño de casos de prueba es una tarea analítica que requiere comprender en profundidad la especificación del programa antes de escribir una sola línea de código de test.

En esta actividad se ha comprobado que una función aparentemente sencilla como el cálculo de la nota media requiere al menos **9 casos de prueba** para ser verificada, cubriendo el comportamiento habitual, los valores límite y las situaciones de error.
