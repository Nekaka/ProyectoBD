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
    PRIMARY KEY (id),
    UNIQUE (id)
);

CREATE TABLE ventas(
    id INT AUTO_INCREMENT,
    id_user INT,
    total INT,
    id_producto INT,
    FOREIGN KEY (id_producto) REFERENCES productos(id),
    FOREIGN KEY (id_user) REFERENCES usuario(id)
);