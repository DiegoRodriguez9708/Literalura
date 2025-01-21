# Literalura
Es un proyecto que permite consultar diferentes libros, asi como informacion sobre sus
autores, año de publicación, idioma y otros detalles relevantes. Este proyecto esta 
construido utilizando Spring Boot y JPA, se conecta a una API [Gutendex] de donde se obtienen
toda la informacion necesaria.
## Tabla de contenido
* Caracteristicas
* Tecnologías utilizadas
* Instalación
* Uso
* Contribución
### Caracteristicas
* Busequeda por titulo
* Visualizacion de la lista de libros registrados de la busqueda.
* Visualizacion de la lista de autores registrados
* Filtrado de autores vivos en un año especifico
* Filtrado de libros por idioma [en - es]
### Tecnologías utlizadas
* Java 17
* Spring Boot 3.4.1
* JPA ( Java Persistence API)
* PostgreSQL
* Maven (Gestion de dependecias)
### Instalación 
Para instalar y ejecutar el proyecto, sigue estos pasos:
1. Clona el repositorio:
   git clone https://github.com/tu_usuario/Literalura.git
   cd Literalura
2. Configura la base de datos:
* Asegúrate de tener PostgreSQL instalado y en funcionamiento.
* Crea una base de datos para el proyecto.
* Configura las credenciales de la base de datos en el archivo application.properties.
3. Compila el proyecto:
  mvn clean install
4. Ejecuta la aplciación:
  mvc spring-boot:run
### Uso
Las contribuciones son bienvenidas. Si deseas contribuir, por favor sigue estos pasos:
1. Haz un fork del proyecto.
2. Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
3. Realiza tus cambios y haz commit (git commit -m 'Agregada nueva característica').
4. Haz push a la rama (git push origin feature/nueva-caracteristica).
5. Abre un Pull Request.
