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
INSERT INTO ROLES (rol_estado, rol_nombre) values (true, 'Super Usuario');
INSERT INTO USUARIOS (usu_per_cod,contrasenia, usu_estado, usuario) values (902, 'admin', true, 'admin');
INSERT INTO USUARIOS_ROLES (usuario_id, rol_id) values (1, 1);