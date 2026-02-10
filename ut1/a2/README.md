# README

### UT1/A1

En este ejercicio practicaremos diferentes competencias como:

- La sintaxis Markdown
- El uso de GIT
- Enlaces a repositorio remoto

Este ejercicio nos pide:
> Redacta un pequeño documento en formato Markdown llamado README.md que cumpla con los siguientes requisitos:

1.  Incluya un título principal y al menos un subtítulo.

2.  Contenga un párrafo introductorio.

3.  Utiliza al menos una lista con viñetas y una lista numerada.

4.  Inserta al menos una palabra en **negrita** y otra en *cursiva*.

5.  Incluye un enlace [externo](https://es.motorsport.com/) y una imagen usando la sintaxis Markdown.
![Serresiete](https://github.com/IvnMD/etsdam_ivan/blob/a2de7adcb3d63ab36370f6024707afe21530219c/ut1/a2/img/serresiete.jpeg)

6.  Inserta un fragmento de código con la sintaxis adecuada (inline o bloque).

~~~
public class Repaso3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase y se sustituira las A por 4: ");
        String frase = sc.nextLine().toLowerCase().trim();
        char sustituto = '4';
        char sustituido = 'a';
        String nuevaFrase = "";

        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == sustituido){
                nuevaFrase += sustituto;
            } else {
                nuevaFrase += frase.charAt(i);
            }
        }
        System.out.println("Cadena con reemplazo: " + nuevaFrase);

    }

}
~~~

7.  Termina con una cita en bloque.

>—«Aquel que ayuda a otro a alcanzar el poder está condenado a caer, porque para conseguirlo habrá utilizado o su ingenio o su fuerza, y ambas cosas resultan incómodas para el que se ha vuelto poderoso» 
>>Nicolas de Maquiavelo (III. LOS PRINCIPADOS MIXTOS).

