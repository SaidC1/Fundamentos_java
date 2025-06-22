# 📦 Gestor de Inventario en Java  
# 📦 Inventory Manager in Java

Repositorio con el desarrollo progresivo de un sistema de inventario hecho en Java.  
Repository with the progressive development of an inventory system made in Java.

Cada versión incluye nuevas funcionalidades y mejoras.  
Each version includes new features and improvements.

---

## 🧩 Versiones disponibles / Available Versions

### 🔹 `v1-basico`  
- CRUD parcial: agregar, ver, buscar, eliminar.  
- Partial CRUD: add, view, search, delete.  
- Validaciones básicas.  
- Basic validations.  
- Menú interactivo por consola.  
- Console-based interactive menu.  
- ❌ Sin opción de actualizar productos.  
- ❌ No option to update products.

📁 [Ir a carpeta / Go to folder](./v1-basico)

---

### 🔹 `v2-actualizacion`  
- Todas las funciones de la versión 1.  
- All functions from version 1.  
- 🆕 Nueva opción para **actualizar productos** (precio, cantidad o ambos).  
- 🆕 New option to **update products** (price, quantity, or both).  
- Validaciones mejoradas y mensajes claros.  
- Improved validations and clear messages.  
- Base para futuras mejoras como guardar datos en archivo.  
- Base for future improvements like saving data to file.

📁 [Ir a carpeta / Go to folder](./v2-actualizacion)

---

## ⚙️ Requisitos / Requirements

- Java 17 o superior  
- Java 17 or higher  
- Consola o IDE (VS Code, IntelliJ, etc.)  
- Console or IDE (VS Code, IntelliJ, etc.)

---

## 🚀 Cómo compilar y ejecutar  
## 🚀 How to compile and run

Desde una carpeta de versión (por ejemplo, `v2-actualizacion`):  
From a version folder (e.g. `v2-actualizacion`):

```bash
javac Producto.java GestorInventario.java
java GestorInventario
