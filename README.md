# TelephoneRecharger

Este proyecto es una prueba técnica desarrollada utilizando Java, Spring Boot y H2. La arquitectura utilizada sigue el patrón de arquitectura hexagonal, bajo las capas de domain, application e infraestructure, para una estructura modular y escalable.

## Requisitos Previos

    Java JDK 17 o superior instalado en tu sistema.
    Maven para compilar y ejecutar el proyecto.

## Configuración

    Clona este repositorio en tu máquina local.
    Abre el proyecto en tu IDE favorito que admita el desarrollo de aplicaciones Spring Boot.

## Librerias 

    Lombok se utiliza en este proyecto para generar automáticamente métodos getter, setter, constructores y otros
    métodos comunes en las clases de entidad y DTO (Objectos de Transferencia de Datos).
    
    MapStruct se utiliza en este proyecto para mapear los objetos de dominio a objetos DTO y viceversa, 
    lo que facilita la transferencia de datos entre las diferentes capas de la aplicación de manera eficiente y sin la necesidad de escribir código boilerplate.

La aplicación se ejecutará en ´http://localhost:9090´.
    
Hasta el momento cuenta con 2 endpoints.
    
    http://localhost:9090/api/buy : Método POST que permite comprar/guardar una recarga 
    
    JSON REQUEST BODY
    {
        "phone": "3014582302",
        "valueRecharge": 30000.0,
        "operator": 41,
        "seller": 11
    }
    
    http://localhost:9090/api/all : Método GET que permite obtener todas las rescargas 

Se recomienda el uso del sofware Postman para probar cada endpoint.


La base de datos H2 está incrustada en la aplicación y se inicializa utilizando un script SQL al arrancar la aplicación. Puedes acceder a la consola de administración de H2 mediante la siguiente URL:

http://localhost:9090/h2

    JDBC URL: jdbc:h2:mem:testdb
    Usuario: sa
    Contraseña: (dejar en blanco)

Asegúrate de que la aplicación esté en ejecución antes de intentar acceder a la consola de H2.

Por defecto al ejecutar la aplicación contará con datos de prueba en las siguientes tablas:

OPERATOR -> operador telefónico

| ID | NAME |
|---|---|
| 11 | Tigo |
| 21 | Movistar |
| 31 | Comcel |
| 41 | Uff |

SELLER -> vendedor de recargas

| ID | NAME |
|---|---|
| 11 | Ana |
| 21 | Pablo |

RECHARGE -> recarga

| ID | PHONE | VALUE_RECHARGE | OPERATOR_ID | SELLER_ID
|---|---|---|---|---|
| 11 | 3216549875 | 10000 | 11 | 21
| 21 | 3258967418 | 50000 | 31 | 11

## Estructura del Proyecto

El proyecto sigue una estructura de paquetes basada en la arquitectura hexagonal:

    com.phone_recharges.application: Capa de aplicación que contiene los casos de uso de la aplicación.
    com.phone_recharges..domain: Capa de dominio que contiene las entidades y reglas de negocio.
    com.phone_recharges.infrastructure: Capa de infraestructura que incluye la implementación de los 
    repositorios, adaptadores, controllers, DTOs y Mappers ademas de implementación específica.
    resources/data.sql: se encuentran los datos injectados en la base de datos mediante script SQL.
