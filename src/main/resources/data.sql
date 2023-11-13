DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

CREATE TABLE peliculas (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(115),
calificacion_edad INT
);

INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Los 4 fantasticos', 3);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Conoces a Joe Black', 12);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Spiderman', 6);

CREATE TABLE salas (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(115),
id_pelicula INT,
FOREIGN KEY (id_pelicula) REFERENCES Peliculas(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO salas (nombre, id_pelicula) VALUES ('Sala 1', 1);
INSERT INTO salas (nombre, id_pelicula) VALUES ('Sala 2', 2);
INSERT INTO salas (nombre, id_pelicula) VALUES ('Sala 3', 3);