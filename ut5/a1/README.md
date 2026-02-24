<center>

# Diagrama de Casos de Uso – Plataforma de Reservas Online Deportivas


</center>

***Nombre:*** Iván Mesa  
***Curso:*** 1º DAM  

### ÍNDICE

+ [Introducción](#id1)
+ [Objetivos](#id2)
+ [Material empleado](#id3)
+ [Desarrollo](#id4)
+ [Conclusiones](#id5)


#### ***Introducción***. <a name="id1"></a>

En esta práctica trabajamos el modelado del sistema mediante el diagrama de casos de uso UML. Esta técnica nos permite identificar los actores que interactúan con el sistema y las funcionalidades que ofrece, sin entrar en detalles de implementación. El sistema a modelar es una plataforma web que gestiona las reservas de instalaciones deportivas municipales (pistas de pádel, polideportivas, piscinas, salas de musculación, etc.).

#### ***Objetivos***. <a name="id2"></a>

- Identificar todos los actores que interactúan con la plataforma (ciudadano y administrador).  
- Descubrir y describir los casos de uso principales que cubren los requisitos funcionales del sistema.  
- Establecer las relaciones include/extend entre casos de uso cuando sea necesario.  
- Generar un diagrama de casos de uso UML correctamente etiquetado y exportable.  

#### ***Material empleado***. <a name="id3"></a>

- **Hardware:** portátil personal.  
- **Software:**  
  - Editor de texto plano (VS Code) con extensión PlantUML.  
  - Navegador web para previsualizar el diagrama.  
  - Herramienta online [PlantUML Server](https://plantuml.com/es/plantuml-online) para exportar el gráfico a PNG/SVG/PDF.  

#### ***Desarrollo***. <a name="id4"></a>
![FotoPortada] (img/IMG_9153.PNG)

1. **Análisis del enunciado**  
   Leí detenidamente el texto proporcionado y subrayé cada acción que debían realizar los usuarios y los administradores.

2. **Identificación de actores**  
   - *Ciudadano:* se registra, consulta disponibilidad, reserva y cancela.  
   - *Administrador:* gestiona instalaciones y usuarios.

3. **Identificación de casos de uso**  
   Registrarse, Iniciar sesión, Modificar perfil, Consultar disponibilidad, Realizar reserva, Cancelar reserva, Añadir instalación, Modificar instalación, Desactivar instalación, Listar usuarios, Bloquear usuario, Enviar email de confirmación.

4. **Relaciones**  
   - «include» desde *Realizar reserva* y *Cancelar reserva* hacia *Enviar email confirmación*.  
   - Se añadió una nota en *Cancelar reserva* para indicar la restricción de 24 h.

#### ***Conclusiones***. <a name="id5"></a>

El diagrama de casos de uso nos ha permitido visualizar de forma clara y rápida qué puede hacer cada tipo de usuario sin adentrarnos en la lógica interna del sistema. PlantUML resulta una herramienta ágil para generar estos diagramas cuando aún no se dispone de software de modelado pesado. Como mejora futura podríamos añadir un tercer actor (invitado) o detallar más casos de uso secundarios, pero para el alcance de esta actividad el modelo generado cubre todos los requisitos funcionales especificados.
![Diagrama] (img/UT5-A1_diagrama.png)
