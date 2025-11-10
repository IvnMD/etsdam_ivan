<center>



# Análisis comparativo de modelos de desarrollo de software y reflexión sobre la gestión de fallos y cambios.

</center>

***Nombre: Iván Mesa Dominguez***  
***Curso:1º DAM***  

---
# Índice

1. [Análisis comparativo de modelos de desarrollo de software](#análisis-comparativo-de-modelos-de-desarrollo-de-software)
   - 1.1. [Definición Principal](#definición-principal)
   - 1.2. [Características Clave / Enfoque](#características-clave--enfoque)
   - 1.3. [Ventajas (Pros)](#ventajas-pros)
   - 1.4. [Desventajas (Contras)](#desventajas-contras)
   - 1.5. [Aportación en la Actualidad](#aportación-en-la-actualidad)

2. [Reflexión sobre la detección y corrección de fallos y cambios](#reflexión-sobre-la-detección-y-corrección-de-fallos-y-cambios)
   - 2.1. [Manejo de la corrección de fallos y cambios en diferentes modelos](#manejo-de-la-corrección-de-fallos-y-cambios-en-diferentes-modelos)
   - 2.2. [Papel de la Fase de Mantenimiento](#papel-de-la-fase-de-mantenimiento)

## Parte 1: Analisis comparativo de modelos de desarollo de software.

| Característica/Aspecto                      | Modelos Clásicos (Predictivos)                                         | Modelos Evolutivos o Incrementales                                     | Metodologías Ágiles (Adaptativas)                                  |
|---------------------------------------------|----------------------------------------------------------------------|----------------------------------------------------------------------|------------------------------------------------------------------|
| **Definición Principal**                    | Modelos rígidos que siguen un enfoque lineal para el desarrollo de software. | Modelos que desarrollan el software en fases sucesivas y refinadas.  | Modelos flexibles que permiten adaptaciones frecuentes y rápidas. |
| **Características Clave / Enfoque**        | Secuencial y cerrado. Las fases deben completarse antes de avanzar. | Iteración y refinamiento continuo basado en la retroalimentación del usuario. | Enfoque en la colaboración y iteraciones con entregas frecuentes. |
| **Ventajas (Pros)**                         | Planificación clara y definición anticipada de requisitos.           | Permite adaptaciones y correcciones frecuentes durante el desarrollo. | Respuesta rápida a cambios y énfasis en la satisfacción del cliente. |
| **Desventajas (Contras)**                   | Rigidez ante cambios y dificultad para gestionar requisitos no claros. | Puede resultar en entregas parciales que no siempre cumplen las expectativas. | Requiere un alto nivel de colaboración y puede ser caótico sin una buena gestión. |
| **Aportación en la Actualidad**            | Utilizada en proyectos con requisitos estables y bien definidos.      | Útil para desarrollos donde los requisitos evolucionan con el tiempo. | Preferida en entornos dinámicos donde la flexibilidad es crucial. |

---

## Reflexión sobre la detección y corrección de fallos y cambios

### Manejo de la corrección de fallos y cambios en diferentes modelos

Los modelos de desarrollo de software abordan la corrección de fallos y la incorporación de cambios de maneras distintas, dependiendo de su naturaleza:

- **Modelo en Cascada con Realimentación**: Este modelo permite ciertas correcciones mediante la retroalimentación entre etapas. Si se detecta un fallo en una fase tardía, el modelo permite "volver atrás" para realizar ajustes. Sin embargo, esta flexibilidad tiene límites y, en proyectos con muchos cambios, el costo puede ser alto.

- **Modelos Evolutivos o Incrementales**: Facilitan la "refinación en sucesivas versiones". Cada iteración permite incorporar cambios basados en la retroalimentación del usuario, lo que posibilita una adaptación rápida y efectiva. Aquí, las pruebas y ajustes se ejecutan en cada ciclo, permitiendo un desarrollo más ajustado a las necesidades reales.

- **Metodologías Ágiles**: Con su enfoque en la adaptación, las metodologías ágiles enfatizan la "respuesta ante el cambio". A través de iteraciones (sprints) y pequeñas mejoras continuas como en XP (eXtreme Programming), se permite una revisión periódica que facilita la corrección de fallos y la incorporación de cambios. Los equipos pueden iterar con frecuencia, mejorando el software con base en comentarios inmediatos.

### Papel de la Fase de Mantenimiento

La fase de mantenimiento es fundamental para la corrección de defectos y la adaptación del software a nuevas situaciones. Se clasifica en:

- **Mantenimiento Correctivo**: Se enfoca en resolver errores identificados y corregir fallos que afectan la funcionalidad del software. Este aspecto es crucial, ya que un software puede tener problemas no detectados hasta su uso en producción.

- **Mantenimiento Evolutivo y Adaptativo**: Consiste en realizar cambios que no son correcciones de errores, sino mejoras o adaptaciones a nuevas necesidades y requisitos. Esto es vital en un entorno donde los requerimientos pueden cambiar frecuentemente, garantizando que el software siga siendo relevante y útil a lo largo de su vida útil.

Este enfoque asegura que el desarrollo de software no solo se limite a la creación inicial, sino que se extienda a su gestión continua, considerando la necesidad de adaptaciones y mejoras en un mundo tecnológico en constante cambio.
