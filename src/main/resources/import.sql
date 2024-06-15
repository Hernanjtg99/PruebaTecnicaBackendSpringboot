

INSERT INTO clientes (id, tipo_documento, numero_documento, apellido, residencia, ciudad, telefono) VALUES (1, 'CC', '1234567890', 'Perez Gomez', 'Calle 123', 'Bogotano', '3214567890');
INSERT INTO clientes (id, tipo_documento, numero_documento, apellido, residencia, ciudad, telefono)VALUES (2, 'TI', '9876543210', 'Martinez Lopez', 'Avenida 456', 'Medellin', '3009876543');
INSERT INTO clientes (id, tipo_documento, numero_documento, apellido, residencia, ciudad, telefono)VALUES (3, 'CE', '4567890123', 'Gonzalez Rodriguez', 'Carrera 789', 'Cali', '3104567890');

INSERT INTO referencia_personal(id_referencia_personal,id_cliente,nombre,direccion,telefono,ciudad,email)VALUES(1,1,'Juan','CALLE13','1343456','Cali','JUANCALI@gmail.com');
INSERT INTO referencia_personal(id_referencia_personal,id_cliente,nombre,direccion,telefono,ciudad,email)VALUES(2,2,'Camilo','Av87','13434679','Bogota','Camilo@hotmail.com');

