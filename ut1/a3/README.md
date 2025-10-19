# READ ME
## UT1-A3 Practicando Git 

~~~
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
>**Pregunta:** el fichero y el directorio privado debe de subir al repositorio si se encuentra añadido al fichero .gitingnore. [Si/No]. Justifica tu respuesta en el fichero README.md.

No. Un archivo y un directorio especificados en '.gitignore' no deben subirse al repositorio, ya que el propósito de '.gitignore'
es justamente decirle a Git que ignore esos archivos y no los añada al control de versiones.

>**Pregunta:** Si ejecutado las acciones add y commit, que realiza cada una sobre el/los ficheros.

El comando 'git add' toma los cambios que has realizado en tus archivos en el directorio de trabajo y los mueve al área de staging (o área de preparación).
El comando 'git commit' toma la instantánea de los cambios que se encuentran en el área de staging y los guarda de forma permanente en el historial del repositorio.

>**Pregunta:** ¿Qué es un tag sobre un repositorio git, en nuestro caso Github?.

Un tag (etiqueta) en un repositorio Git (y por extensión en GitHub) es una referencia fija y permanente que apunta a un commit específico en el historial. Su propósito principal es marcar puntos importantes o hitos en el desarrollo del proyecto.
A diferencia de las ramas (que se mueven a medida que se añaden commits), un tag nunca cambia de su commit asociado a menos que se mueva o elimine manualmente.

>**Pregunta:** Cuando estamos trabajando con ramas, cual es su fin, y sentido en organizaciones pequeñas/medianas/grandes.

El fin principal de las ramas (branches) en Git es permitir que el trabajo de desarrollo ocurra en entornos aislados, asegurando que el código principal (generalmente llamado main o master) permanezca estable y funcional mientras se desarrollan nuevas funcionalidades, se corrigen errores o se experimenta con nuevas ideas.
Esencialmente, una rama es un puntero móvil a un commit, creando una bifurcación del historial del proyecto.

>**Pregunta:** Se tendrían que producir conflictos en esta acción. [Si/No]

No. Un conflicto de fusión (merge conflict) solo ocurre cuando Git no puede determinar automáticamente cómo combinar los cambios porque:
1. Dos ramas modificaron la misma parte de la misma línea en el mismo archivo.
2. Una rama eliminó un archivo que la otra rama modificó.

