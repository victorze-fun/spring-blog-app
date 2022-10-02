# Spring Blog App

Spring Blog App es un aplicación donde los usuarios pueden publicar artículos y comentarios.

[spring-blog-app.webm](https://user-images.githubusercontent.com/22132891/193476288-d97e9bef-af49-41cf-a86f-18a00d11b3a9.webm)

## Tecnologías utilizadas

- __Lenguajes:__ Java, JavaScript,
- __Frameworks:__ Spring y Bootstrap 5.
- __Base de datos:__ MySQL
- __Componentes de Spring:__ Spring Data JPA, Spring Security y Thymeleaf.
- __Bibliotecas:__ Lombok, Thymeleaf Layout Dialect y Thymeleaf Extras Springsecurity5.
- __Frontend:__ HTML y CSS.

## Retos de la aplicación

- Configuar Spring Security para proteger algunas rutas.
- Configurar y utilizar QuillJS para mostrar un editor de texto enriquecido.
- Utilizar Thymeleaf Layout para reutilizar código y mantener las vistas limpias.
- Utilizar la API de Bootstrap para validar los datos ingresados en la creación de usuario.

## Restricciones de seguridad

- Solo usuarios registrados pueden publicar artículos.
- Solo usuarios registrados pueden publicar comentarios.
- No es necesario registrarse para ver la lista de artículos publicados.
- No es necesario registrarse para ver la lista de autores.
- No es necesario registrarse para un artículo específico.

## Configurar un entorno de desarrollo

- Clonar el repositorio
  ```bash
  git clone https://github.com/victorze/spring-blog-app
  ```
- Verificar que un servidor MySQL se encuentre activo y funcionando.
- Ingresar los datos de conexión a la base de datos en `application.properties`
- Abrir y ejecutar la aplicación con un IDE.
