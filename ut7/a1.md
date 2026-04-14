<center>

# UT7-A1 Identificación de “malos olores” en el código

</center>

***Nombre:*** Iván Mesa Domínguez, Sebastián Laya González  
***Curso:*** 1º DAM  

### ÍNDICE

+ [Introducción](#id1)
+ [Objetivos](#id2)
+ [Material empleado](#id3)
+ [Desarrollo](#id4)
+ [Conclusiones](#id5)

#### ***Introducción***. <a name="id1"></a>

En el desarrollo de software, no solo es importante que un programa funcione correctamente, sino también que esté bien diseñado y sea fácil de mantener. Para ello, existen conceptos como los *“code smells”* o “malos olores”, que son indicios de problemas en la calidad del código.

Estos problemas no suelen provocar errores directamente, pero sí dificultan la comprensión, mantenimiento y evolución del programa. Detectarlos permite aplicar técnicas de refactorización, que consisten en mejorar la estructura interna del código sin modificar su comportamiento externo.

Este enfoque está relacionado con los principios de Clean Code, que promueven la creación de código claro, sencillo y mantenible.

En esta práctica se analiza un programa en Java que simula la gestión de pedidos, con el objetivo de identificar estos problemas de calidad.

---

#### ***Objetivos***. <a name="id2"></a>

El objetivo de esta práctica es analizar un programa que funciona correctamente pero cuya calidad de código es mejorable.

Se realiza un análisis del código para detectar “malos olores” (code smells), los cuales indican posibles mejoras en el diseño mediante refactorización.

En esta práctica no se debe modificar el código, ya que el trabajo consiste únicamente en analizarlo y debatir sobre su calidad.

---

#### ***Instrucciones de la práctica***

Se proporciona un programa sencillo que simula un sistema básico de gestión de pedidos.

El programa realiza varias operaciones:

- Almacena una lista de productos  
- Calcula el precio de cada producto en función de su cantidad  
- Aplica un descuento en algunos casos  
- Calcula el coste de envío  
- Calcula el total del pedido  

Aunque el programa funciona correctamente, su código presenta diversos problemas de diseño y calidad.

El objetivo de la práctica es analizar el código para identificar esos problemas.

---

#### ***Material empleado***. <a name="id3"></a>

**Hardware:**
- Ordenador personal  

**Software:**
- Entorno de desarrollo Java (VS Code)  

**Configuración:**
- Ejecución local del programa Java  

---

#### ***Desarrollo***. <a name="id4"></a>

En esta práctica se ha analizado un programa Java que gestiona productos, calcula subtotales, aplica descuentos, añade gastos de envío y calcula el total de un pedido.

Tras revisar el código, se han identificado los siguientes problemas:

**1. Nombres de variables poco descriptivos**

Las variables de la clase `Producto` (`n`, `p`, `c`) no indican claramente su significado, lo que dificulta la comprensión del código.

**2. Falta de encapsulación**

Los atributos de la clase `Producto` son públicos (o accesibles directamente), lo que permite modificarlos sin control.

**3. Clase con poca funcionalidad (modelo anémico)**

La clase `Producto` solo contiene datos y no incluye métodos que gestionen su propio comportamiento.

**4. Método `main` demasiado largo**

Toda la lógica del programa está dentro del método `main`, lo que dificulta su lectura y mantenimiento.

**5. Mezcla de responsabilidades**

El código mezcla:
- lógica de negocio (cálculos)
- presentación (impresiones por consola)

Esto incumple el principio de responsabilidad única (Single Responsibility Principle - SRP).

**6. Uso de números mágicos**

Aparecen valores sin explicación en el código:
- 0.1 (descuento)
- 5 (coste de envío)
- 100 (envío gratis)
- 500 (cliente VIP)

Esto dificulta entender y modificar el programa.

**7. Código repetitivo**

Se repiten múltiples instrucciones `System.out.println`, lo que hace el código más largo e innecesariamente redundante.

**8. Uso de bucle poco adecuado**

Se utiliza un bucle `for` con índice en lugar de un `foreach`, que sería más legible.

**9. Lógica compleja dentro del bucle**

El bucle contiene demasiadas operaciones (cálculo, condiciones, impresión), lo que dificulta su comprensión.

**10. Falta de comentarios**

El código no contiene explicaciones, lo que dificulta entender su funcionamiento a otros desarrolladores.

**11. Baja escalabilidad**

El diseño actual hace difícil añadir nuevas funcionalidades, como diferentes tipos de descuento o reglas de envío.

**12. Alto acoplamiento**

La clase principal accede directamente a los atributos de `Producto`, lo que genera dependencia fuerte entre clases.

Durante el análisis no se han encontrado errores de ejecución, pero sí múltiples problemas relacionados con la calidad del código.

Muchos de los problemas detectados pueden resolverse aplicando patrones de refactorización como renombrar variables, extraer métodos o eliminar código duplicado.

---

#### ***Conclusiones***. <a name="id5"></a>

Tras realizar esta práctica, se concluye que un programa puede funcionar correctamente pero aun así tener un diseño deficiente.

Se ha comprobado la importancia de:
- Utilizar nombres claros  
- Separar responsabilidades  
- Evitar código duplicado  
- Mejorar la estructura del programa  

Detectar “malos olores” es fundamental para mejorar la calidad del software y facilitar su mantenimiento y ampliación en el futuro.

Además, se ha comprobado que estos problemas pueden resolverse mediante técnicas de refactorización, las cuales permiten mejorar la estructura interna del código sin modificar su comportamiento externo.

No obstante, la refactorización debe realizarse de forma controlada y preferiblemente con pruebas, ya que cualquier cambio en el código puede introducir errores si no se verifica correctamente.

