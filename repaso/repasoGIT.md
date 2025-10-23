Lista con los **comandos más habituales de Git**, explicados brevemente con su **funcionalidad y forma de uso** 👇

---

### 🔧 **Configuración básica**

| Comando                                         | Funcionalidad                                 | Ejemplo de uso                                      |
| ----------------------------------------------- | --------------------------------------------- | --------------------------------------------------- |
| `git config --global user.name "Tu Nombre"`     | Define tu nombre de usuario para los commits. | `git config --global user.name "Juan Pérez"`        |
| `git config --global user.email "tu@email.com"` | Define el correo asociado a tus commits.      | `git config --global user.email "juan@example.com"` |
| `git config --list`                             | Muestra la configuración actual de Git.       | `git config --list`                                 |

---

### 📁 **Creación e inicialización de repositorios**

| Comando           | Funcionalidad                             | Ejemplo de uso                                      |
| ----------------- | ----------------------------------------- | --------------------------------------------------- |
| `git init`        | Inicializa un nuevo repositorio local.    | `git init`                                          |
| `git clone <url>` | Clona un repositorio remoto en tu equipo. | `git clone https://github.com/usuario/proyecto.git` |

---

### 📄 **Seguimiento y control de cambios**

| Comando                   | Funcionalidad                                                                           | Ejemplo de uso                           |
| ------------------------- | --------------------------------------------------------------------------------------- | ---------------------------------------- |
| `git status`              | Muestra el estado actual del repositorio (archivos modificados, sin seguimiento, etc.). | `git status`                             |
| `git add <archivo>`       | Añade un archivo al área de preparación (staging area).                                 | `git add index.html`                     |
| `git add .`               | Añade todos los cambios del directorio actual.                                          | `git add .`                              |
| `git commit -m "mensaje"` | Guarda los cambios en el historial con un mensaje.                                      | `git commit -m "Corrige error de login"` |

---

### 🔄 **Historial y versiones**

| Comando                     | Funcionalidad                                                       | Ejemplo de uso              |
| --------------------------- | ------------------------------------------------------------------- | --------------------------- |
| `git log`                   | Muestra el historial de commits.                                    | `git log`                   |
| `git log --oneline --graph` | Muestra el historial resumido y visual.                             | `git log --oneline --graph` |
| `git diff`                  | Muestra diferencias entre archivos modificados y la última versión. | `git diff`                  |
| `git show <commit>`         | Muestra detalles de un commit específico.                           | `git show a1b2c3d`          |

---

### 🌿 **Ramas (branches)**

| Comando                 | Funcionalidad                     | Ejemplo de uso               |
| ----------------------- | --------------------------------- | ---------------------------- |
| `git branch`            | Lista las ramas existentes.       | `git branch`                 |
| `git branch <nombre>`   | Crea una nueva rama.              | `git branch feature-login`   |
| `git checkout <nombre>` | Cambia a otra rama.               | `git checkout feature-login` |
| `git switch <nombre>`   | Alternativa moderna a `checkout`. | `git switch main`            |
| `git merge <rama>`      | Fusiona una rama con la actual.   | `git merge feature-login`    |

---

### ☁️ **Trabajo con repositorios remotos**

| Comando                       | Funcionalidad                                    | Ejemplo de uso                                                  |
| ----------------------------- | ------------------------------------------------ | --------------------------------------------------------------- |
| `git remote -v`               | Lista los repositorios remotos asociados.        | `git remote -v`                                                 |
| `git remote add origin <url>` | Añade un repositorio remoto.                     | `git remote add origin https://github.com/usuario/proyecto.git` |
| `git push origin <rama>`      | Envía los commits locales al repositorio remoto. | `git push origin main`                                          |
| `git pull`                    | Descarga y fusiona los cambios del remoto.       | `git pull`                                                      |
| `git fetch`                   | Descarga los cambios del remoto sin fusionarlos. | `git fetch`                                                     |

---

### 🧹 **Deshacer y limpiar**

| Comando                     | Funcionalidad                                               | Ejemplo de uso             |
| --------------------------- | ----------------------------------------------------------- | -------------------------- |
| `git restore <archivo>`     | Revierte cambios no añadidos en un archivo.                 | `git restore index.html`   |
| `git reset <archivo>`       | Quita un archivo del área de preparación.                   | `git reset index.html`     |
| `git reset --hard <commit>` | Revierte el repositorio a un commit anterior (¡peligroso!). | `git reset --hard a1b2c3d` |
| `git clean -f`              | Elimina archivos no rastreados.                             | `git clean -f`             |

---

### 🧩 **Etiquetas y versiones**

| Comando                 | Funcionalidad                             | Ejemplo de uso         |
| ----------------------- | ----------------------------------------- | ---------------------- |
| `git tag <nombre>`      | Crea una etiqueta (por ejemplo, versión). | `git tag v1.0`         |
| `git tag`               | Lista todas las etiquetas.                | `git tag`              |
| `git push origin <tag>` | Sube una etiqueta al remoto.              | `git push origin v1.0` |

---
