<center>

# UT1-A3 Practicando Git

</center>

***Nombre: Iván Mesa Dominguez***  
***Curso:1º DAM***  

---

### ÍNDICE

+ [Introducción](#id1)
+ [Objetivos](#id2)
+ [Material empleado](#id3)
+ [Desarrollo](#id4)
+ [Conclusiones](#id5)

---

#### ***Introducción***. <a name="id1"></a>

En esta práctica trabajamos con el sistema de control de versiones **Git** y la plataforma **GitHub**, con el fin de aprender a crear repositorios, clonar, realizar commits, manejar ramas, etiquetas (*tags*) y resolver conflictos de fusión (*merge conflicts*).  
El propósito es familiarizarnos con los comandos básicos de Git y entender cómo se gestiona el flujo de trabajo en proyectos colaborativos.

---

#### ***Objetivos***. <a name="id2"></a>

- Crear y gestionar un repositorio Git local y remoto en GitHub.  
- Aprender a usar los comandos fundamentales: `clone`, `add`, `commit`, `push`, `branch`, `merge`, `tag`, entre otros.  
- Configurar correctamente el archivo `.gitignore`.  
- Comprender la finalidad de las ramas y las etiquetas.  
- Resolver conflictos durante una fusión (*merge*).  
- Documentar correctamente el proceso y las respuestas teóricas en un archivo `README.md`.

---

#### ***Material empleado***. <a name="id3"></a>

**Hardware:**
- Ordenador personal.

**Software:**
- Sistema operativo Linux.  
- Git instalado en el sistema (`git --version`).  
- Cuenta activa en **GitHub**.  
- Editor de texto o terminal (VS Code, nano, vim, etc.).

**Configuración:**
- Repositorio remoto: `my-proyecto`.  
- Clonado local mediante SSH:  
  ```bash
  git clone git@github.com:alumno-XXX/my-proyecto.git
  ```

---

#### ***Desarrollo***. <a name="id4"></a>

A continuación, se listan los pasos realizados junto con los comandos ejecutados:

~~~bash
git add .
git commit -m "commit inicial"
git push origin main
touch privado.txt
mkdir privada
echo "privado.txt" >> .gitignore
echo "/privada" >> .gitignore
git add .
git commit -m "añadido fichero .gitignore"
touch 1.txt
git add .
git commit -m "añadido 1.txt"
git tag v0.1
git push --tag origin main
git branch v0.2
git checkout v0.2
touch 2.txt
git add .
git commit -m "añadido 2.txt"
git push origin v0.2
git checkout main
git merge v0.2 -m "merge v0.2 sin conflictos"
git checkout main
echo "Hola" >> 1.txt
git add .
git commit -m "hola en 1.txt"
git checkout v0.2
echo "Adios" >> 1.txt
git add .
git commit -m "adios en 1.txt"
git checkout main
git merge v0.2
vim 1.txt
git add .
git commit -m "arreglado merge en 1.txt"
git branch --merged
git branch --no-merged
nano 1.txt
git add .
git commit -m "arreglado merge en 1.txt"
git tag v0.2
git branch -d v0.2
git config --global alias.list 'log --oneline --decorate --graph --all'
git list
~~~

---

> **Pregunta:** el fichero y el directorio privado deben subir al repositorio si se encuentran añadidos al fichero `.gitignore`?  
> **Respuesta:** No. Un archivo y un directorio especificados en `.gitignore` no deben subirse al repositorio, ya que el propósito de este archivo es indicarle a Git que los ignore y no los incluya en el control de versiones.

---

> **Pregunta:** Si he ejecutado las acciones `add` y `commit`, ¿qué realiza cada una sobre los ficheros?  
> **Respuesta:**  
> - `git add`: mueve los cambios realizados en los archivos del directorio de trabajo al área de *staging* (preparación).  
> - `git commit`: guarda de forma permanente en el historial del repositorio los cambios que están en el área de *staging*.

---

> **Pregunta:** ¿Qué es un *tag* sobre un repositorio Git (en nuestro caso GitHub)?  
> **Respuesta:** Un *tag* es una referencia fija a un commit específico. Se utiliza para marcar versiones importantes o hitos del proyecto (por ejemplo, `v1.0`, `v2.0`). A diferencia de las ramas, un *tag* no se mueve con nuevos commits.

---

> **Pregunta:** Cuando trabajamos con ramas, ¿cuál es su fin y sentido en organizaciones pequeñas, medianas o grandes?  
> **Respuesta:**  
> Las ramas permiten desarrollar nuevas funcionalidades o corregir errores de manera aislada, sin afectar el código principal.  
> - En **pequeñas organizaciones**, facilitan la experimentación.  
> - En **medianas**, permiten que varios desarrolladores trabajen simultáneamente.  
> - En **grandes**, ayudan a estructurar el desarrollo por equipos o versiones, asegurando estabilidad y control de versiones.

---

> **Pregunta:** ¿Se tendrían que producir conflictos en esta acción?  
> **Respuesta:** No.  
> Los conflictos solo aparecen si dos ramas modifican las mismas líneas de un archivo o si una elimina un archivo que la otra modifica. En este caso, al no coincidir las modificaciones, Git puede realizar la fusión automáticamente sin conflictos.

---

#### ***Conclusiones***. <a name="id5"></a>

Esta práctica ha permitido comprender de forma práctica el funcionamiento de Git y GitHub, destacando la importancia de los comandos básicos y la gestión de versiones.  
Se ha aprendido a:  
- Crear y conectar repositorios locales y remotos.  
- Trabajar con ramas y etiquetas.  
- Resolver conflictos durante *merges*.  
- Configurar el archivo `.gitignore` adecuadamente.  

En resumen, esta práctica consolida las bases del control de versiones, una habilidad esencial en el trabajo colaborativo y en el desarrollo profesional de software.<center>
