---

### 🔧 Configuración básica

| Comando                                         | Funcionalidad                                               | Ejemplo de uso                                      |
| ----------------------------------------------- | ----------------------------------------------------------- | --------------------------------------------------- |
| `git config --global user.name "Tu Nombre"`     | Establece el nombre que se anexará a los commits.           | `git config --global user.name "Juan Pérez"`        |
| `git config --global user.email "tu@email.com"` | Establece el correo que se anexará a los commits.           | `git config --global user.email "juan@example.com"` |
| `git config --global color.ui auto`             | Habilita color en la salida de la línea de comandos.        | `git config --global color.ui auto`                 |
| `git config --list`                             | Muestra la configuración actual de Git.                     | `git config --list`                                 |

---

### 📁 Crear e inicializar repositorios / Instalar Git

| Comando                | Funcionalidad                                          | Ejemplo de uso                                              |
| ---------------------- | ------------------------------------------------------ | ----------------------------------------------------------- |
| `git init [project]`   | Inicializa un nuevo repositorio local.                 | `git init mi-proyecto`                                      |
| `git clone <url>`      | Clona un repositorio remoto (descarga todo el historial). | `git clone https://github.com/usuario/proyecto.git`         |
| (Info)                 | Git está disponible en https://git-scm.com; GitHub ofrece GUI para Windows/macOS. | — |

---

### EFECTUAR CAMBIOS — Seguimiento y control de cambios

| Comando                             | Funcionalidad                                                                 | Ejemplo de uso                        |
| ----------------------------------- | ----------------------------------------------------------------------------- | ------------------------------------- |
| `git status`                        | Enumera archivos nuevos/modificados que deben confirmarse.                    | `git status`                          |
| `git add [file]`                    | Añade un archivo al área de preparación (staging).                            | `git add index.html`                  |
| `git add .`                         | Añade todos los cambios del directorio actual.                                | `git add .`                           |
| `git reset [file]`                  | Mueve el archivo fuera del área de preparación, preservando su contenido.     | `git reset index.html`                |
| `git diff`                          | Muestra diferencias entre working tree y HEAD (cambios no añadidos).         | `git diff`                            |
| `git diff --staged`                 | Muestra diferencias entre staging y HEAD (cambios añadidos).                 | `git diff --staged`                   |
| `git commit -m "[mensaje]"`         | Registra las instantáneas del área de preparación en el historial.            | `git commit -m "Corrige error de login"` |

---

### 🔄 Historial y versiones / Repasar historial

| Comando                                 | Funcionalidad                                              | Ejemplo de uso                        |
| --------------------------------------- | ---------------------------------------------------------- | ------------------------------------- |
| `git log`                               | Lista el historial de commits de la rama actual.           | `git log`                             |
| `git log --oneline --graph`             | Muestra historial resumido y gráfico.                      | `git log --oneline --graph`           |
| `git log --follow [file]`               | Lista el historial de un archivo, incluyendo renombrados.  | `git log --follow README.md`          |
| `git show [commit]`                     | Muestra metadatos y cambios de un commit específico.       | `git show a1b2c3d`                    |
| `git diff [first]...[second]`           | Muestra diferencias de contenido entre dos ramas/commits.  | `git diff main...feature`             |

---

### 🌿 Ramas (branches) / Cambios grupales

| Comando                 | Funcionalidad                                   | Ejemplo de uso                 |
| ----------------------- | ----------------------------------------------- | ------------------------------ |
| `git branch`            | Lista las ramas existentes.                     | `git branch`                   |
| `git branch [nombre]`   | Crea una nueva rama.                            | `git branch feature-login`     |
| `git checkout [nombre]` | Cambia a la rama especificada y actualiza el directorio activo. | `git checkout feature-login`   |
| `git switch [nombre]`   | Alternativa moderna a `checkout` para cambiar rama. | `git switch main`              |
| `git merge [rama]`      | Fusiona la rama especificada con la actual.     | `git merge feature-login`      |
| `git branch -d [nombre]`| Borra la rama especificada.                     | `git branch -d feature-login`  |

---

### ☁️ Trabajo con remotos / Sincronizar cambios

| Comando                            | Funcionalidad                                               | Ejemplo de uso                                      |
| ---------------------------------- | ----------------------------------------------------------- | --------------------------------------------------- |
| `git remote -v`                    | Lista remotos asociados.                                    | `git remote -v`                                     |
| `git remote add origin <url>`      | Añade un remoto llamado origin.                             | `git remote add origin https://github.com/usuario/proyecto.git` |
| `git fetch [remoto]`               | Descarga cambios del remoto sin fusionarlos.                | `git fetch origin`                                  |
| `git merge [remoto]/[rama]`        | Fusiona la rama del remoto con la rama local actual.        | `git merge origin/main`                             |
| `git pull`                         | Descarga e incorpora cambios desde el remoto (fetch + merge). | `git pull`                                          |
| `git push [alias] [branch]`        | Sube los commits locales al remoto.                         | `git push origin main`                              |
| `git push origin <tag>`            | Sube una etiqueta al remoto.                                | `git push origin v1.0`                              |

---

### Nombres de archivo / Refactorización (mover/renombrar/borrar)

| Comando                                 | Funcionalidad                                                      | Ejemplo de uso                                |
| --------------------------------------- | ------------------------------------------------------------------ | --------------------------------------------- |
| `git rm --cached [file]`                | Quita el archivo del control de versiones pero lo deja localmente. | `git rm --cached secreto.txt`                 |
| `git rm [file]`                         | Borra el archivo del directorio activo y lo marca para commit.     | `git rm viejo.txt`                            |
| `git mv [origen] [destino]`             | Renombra o mueve un archivo (prepara para commit).                 | `git mv archivo.txt nuevo-nombre.txt`         |

---

### 🧹 Deshacer y limpiar — Guardar/rehacer/limpiar

| Comando                                    | Funcionalidad                                                     | Ejemplo de uso                          |
| ------------------------------------------ | ----------------------------------------------------------------- | --------------------------------------- |
| `git restore <archivo>`                    | Revierte cambios no añadidos en un archivo (working tree).        | `git restore index.html`                |
| `git reset <archivo>`                      | Quita del área de preparación (staging) sin modificar working tree.| `git reset index.html`                  |
| `git reset [commit]`                       | Deshace commits posteriores a [commit], preservando cambios localmente. | `git reset a1b2c3d`                  |
| `git reset --hard [commit]`                | Restablece el repositorio al commit indicado (pierde cambios locales). | `git reset --hard a1b2c3d`           |
| `git clean -f`                             | Elimina archivos no rastreados.                                   | `git clean -f`                          |
| `git stash`                                | Almacena temporalmente cambios modificados tracked.               | `git stash`                             |
| `git stash list`                           | Lista los conjuntos guardados.                                    | `git stash list`                        |
| `git stash pop`                            | Restaura el set de cambios guardado más reciente.                 | `git stash pop`                         |
| `git stash drop`                           | Elimina el set de cambios guardado más reciente.                  | `git stash drop`                        |

---

### 🧩 Etiquetas y versiones

| Comando                 | Funcionalidad                             | Ejemplo de uso         |
| ----------------------- | ----------------------------------------- | ---------------------- |
| `git tag <nombre>`      | Crea una etiqueta (por ejemplo, versión). | `git tag v1.0`         |
| `git tag`               | Lista todas las etiquetas.                | `git tag`              |
| `git push origin <tag>` | Sube una etiqueta al remoto.              | `git push origin v1.0` |

---

### REPASAR HISTORIAL Y COMPARAR (resumen)

| Comando                                 | Funcionalidad                                              | Ejemplo de uso                        |
| --------------------------------------- | ---------------------------------------------------------- | ------------------------------------- |
| `git log`                               | Lista el historial de commits de la rama actual.           | `git log`                             |
| `git log --oneline --graph`             | Muestra historial resumido y gráfico.                      | `git log --oneline --graph`           |
| `git diff`                              | Muestra diferencias entre working tree y HEAD.             | `git diff`                            |
| `git diff --staged`                     | Muestra diferencias entre staging y HEAD.                  | `git diff --staged`                   |
| `git diff [first]...[second]`           | Muestra diferencias entre dos ramas o commits.             | `git diff main...feature`             |
| `git show [commit]`                     | Muestra metadatos y cambios de un commit.                  | `git show a1b2c3d`                    |
| `git log --follow [file]`               | Historial de un archivo, incluyendo renombrados.           | `git log --follow archivo.txt`        |

---

### SUPRIMIR TRACKING (.gitignore)

| Comando / Patrón                           | Funcionalidad                                              | Ejemplo                                   |
| ------------------------------------------ | ---------------------------------------------------------- | ----------------------------------------- |
| `.gitignore`                               | Archivo que especifica patrones de archivos/dirs a ignorar. | Ejemplo de contenido:                      |
|                                            |                                                            | `*.log`                                    |
|                                            |                                                            | `build/`                                   |
|                                            |                                                            | `temp-*`                                   |
| `git ls-files --other --ignored --exclude-standard` | Lista archivos ignorados según .gitignore.                 | `git ls-files --other --ignored --exclude-standard` |

---

