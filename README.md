<p>
  <img src="https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png" width="300"/>
</p>



# LlanquihueTourApp


## Autor del Proyecto
- **Nombre completo:** Matias Fernando Calfual Pérez
- **Carerra:** Analista programador 
- **Sede:** Duoc UC online
  

## Descripción

LlanquihueTourApp es una aplicación desarrollada en Java para representar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

En esta sexta semana se implementó una jerarquía de clases utilizando herencia simple. Se creó una superclase con atributos comunes y tres subclases especializadas que heredan sus características, aplicando el uso de `super()` y la sobrescritura del método `toString()`.

## Objetivo de la semana

Implementar una jerarquía de clases mediante herencia simple para modelar distintos servicios turísticos, reutilizando atributos comunes y especializando cada tipo de servicio.

## Estructura del proyecto

```text
LlanquihueTourApp
│
├── .idea/
├── out/
├── src/
│   ├── model/
│   │   ├── ServicioTuristico.java
│   │   ├── RutaGastronomica.java
│   │   ├── PaseoLacustre.java
│   │   └── ExcursionCultural.java
│   │
│   ├── data/
│   │   └── GestorServicios.java
│   │
│   └── ui/
│       └── Main.java
│
├── resources/
│
├── .gitignore
├── LlanquihueTourApp.iml
```

## Clases creadas

### model

* ServicioTuristico
* RutaGastronomica
* PaseoLacustre
* ExcursionCultural

### data

* GestorServicios

### ui

* Main

## Conceptos aplicados

* Herencia simple.
* Uso de `super()` en constructores.
* Sobrescritura del método `toString()`.
* Organización del código mediante paquetes.
* Encapsulamiento de atributos.

## Ejecución del programa

1. Abrir el proyecto en IntelliJ IDEA.
2. Esperar a que el proyecto cargue correctamente.
3. Abrir el archivo:

```
src/ui/Main.java
```

4. Ejecutar el método `main()`.
5. El programa mostrará en la consola dos objetos de cada tipo de servicio turístico.


