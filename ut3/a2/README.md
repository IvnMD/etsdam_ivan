<center>

# Análisis comparativo de entornos de desarrollo (IDE) para C++ [UT3-A2 Elige tu IDE ideal (actividad para escenario telemático)]

</center>

***Nombre: Iván Mesa Dominguez***  
***Curso: 1º DAM***  

---

### ÍNDICE

+ [Introducción](#id1)
+ [Objetivos](#id2)
+ [Material empleado](#id3)
+ [Desarrollo](#id4)
+ [Conclusiones](#id5)

---

#### ***Introducción***. <a name="id1"></a>

En el ámbito de la programación en C++, existen numerosos entornos de desarrollo integrados (IDE) que facilitan la escritura, depuración y gestión de proyectos.  
Esta práctica tiene como finalidad analizar distintos IDE utilizados en el desarrollo con C++ para poder seleccionar el más adecuado según las necesidades del equipo de trabajo.  
Los IDE son herramientas fundamentales que permiten optimizar el tiempo de desarrollo, mejorar la productividad y reducir errores gracias a funciones como el autocompletado, la depuración o la refactorización de código.

---

#### ***Objetivos***. <a name="id2"></a>

- Analizar y comparar varios entornos de desarrollo utilizados para programar en C++.  
- Evaluar sus características, ventajas e inconvenientes.  
- Seleccionar el IDE más adecuado para el trabajo en equipo en un proyecto de C++.  
- Justificar la elección final en base a criterios técnicos y prácticos.

---

#### ***Material empleado***. <a name="id3"></a>

**Hardware:**
- Ordenador patata  

**Software:**
- Sistema operativo: Ubuntu 20.04 y Windows 11.  
- Google
- IDE analizados:  
  1. **Visual Studio Code**  
  2. **CLion (JetBrains)**  
  3. **Visual Studio Community**  

---

#### ***Desarrollo***. <a name="id4"></a>

Para realizar la comparación, se elaboró una tabla con los criterios más relevantes: soporte de lenguajes, consumo de recursos, facilidad de instalación, funciones destacadas, interfaz, comunidad y licencia.

| **Criterio** | **Visual Studio Code** | **CLion (JetBrains)** | **Visual Studio (Community)** |
|---------------|------------------------|------------------------|-------------------------------|
| **Lenguajes principales que soporta** | Multilenguaje (C, C++, Python, JavaScript, etc.) | C y C++ (también soporta Python o Rust con plugins) | C, C++, C#, F#, entre otros |
| **Peso o consumo de recursos** | Ligero, depende de las extensiones | Medio-alto, por el análisis de código | Alto, requiere bastantes recursos |
| **Facilidad de instalación** | Muy fácil, multiplataforma | Fácil, disponible para Windows, Linux y macOS | Muy fácil, pero enfocado a Windows |
| **Funciones destacadas** | Depuración mediante extensiones, integración con Git, autocompletado, terminal integrada | Refactorización avanzada, análisis estático, soporte para CMake y testing | Depurador potente, integración con MSVC, herramientas de profiling |
| **Interfaz / usabilidad** | Sencilla, moderna y personalizable | Profesional y centrada en C++ | Completa pero algo recargada |
| **Comunidad y soporte** | Muy amplia, gran cantidad de extensiones | Soporte de JetBrains y comunidad activa | Gran comunidad, documentación oficial |
| **Licencia / coste** | Gratuito y open source | De pago (con prueba gratuita y licencias educativas) | Gratuito para uso individual o educativo |


---

#### ***Conclusiones***. <a name="id5"></a>

Tras realizar el análisis, considero que **CLion** es el IDE más adecuado para trabajar en **C++**, especialmente si el proyecto es multiplataforma y utiliza **CMake**.  
Su sistema de análisis de código, refactorización avanzada y depuración integrada ofrecen una experiencia muy completa y profesional.  
Aunque Visual Studio Code es gratuito y ligero, requiere configurar varias extensiones para alcanzar el mismo nivel de funcionalidad.  
Visual Studio, por su parte, es ideal en entornos Windows, pero su consumo de recursos puede ser una limitación en otros sistemas.  

El criterio que más he valorado ha sido la **calidad del soporte para C++** y la **eficiencia del entorno**, ya que en este lenguaje la productividad depende en gran medida de la ayuda que el IDE brinda al programador.  
En conclusión, **CLion** ofrece el equilibrio más adecuado entre rendimiento, usabilidad y soporte para proyectos en C++.

![Logo de CLion](img/Clion.svg)
