INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(902, 'URGILÉS', 'HERRERA','0103156675', 'jessica.herrera@tecazuay.edu.ec','1983-02-18', 'F', 'JÉSSICA', 'PRISCILA', '0998501605');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(879, 'OCHOA', 'CARRANZA','0703630715', 'roberto.carranza@tecazuay.edu.ec','1976-07-22', 'M', 'ROBERTO', 'NATANIEL', '0995710017');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(905, 'PINOS', 'SANCHEZ','0103574257', 'jose.sanchez@tecazuay.edu.ec','1985-12-05', 'M', 'JOSE', 'ESTEBAN', '0984573286');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(1286, 'RIOS', 'CRIOLLO','0103769295', 'adrian.criollo@tecazuay.edu.ec','1988-11-18', 'M', 'ADRIÁN', 'RODRIGO', '0993974122');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(866, 'VICUÑA', 'AGUIRRE','0103680435', 'gabriela.aguirre@tecazuay.edu.ec','1981-07-12', 'F', 'MARÍA', 'GABRIELA', '0997692783');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(925, 'SOLIS', 'MACHADO','0103638763', 'mpaz.machado@tecazuay.edu.ec','1987-03-09', 'F', 'MARIA', 'PAZ', '0984708629');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(898, 'MAXI', 'GUERRERO','0104430400', 'pedro.guerrero@tecazuay.edu.ec','1987-12-08', 'M', 'PEDRO', 'FERNANDO', '0991354136');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(1254, 'CHUMBI', 'LEON','0104244264', 'carolina.leon@tecazuay.edu.ec','1993-07-21', 'F', 'CAROLINA', 'PRISCILA', '0984952776');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(1474, 'MUÑOZ', 'GUAMAN','0104209960', 'christian.guaman@tecazuay.edu.ec','1987-05-08', 'M', 'CHRISTIAN', 'MAURICIO', '0999880856');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(920, 'BUESTAN', 'NARVAEZ','0103937561', 'freddy.narvaez@tecazuay.edu.ec','1985-11-07', 'M', 'FREDDY', 'EDUARDO', '0998343465');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(915, 'URGILÉS', 'ORTIZ','0301162988', 'claudio.ortiz@tecazuay.edu.ec','1970-02-04', 'M', 'CLAUDIO', 'FERNANDO', '0988818368');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(1749, 'MARIÑO', 'ELHABIL','0105704597', 'catherine.elhabil@tecazuay.edu.ec','1987-12-08', 'F', 'CATHERINE', 'CUMANDA', '0979195915');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(6516515, 'DIAZ', 'HARO','0107186900', 'miguel.haro@tecazuay.edu.ec','2003-11-30', 'M', 'MIGUEL', 'ALEJANDRO', '0998501608');
INSERT INTO PERSONA (per_cod, per_apellidomater, per_apellidopater, per_cedula, per_email, per_fechanac, per_genero, per_primernom, per_segundonom,per_telefono)VALUES(6516516, 'FARES', 'GUZMAN','0150052413', 'jose.fares.est@tecazuay.edu.ec','2003-11-30', 'M', 'JOSE', 'LUIS', '0969071826');
INSERT INTO ROLES (rol_estado, rol_nombre) values (true, 'Super Usuario');
INSERT INTO ROLES (rol_estado, rol_nombre) values (true, 'Custodio');
INSERT INTO ROLES (rol_estado, rol_nombre) values (true, 'Rector');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (6516515, 'admin', true, 'admin');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (6516516, 'rector', true, 'Rector');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (902, 'custodio1', true, 'jessica.herrera@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (879, 'custodio2', true, 'roberto.carranza@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (905, 'custodio3', true, 'jose.sanchez@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (1286, 'custodio4', true, 'adrian.criollo@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (866, 'custodio5', true, 'gabriela.aguirre@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (925, 'custodio6', true, 'mpaz.machado@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (898, 'custodio7', true, 'pedro.guerrero@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (1254, 'custodio8', true, 'christian.guaman@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (1474, 'custodio9', true, 'carolina.leon@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (920, 'custodio10', true, 'freddy.narvaez@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (915, 'custodio11', true, 'claudio.ortiz@tecazuay.edu.ec');
INSERT INTO USUARIOS (usu_per_cod, contrasenia, usu_estado, usuario) values (1749, 'custodio12', true, 'catherine.elhabil@tecazuay.edu.ec');
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (1, 1);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (2, 3);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (3, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (4, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (5, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (6, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (7, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (8, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (9, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (10, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (11, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (12, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (13, 2);
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (14, 2);



INSERT INTO CATEGORIA(cat_nombre,cat_descripcion,cat_estado) VALUES ('Inmuebles','Madera y de blanco',true);
INSERT INTO CATEGORIA(cat_nombre,cat_descripcion,cat_estado) VALUES ('HERRAMIENTAS','EQUIPO PARA MANTENIMIENTO AUTOMOTRIZ/APARATO PARA DESARME Y MONTAJE',true);
INSERT INTO CATEGORIA(cat_nombre,cat_descripcion,cat_estado) VALUES ('EQUIPOS DE LABORATORIO','OBSERVACION Y COMPROBACION/EQUIPO PARA ENSEÑANZA DE ELECTRONICA',true);
INSERT INTO CATEGORIA(cat_nombre,cat_descripcion,cat_estado) VALUES ('EQUIPOS TECNOLÓGICOS','COMPUTADORAS',true);

INSERT INTO UBICACIONES(ubi_nombre, departamento, ubi_estado) values('Maquinacion de Carpinteria','Lab-6',true);
INSERT INTO UBICACIONES(ubi_nombre,departamento, ubi_estado) values('LABORATORIO REBOBINAJE','Lab-0',true);
INSERT INTO UBICACIONES(ubi_nombre, departamento, ubi_estado) values('TALLER DE MAQUINAS ELECTRICAS','Lab-1',true);
INSERT INTO propietario (pro_direccion, pro_estado, pro_nombre, pro_telefono) VALUES ('Av. 24 de Mayo y Che Guevara Edifico de la Ex Universidad Técnica Particular José Peralta, Azogues 030101', true, 'SENESCYT', '59323934300');
INSERT INTO propietario (pro_direccion, pro_estado, pro_nombre, pro_telefono) VALUES ('Octavio Chacón Moscoso 1-98 y Primera Transversal (Parque industrial)', true, 'INSTITUTO TECNOLÓGICO UNIVERSITARIO DEL AZUAY', '0995363076');
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778142, '###RSFDSF#####', '8120 0', 'FESTO', 'BUENO', 'MAQUINARIA Y EQUIPO', 'MAQUINARIA Y EQUIPO:1 BANCO MÓVIL PARA MÁQUINAS DESARMABLES 8120-0', '', 0.0, true, 1,1,2,1);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30998141, '###RSFDSX#####', '8120 0', 'FESTO', 'MALO', 'MAQUINARIA Y EQUIPO', 'MAQUINARIA Y EQUIPO:1 BANCO MÓVIL PARA MÁQUINAS DESARMABLES 8120-0', '', 0.0, false, 1,1,2,1);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778143, '###RSXDSX#####', '8120 0', 'FESTO', 'BUENO', 'MAQUINARIA Y EQUIPO', 'MAQUINARIA Y EQUIPO:1 BANCO MÓVIL PARA MÁQUINAS DESARMABLES 8120-0', '', 0.0, true, 2,2,1,1);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778144, '###RSXFSX#####', '8120 0', 'FESTO', 'BUENO', 'MAQUINARIA Y EQUIPO', 'MAQUINARIA Y EQUIPO:1 MOTOR DC 8211-D, 1 MOTOR CON CAPACITOR DE ARRANQUE 8253-D, 1 MOTOR UNIVERSAL 8254-D,1 MOTOR TRIFÁSICO DE INUCCIÓN DE ROTOR BOBINADO 8231-D, 1 MOTOR TRIFÁSICO JAULA DE ARDILLA 8221-D, 1 MÁQUINA SINCRÓNICA 8241-D, 1 MOTOR DE RELUCTANCIA SÍNCRONA 8246-D, 1 MOTOR DE DOS VELOCIDADES PAR VARIABLE 8224-D, 1 MOTOR DE DOS VELOCIDADES PAR CONSTANTE 8225-D, 1 MOTOR DE 2 FASES DE ROTOR BOBINADO DE INDUCCIÓN 8233-D', '', 0.0, true, 2,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778147, '###RSXDWX#####', 'STA 1 EV', 'ELETTRONICA VENETTA', 'BUENO', 'MAQUINARIA Y EQUIPO', 'MAQUINARIA Y EQUIPO', '', 0.0, true, 3,2,1,1);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778947, 'ADM-06618', 'I7-4770', 'INTEL CORE', 'BUENO', 'CPU', 'Memoria Ram - 4GB Disco Duro 500GB', 'MXL44130S0', 725.20, true, 2,4,1,2);

INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778948, 'CUE-02277', 'PO-1.5 M6', 'HITACHI', 'BUENO', 'COMPRESOR DE AIRE', 'COMPLEMENTO DEL SISTEMA DE ENTRENAMIENTO DE CONTROL DE FLUJO, NIVEL, TEMPERATURA, Y PRESION. ELÉCTRICO, COLOR VERDE, DIMENSIONES:  60X75X90', 'BI612094', 250.00, true, 2,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778949, 'CUE-02278', '1.58 MEGA PRESION', 'HITACHI', 'BUENO', 'RECEPTOR DE AIRE', 'DE 38 LITROS, COMPLEMENTO DEL SISTEMA DE ENTRENAMIENTO DE CONTROL DE FLUJO, NIVEL, TEMPERATURA, Y PRESION. ELÉCTRICO, COLOR VERDE, DIMENSIONES 28X28X80', '', 11.00, true, 2,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778959, 'CUE-02282', '2202 C-2', 'KENTAC', 'BUENO', 'UNIDAD DE CONTROL', 'PARTE DEL DISPOSITIVO DE ENTRENAMIENTO DE MOTORES ACCESORIOS:  2 PULSANTES INDICADORES DOBLES, 2 TARJETAS DE REPUESTO, 3 CABLES DIN DE TARJETA, 1 TARJETA DE SENSOR HALL, 1 TARJETA DE ADQUISICIÓN DE DATOS, 3 CABLES DE COMUNICACIÓN, 2 CABLES CON CONECTORES, 2 BANDAS, 4 CABLES TIPO BANANA, 2 MANUALES, 1 DISKET. PLÁSTICO Y METAL, COLOR BLANCO Y CELESTE, DIMENSIONES:  35X45X16', '', 125.00, true, 2,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778908, 'CUE-02299', '', 'OTESA', 'REGULAR', 'FRECUENCIMETROS DE LENGÜETA', 'METÁLICO, COLOR NEGRO, DIMENSIONES 14,5X14,5X8,5', '', 144.00, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30772909, 'CUE-02302', 'S/M', 'COMPACT', 'REGULAR', 'FOTOTACOMETRO PORTATIL', 'ELECTRÓNICO, COLOR NEGRO, 7X6,5X22', '00390', 35.00, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30775909, 'CUE-02303', 'S/M', 'COMPACT', 'REGULAR', 'FOTOTACOMETRO PORTATIL', 'ELECTRÓNICO, COLOR NEGRO, 7X6,5X22', '00392', 35.00, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30718909, 'CUE-02305', 'S/M', 'COMPACT', 'REGULAR', 'FOTOTACOMETRO PORTATIL', 'ELECTRÓNICO, COLOR NEGRO, 7X6,5X22', '00396', 35.00, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30778209, 'CUE-05892', 'S/M', 'S/M', 'BUENO', 'MESA TALLER 3 PUESTOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30178903, 'CUE-05552', 'S/M', 'S/M', 'BUENO', 'MESA LABORATORIO PARA 2', 'HABANO Y GRIS, METAL Y MADERA, 1.20X0.60X0.72', 'S/S', 147.60, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30878909, 'CUE-05893', 'S/M', 'S/M', 'BUENO', 'MESA TALLER 3 PUESTOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30748909, 'CUE-05894', 'S/M', 'S/M', 'BUENO', 'MESA TALLER 3 PUESTOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30770909, 'CUE-05895', 'S/M', 'S/M', 'BUENO', 'MESA TALLER 3 PUESTOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (20778909, 'CUE-05897', 'S/M', 'S/M', 'BUENO', 'MESA TALLER 3 PUESTOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (32778909, 'CUE-05898', 'S/M', 'S/M', 'BUENO', 'MESA TALLER 3 PUESTOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30178909, 'CUE-05899', 'S/M', 'S/M', 'BUENO', 'MESA TALLER 3 PUESTOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30773921, 'CUE-05900', 'S/M', 'S/M', 'BUENO', 'MESA TALLER 3 PUESTOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (31278929, 'CUE-05934', 'S/M', 'S/M', 'BUENO', 'ARCHIVADOR TIPO ARMARIO', 'MADERA, 50X120X210, COLOR GRIS.', '119X50', 388.64, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (31728928, 'CUE-06161', 'S/M', 'S/M', 'BUENO', 'SILLA DE VISITA CON APOYA BRAZOS', 'GRIS Y MADERA NATURAL, METAL Y MADERA, 0.60X1.80X0.9', 'S/S', 199.88, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (10728909, 'CUE-07070', 'S/M', 'S/M', 'BUENO', 'TABURETE METÁLICO', '70 CTMS. ALTURA', 'S/S', 66.63, true, 3,2,1,2);
INSERT INTO BIENES (bien_cod, bien_codigoG, bien_modelo, bien_marca, bien_estado, bien_detalles, bien_descripcion, bien_serie, bien_precio, bien_estadoA, bien_edi_cod, bien_cat_cod, bien_user_cod, bien_pro_cod) VALUES (30228902, 'CUE-07071', 'S/M', 'S/M', 'BUENO', 'TABURETE METÁLICO', 'METÁLICO, PLOMO, 48x60cm', 'S/S', 66.63, true, 3,2,1,2);
