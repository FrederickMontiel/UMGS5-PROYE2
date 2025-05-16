# Documentación del Proyecto MatrizOrtogonal

Este documento proporciona una visión general del proyecto MatrizOrtogonal, explicando cómo funciona y cómo instalarlo.

## Visión General

**MatrizOrtogonal** es una aplicación Java que implementa una estructura de datos de matriz ortogonal para gestionar información de vehículos en una interfaz gráfica. Permite a los usuarios agregar, editar y visualizar datos de vehículos en un diseño basado en cuadrícula.

## Estructura del Proyecto

El proyecto sigue una arquitectura Modelo-Vista-Controlador (MVC):

### Controladores

- **OrtogonalMatrix.java**: Implementa la estructura de matriz ortogonal.  
- **OrtogonalNode.java**: Representa un nodo dentro de la matriz ortogonal.

### Modelos

- **Vehicle.java**: Representa los datos de un vehículo (placa, color, línea, modelo, propietario).  
- **CellPanel.java**: Extensión de JPanel para mostrar y gestionar datos del vehículo en la interfaz gráfica.

### Vistas

- **MainView.java**: Ventana principal de la aplicación con un diseño en cuadrícula para mostrar vehículos.

### Sistema

- **Main.java**: Punto de entrada de la aplicación.

## Cómo Funciona

### Implementación de la Matriz Ortogonal

La matriz ortogonal es una estructura de datos especializada que permite operaciones eficientes de inserción, eliminación y búsqueda en un espacio bidimensional. En esta aplicación:

- Cada nodo en la matriz representa una posición donde puede almacenarse un vehículo.
- La matriz admite operaciones como:
  - Insertar un vehículo en una posición específica.
  - Buscar vehículos por criterio.
  - Eliminar vehículos por identificador (número de placa).

### Interfaz de Usuario

La aplicación presenta una cuadrícula de 10×10 donde:

- Cada celda es un `CellPanel` que puede almacenar información del vehículo.
- Las celdas vacías se muestran con un fondo por defecto.
- Las celdas ocupadas se muestran con fondo negro.
- Los usuarios pueden interactuar con las celdas para:
  - Agregar un nuevo vehículo ingresando placa, color, línea, modelo y propietario.
  - Ver detalles del vehículo mediante un diálogo emergente.
  - Editar información del vehículo existente.

### Flujo de Interacción del Usuario

1. Al iniciar la aplicación, se muestra una cuadrícula de celdas vacías.
2. Los usuarios pueden hacer clic en una celda para agregar un vehículo.
3. Una vez agregado, la celda cambia de color.
4. Se puede hacer clic en celdas ocupadas para ver o editar la información del vehículo.

## Instalación y Configuración

### Requisitos Previos

- Java Development Kit (JDK) 21 o superior.  
- NetBeans IDE 20 o superior.

### Pasos para Instalar y Ejecutar

#### Clonar o Descargar el Proyecto

- Clona el repositorio o descarga el código fuente.

#### Abrir el Proyecto en NetBeans

1. Inicia NetBeans IDE.  
2. Ve a **Archivo > Abrir Proyecto**.  
3. Navega a la carpeta descargada del proyecto.  
4. Selecciona la carpeta `MatrizOrtogonal` y haz clic en **Abrir Proyecto**.

#### Compilar el Proyecto

1. Haz clic derecho sobre el proyecto en el panel de proyectos.  
2. Selecciona **Limpiar y Construir**.

#### Ejecutar la Aplicación

1. Haz clic derecho sobre el proyecto en el panel de proyectos.  
2. Selecciona **Ejecutar**.  
   - Alternativamente, presiona **F6**.

### Método Alternativo: Ejecutar desde JAR

Si tienes un archivo JAR compilado disponible:

1. Asegúrate de tener instalado el Java Runtime Environment (JRE).  
2. Navega a la carpeta `dist` dentro del directorio del proyecto.  
3. Haz doble clic en el archivo `MatrizOrtogonal.jar`.  
   - Alternativamente, ejecútalo desde línea de comandos.

## Guía de Uso

### Agregar un Vehículo

1. Haz clic en una celda vacía.  
2. Ingresa la información solicitada:
   - Número de placa (requerido).
   - Color.
   - Línea (tipo de vehículo).
   - Modelo.
   - Propietario.

### Ver Información del Vehículo

- Haz clic en una celda ocupada (color negro).
- Se mostrará un cuadro de diálogo con los detalles del vehículo.

### Editar un Vehículo

1. Haz clic en una celda ocupada.  
2. Selecciona la opción de edición.  
3. Modifica la información según sea necesario.  
4. Confirma para guardar los cambios.

## Detalles de Implementación

La aplicación utiliza:

- **Java Swing** para la interfaz gráfica de usuario.  
- Componentes personalizados para las celdas de la cuadrícula.  
- Listeners de eventos para manejar la interacción del usuario.  
- Una estructura de matriz ortogonal para gestión eficiente de datos.

La clase principal (`gt.edu.miumg.fmontiel.system.Main`) inicializa la aplicación y muestra la vista principal.

## Solución de Problemas

- Si la aplicación no inicia, asegúrate de tener la versión correcta del JDK.  
- Revisa la salida de la consola para ver posibles mensajes de error.  
- Verifica que todos los archivos necesarios estén incluidos en la estructura del proyecto.
