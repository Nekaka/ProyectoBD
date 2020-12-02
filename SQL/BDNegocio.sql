CREATE DATABASE BDNegocio;

CREATE TABLE usuario(
    id INT AUTO_INCREMENT,
    user VARCHAR(20),
    pass VARCHAR(30),
    nom_ape TEXT(50),
    PRIMARY KEY (id)
);

CREATE TABLE productos(
    id INT AUTO_INCREMENT,
    nombre TEXT(20),
    stock INT(10),
    precio INT(10),
    estado INT (1),
    PRIMARY KEY (id),
);

CREATE TABLE ventas(
    id INT AUTO_INCREMENT,
    id_user INT,
    id_producto INT,
    cantidad INT,
    total INT,
    fecha_venta DATETIME,
    PRIMARY KEY (id),
    FOREIGN KEY (id_producto) REFERENCES productos(id),
    FOREIGN KEY (id_user) REFERENCES usuario(id)
);

CREATE TABLE pedido(
    id INT AUTO_INCREMENT,
    producto INT,
    cantidad INT(6),
    PRIMARY KEY (id),
    FOREIGN KEY (producto) REFERENCES productos(id)
);

CREATE TABLE detalle_temp(
    nro_serie INT(20),
    id_user INT,
    id_producto INT,
    cantidad INT(10),
    precio INT(20),
    PRIMARY KEY (nro_serie),
    FOREIGN KEY (id_producto) REFERENCES productos(id),
    FOREIGN KEY (id_user) REFERENCES usuario(id)
);

CREATE TABLE boletas(
    id INT AUTO_INCREMENT,
    nro_serie INT,
    id_user INT,
    id_producto INT,
    cantidad INT(11),
    precio INT(11),
    PRIMARY KEY (id),
    FOREIGN KEY (id_user) REFERENCES usuario(id),
    FOREIGN KEY (id_producto) REFERENCES productos(id),
    FOREIGN KEY (nro_serie) REFERENCES detalle_temp(nro_serie)
);

DELIMITER //
    CREATE PROCEDURE procesar_venta(id_usuario INT, serie INT)
    BEGIN 
        DECLARE registros INT;
        DECLARE laid INT;
        DECLARE total_venta INT;
        DECLARE nuevo_stock INT;
        DECLARE stock_actual INT;
        DECLARE tmp_id_producto INT;
        DECLARE tmp_cant_productos INT;
        DECLARE a INT;
        SET a = 1;

        CREATE TEMPORARY TABLE tbl_tmp_venta(
            id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
            id_producto BIGINT,
            cant_producto INT);
        
        SET registros = (SELECT COUNT(*) FROM detalle_temp WHERE nro_serie = serie);

        IF registros > 0 THEN
            INSERT INTO tbl_tmp_venta(id_producto, cant_producto) SELECT id_producto, cantidad FROM detalle_temp WHERE nro_serie = serie;

            INSERT INTO ventas(id_user) VALUES(id_usuario);
            SET laid = LAST_INSERT_ID();
             
            INSERT INTO boletas(nro_serie, id_user, id_producto, cantidad, precio) SELECT nro_serie, id_user, id_producto, cantidad, precio FROM detalle_temp; 
            WHERE nro_serie = serie;

            WHILE a <= registros DO
                SELECT id_producto, cant_producto INTO tmp_id_producto, tmp_cant_productos FROM tbl_tmp_venta WHERE id = a;
                SELECT stock INTO stock_actual FROM productos WHERE id = tmp_id_producto;

                SET nuevo_stock = stock_actual - tmp_cant_productos;
                UPDATE productos SET stock = nuevo_stock WHERE id = tmp_id_producto;
                SET a = a + 1;


            END WHILE;

            SET total_venta = (SELECT SUM(stock * precio) FROM detalle_temp WHERE nro_serie = serie);
            UPDATE ventas SET total = total_venta WHERE id_usuario = laid;
        ELSE

        END IF;
    END;//
DELIMITER ;
