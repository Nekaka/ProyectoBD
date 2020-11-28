CREATE DATABASE BDNegocio;

CREATE TABLE usuario(
    id INT AUTO_INCREMENT,
    user VARCHAR(20),
    pass VARCHAR(30),
    nom_ape TEXT(50),
    PRIMARY KEY (id)
);

CREATE TABLE productos(
    id VARCHAR(20),
    nombre TEXT(20),
    stock INT(10),
    precio INT(10),
    estado INT (1),
    PRIMARY KEY (id),
    UNIQUE (id)
);

CREATE TABLE ventas(
    id INT AUTO_INCREMENT,
    id_user INT,
    total INT,
    fecha_venta DATETIME,
    estado INT(1),
    PRIMARY KEY (id),
    FOREIGN KEY (id_user) REFERENCES usuario(id)
);

CREATE TABLE pedido(
    id INT AUTO_INCREMENT,
    producto VARCHAR(50),
    cantidad INT(6),
    PRIMARY KEY (id),
    FOREIGN KEY (producto) REFERENCES productos(id)
);

CREATE TABLE boletas(
  id INT AUTO_INCREMENT,
  id_ventas INT,
  id_producto VARCHAR,
  cantidad INT(11),
  precio_venta INT(11),
  PRIMARY KEY (id),
  FOREIGN KEY (id_ventas) REFERENCES ventas(id),
  FOREIGN KEY (id_producto) REFERENCES productos(id)
);