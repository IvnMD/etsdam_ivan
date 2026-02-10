# TITULO Y/ ENCABEZADOS
## CON CADA "\#" EXTRA
### EL TEXTO SE VUELVE MAS PEQUEÑO,
### Y MAS PEQUEÑO
#### Y MAS PEQUEÑO,
##### Y ASI
###### HASTA 6 VECES

También puedes cerrar los encabezados con el mismo número de almohadillas, por ejemplo escribiendo \"### Encabezado 3 \###". Pero la única finalidad de esto es un motivo estético.

Tambien se puede hacer con usando "=" debajo del primer encabezado
===
Y  "-" para el segundo encabezado (maximo 2 niveles con este metodo
-

### Citas

Las citas se generar utilizando el carácter mayor que ">" al comienzo del bloque de texto:
> “El fútbol es como el ajedrez, pero sin dados”. - Lukas Podolski

Si la cita se compone de varias lineas o parrafos, hay que escribir ">" delante de cada linea:
> Creo que los animales ven en el hombre un ser igual a ellos que ha perdido de forma extraordinariamente peligrosa el sano intelecto animal.
> Es decir, que ven en él al animal irracional, al animal que ríe, al animal que llora, al animal infeliz. — Friedrich Nietzsche

Incluso puedes concatenar varios ">>" para crear citas anidadas.

> Esto sería una cita como la que acabas de ver.
> 
> > Dentro de ella puedes anidar otra cita.
> 
> La cita principal llegaría hasta aquí. 

## LISTAS

Hay dos tipos de listas en Markdown, ordenadas y desordenadas. 

### Listas desordenadas

Para crear listas desordenadas utiliza asteriscos (*), guiones medios (-) o simbolos de suma (+). Todos se veran iguales al procesarse:

- Elemento de lista 1 con guion
- Elemento de lista 2 con guion
* Elemento de lista 3 con asterisco
* Elemento de lista 4 con asterisco
+ Elemento de lista 5 con simbolo suma
+ Elemento de lista 6 con simbolo suma

### Listas ordenadas

Para generar listas anidadas dentro de otras, simplemente tendrás que añadir cuatro espacios en blanco antes del siguiente *, - o +.

- Elemento de lista 1
- Elemento de lista 2
    - Elemento de lista 3
    - Elemento de lista 4
        - Elemento de lista 5
        - Elemento de lista 6

Para las listas ordenadas es tan sencillo como usar la sintaxis de tipo numero \"1." 

1. Elemento de lista 1
2.  Elemento de lista 2
    - Elemento de lista 3
    - Elemento de lista 4
        1. Elemento de lista 5
        2. Elemento de lista 6
Como ves, tambien se pueden anidar o combinar.

### Bloques de código.

Si quieres crear un bloque entero que contenga código. Lo único que tienes que hacer es encerrar dicho párrafo entre dos líneas formadas por tres ~ virgulillas.

~~~
#include <iostream>

int main() {
    std::cout << "Hola, mundo!" << std::endl;
    return 0;
}

~~~

### Código puro \<code>

La forma más sencilla de escribir código en Markdown es envolver el texto entre dos comillas sencillas `. Esto se corresponde con la etiqueta HTML \<code>

`print("Hello, world!")`

Es muy útil para introducir código dentro de la misma línea o párrafo, algo que no permite el método siguiente.

### Texto preformateado \<pre>

La otra manera de añadir código en Markdown es comenzar el párrafo con cuatro espacios en blanco. Esto se corresponde con la etiqueta HTML \<pre>.

    print("Hello, world!")

**Ojo, ¡estos espacios deberás incluirlos en cada línea que escribas!**


### Reglas horizontales

Las reglas horizontales se utilizan para separar secciones de una manera visual.

Para crearlas, en una línea en blanco deberás incluir tres de los siguientes elementos: 

ASTERISCOS:

***

GUIONES:

---

GUIONES BAJOS

___


Se pueden separar entre espacios por pura estetica.

* * *
- - -
_ _ _


## ELEMENTOS DE LÍNEA

## Enfasis (negritas y cursivas)

Markdown utiliza asteriscos o guiones bajos para enfatizar.

Simplemente tendrás que envolver palabras o textos en éstos símbolos para conseguir cursivas o negritas.

- *cursiva*	- (Asterisco simple)
- _cursiva_	 - (Guion bajo)
+ **negrita**	- (Asterisco doble)
+ __negrita__	- (Guion bajo doble)

Estos enfatizadores son combinables entre si:

* ***cursiva y negrita***	 - (Tres asteriscos)
* ___cursiva y negrita___	- ( Tres guiones bajos)


## LINKS O ENLACES

### LINK/ENLACE EN LINEA

Se crean escribiendo la palabra o texto enlazada entre [] corchetes, y el link en cuestión entre () paréntesis.

[Link o enlace](http://rae.es)


### Links/enlaces como referencia

La desventaja del método anterior, es que si utilizas links demasiado complejos o largos pueden dificultarte la lectura de tu texto.

Para solucionarlo y crear tu contenido de una manera más ordenada puedes generar enlaces de referencia.

Esto quiere decir que en tu texto enlazarás palabras o códigos concretos (formados por letras y/o números), que en otro lugar más apartado de tu documento tendrás definidos como determinadas URL.

[nombre que quieres darle a tu enlace][nombre de tu referencia]
[nombre de tu referencia]: http:www.tuenlace.com

EJEMPLO:

Me llamo Javier Cristóbal y tengo un blog sobre [productividad mac][blog].
En dicha [web][blog] recopilo artículos sobre todo lo relacionado con automatización, gestión y eficiencia.
[blog]: http://limni.net/blog/

La referencia [blog] puede estar incluida en cualquier parte del documento, así puedes organizarte mejor y de una manera más limpia, recopilando todas tus referencias en un mismo lugar.


### Links automáticos

Estos son necesarios cuando lo que quieres es mostrar una URL completa, y no un enlace enmascarado bajo una palabra o frase como ocurre con los links en línea.

Para generar links automáticos tan solo tendrás que rodearlos con los símbolos < >

<http://www.rae.es>

### Imágenes

nsertar una imagen con Markdown se realiza de una manera prácticamente idéntica a insertar links.

Solo que en este caso, deberás añadir un símbolo de ! exclamación al principio y el enlace no será otro que la ubicación de la imagen.

![Logo de Wikipedia](https://es.wikipedia.org/static/images/icons/wikipedia.png)

El texto alternativo es lo que se mostraría si la carga de la imagen fallase.

También podrás añadir un título alternativo entrecomillándolo al final de la ruta. Esto sería el título mostrado al dejar el cursor del ratón sobre la imagen.

![Logo de Wikipedia](https://es.wikipedia.org/static/images/icons/wikipedia.png "Logo de la Wikipedia")

Ya que al añadir imágenes también estás tratando con URLs, puedes utilizar el método que viste anteriormente para incluir links mediante referencias, solo que en este caso los enlaces de referencia serán aquellos donde se encuentre tu imagen.

De esta forma podrías insertar una imagen

![nombre de la imagen][img1]

O dos, sin ensuciar tu espacio de escritura
![nombre de la imagen2][img2]

 
[img1]: https://www.hacienda.gob.es/style%20library/minhac.sp.portal/img/logoministeriohaciendafp.svg "Somos todos"
[img2]: https://imagenes.elpais.com/resizer/v2/https%3A%2F%2Fep01.epimg.net%2Felpais%2Fimagenes%2F2016%2F05%2F31%2Fciencia%2F1464687786_596536_1464698347_noticia_fotograma.jpg?auth=f8cd7e95f1e9bdd9e10f99b7964a5feda8a4443ead509a4773f0ad02eec7c95b&width=1200&height=675&smart=true "DEP Harambe"


