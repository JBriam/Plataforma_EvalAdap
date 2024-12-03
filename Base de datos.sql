CREATE DATABASE Plataforma_EvalAdap;
USE Plataforma_EvalAdap;

CREATE TABLE Estudiantes (
    EstudianteID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Edad INT,
    NivelAcademico VARCHAR(50),
    FechaInscripcion DATE
);

CREATE TABLE Evaluaciones (
    EvaluacionID INT AUTO_INCREMENT PRIMARY KEY,
    EstudianteID INT,
    ResultadosAnteriores VARCHAR(255),
    TiempoPromedioRespuesta FLOAT,
    DificultadPercibida VARCHAR(255),
    FOREIGN KEY (EstudianteID) REFERENCES Estudiantes(EstudianteID)
);

CREATE TABLE ExamenAdaptado (
    ExamenID INT AUTO_INCREMENT PRIMARY KEY,
    EvaluacionID INT,
    ExamenAdaptado TEXT,
    FechaExamen DATE,
    FOREIGN KEY (EvaluacionID) REFERENCES Evaluaciones(EvaluacionID)
);

CREATE TABLE InformesProgreso (
    InformeID INT AUTO_INCREMENT PRIMARY KEY,
    EstudianteID INT,
    Progreso VARCHAR(255),
    FechaInforme DATE,
    FOREIGN KEY (EstudianteID) REFERENCES Estudiantes(EstudianteID)
);

INSERT INTO Estudiantes (Nombre, Edad, NivelAcademico, FechaInscripcion) VALUES 
('Juan Pérez', 20, 'Universitario', '2023-01-15'),
('María López', 19, 'Universitario', '2023-02-10'),
('Carlos Sánchez', 22, 'Universitario', '2023-03-05'),
('Laura Gómez', 21, 'Universitario', '2023-04-12'),
('Ana Torres', 23, 'Universitario', '2023-05-18'),
('José Ramírez', 20, 'Universitario', '2023-06-01'),
('Paula Martínez', 21, 'Universitario', '2023-07-10'),
('Luis Castillo', 22, 'Universitario', '2023-08-02'),
('Sofía Fernández', 19, 'Universitario', '2023-09-11'),
('Miguel Hernández', 23, 'Universitario', '2023-10-25');

INSERT INTO Evaluaciones (EstudianteID, ResultadosAnteriores, TiempoPromedioRespuesta, DificultadPercibida) VALUES 
(1, 'Aprobado', 4.5, 'Media'),
(2, 'Aprobado', 3.8, 'Alta'),
(3, 'Reprobado', 6.1, 'Media'),
(4, 'Aprobado', 2.5, 'Baja'),
(5, 'Aprobado', 3.0, 'Alta'),
(6, 'Reprobado', 5.2, 'Media'),
(7, 'Aprobado', 4.1, 'Baja'),
(8, 'Reprobado', 6.5, 'Alta'),
(9, 'Aprobado', 3.7, 'Media'),
(10, 'Aprobado', 4.2, 'Baja');

INSERT INTO ExamenAdaptado (EvaluacionID, ExamenAdaptado, FechaExamen) VALUES 
(1, 'Examen 1 Adaptado', '2023-03-15'),
(2, 'Examen 2 Adaptado', '2023-04-11'),
(3, 'Examen 3 Adaptado', '2023-05-09'),
(4, 'Examen 4 Adaptado', '2023-06-13'),
(5, 'Examen 5 Adaptado', '2023-07-07'),
(6, 'Examen 6 Adaptado', '2023-08-02'),
(7, 'Examen 7 Adaptado', '2023-09-05'),
(8, 'Examen 8 Adaptado', '2023-10-01'),
(9, 'Examen 9 Adaptado', '2023-11-08'),
(10, 'Examen 10 Adaptado', '2023-12-12');

INSERT INTO InformesProgreso (EstudianteID, Progreso, FechaInforme) VALUES 
(1, 'Buen progreso, sigue mejorando', '2023-04-01'),
(2, 'Progreso lento, revisar dificultades', '2023-05-02'),
(3, 'Progreso insuficiente, necesita mejorar', '2023-06-03'),
(4, 'Progreso excelente, mantén el ritmo', '2023-07-04'),
(5, 'Progreso adecuado, sigue así', '2023-08-05'),
(6, 'Progreso medio, trabajar en las debilidades', '2023-09-06'),
(7, 'Progreso satisfactorio, mejorar velocidad de respuesta', '2023-10-07'),
(8, 'Progreso insuficiente, requiere más esfuerzo', '2023-11-08'),
(9, 'Progreso satisfactorio, sigue avanzando', '2023-12-09'),
(10, 'Progreso excelente, sobresaliente en todas las áreas', '2024-01-10');


-- //////////PROCEDIMIENTOS PARA ESTUDIANTES

-- INSERTAR UN ESTUDIANTE NUEVO
DELIMITER $$
CREATE PROCEDURE sp_insertarEstudiante(
    IN p_Nombre VARCHAR(100),
    IN p_Edad INT,
    IN p_NivelAcademico VARCHAR(50),
    IN p_FechaInscripcion DATE
)
BEGIN
    INSERT INTO estudiantes (Nombre, Edad, NivelAcademico, FechaInscripcion)
    VALUES (p_Nombre, p_Edad, p_NivelAcademico, p_FechaInscripcion);
END $$
DELIMITER ;

-- Prueba:
CALL sp_insertarEstudiante('Cristiano Ronaldo', 25, 'Universitario', '2024-07-28');


-- LEER LOS DATOS DE TODOS LOS ALUMNOS
DELIMITER $$
CREATE PROCEDURE sp_leerEstudiantes()
BEGIN
    SELECT * FROM estudiantes;
END $$
DELIMITER ;

-- Prueba:
CALL sp_leerEstudiantes();


-- ACTUALIZAR LOS DATOS DE UN ESTUDIANTE
DELIMITER $$
CREATE PROCEDURE sp_actualizarEstudiante(
    IN p_EstudianteID INT,
    IN p_Nombre VARCHAR(100),
    IN p_Edad INT,
    IN p_NivelAcademico VARCHAR(50),
    IN p_FechaInscripcion DATE
)
BEGIN
    UPDATE estudiantes
    SET Nombre = p_Nombre, Edad = p_Edad, NivelAcademico = p_NivelAcademico, FechaInscripcion = p_FechaInscripcion
    WHERE EstudianteId = p_EstudianteID;
END $$
DELIMITER ;

-- Prueba:
CALL sp_actualizarEstudiante(1, 'Lionel Messi', 26, 'Universitario', '2024-07-28');


-- ELIMINAR LOS DATOS DE UN ESTUDIANTE
DELIMITER $$
CREATE PROCEDURE sp_eliminarEstudiante(
    IN p_EstudianteId INT
)
BEGIN
    DELETE FROM estudiantes WHERE EstudianteId = p_EstudianteId;
END $$
DELIMITER ;

-- prueba
CALL sp_eliminarEstudiante (11);


-- LEER LOS DATOS DE UN ALUMNO POR SU ID
DELIMITER $$
CREATE PROCEDURE sp_leerEstudiantePorId(
    IN p_EstudianteId INT
)
BEGIN
    SELECT * FROM estudiantes WHERE EstudianteId = p_EstudianteId;
END $$
DELIMITER ;

-- prueba
CALL sp_LeerEstudiantePorId(1);




-- //////////PROCEDIMIENTOS PARA EVALUACIONES

-- INSERTAR UNA EVALUACION NUEVA
DELIMITER $$
CREATE PROCEDURE sp_insertarEvaluacion(
    IN p_EstudianteID INT,
    IN p_ResultadosAnteriores VARCHAR(255),
    IN p_TiempoPromedioRespuesta FLOAT,
    IN p_DificultadPercibida VARCHAR(255)
)
BEGIN
    INSERT INTO evaluaciones(EstudianteID, ResultadosAnteriores, TiempoPromedioRespuesta, DificultadPercibida)
    VALUES (p_EstudianteID, p_ResultadosAnteriores, p_TiempoPromedioRespuesta, p_DificultadPercibida);
END $$
DELIMITER ;

-- Prueba:
CALL sp_insertarEvaluacion(1, 'Desaprobado', 60, 'Alta');


-- LEER LOS DATOS DE TODOS LAS EVALUACIONES
DELIMITER $$
CREATE PROCEDURE sp_leerEvaluaciones()
BEGIN
    SELECT * FROM evaluaciones;
END $$
DELIMITER ;

-- Prueba:
CALL sp_leerEvaluaciones();


-- ACTUALIZAR LOS DATOS DE UNA EVALUACION
DELIMITER $$
CREATE PROCEDURE sp_actualizarEvaluacion(
    IN p_EvaluacionID INT,
    IN p_EstudianteID INT,
    IN p_ResultadosAnteriores VARCHAR(255),
    IN p_TiempoPromedioRespuesta FLOAT,
    IN p_DificultadPercibida VARCHAR(255)
)
BEGIN
    UPDATE evaluaciones
    SET EstudianteID = p_EstudianteID, ResultadosAnteriores = p_ResultadosAnteriores, TiempoPromedioRespuesta = p_TiempoPromedioRespuesta, DificultadPercibida = p_DificultadPercibida
    WHERE EvaluacionId = p_EvaluacionID;
END $$
DELIMITER ;

-- Prueba:
CALL sp_actualizarEvaluacion(11, 1, 'Aprobado', 10, 'Baja');


-- ELIMINAR LOS DATOS DE UNA EVALUACION
DELIMITER $$
CREATE PROCEDURE sp_eliminarEvaluacion(
    IN p_EvaluacionId INT
)
BEGIN
    DELETE FROM evaluaciones WHERE EvaluacionId = p_EvaluacionId;
END $$
DELIMITER ;

-- prueba
CALL sp_eliminarEvaluacion (12);


-- LEER LOS DATOS DE UNA EVALUACION POR SU ID
DELIMITER $$
CREATE PROCEDURE sp_leerEvaluacionPorId(
    IN p_EvaluacionId INT
)
BEGIN
    SELECT * FROM evaluaciones WHERE EvaluacionId = p_EvaluacionId;
END $$
DELIMITER ;

-- prueba
CALL sp_leerEvaluacionPorId(1);





-- //////////PROCEDIMIENTOS PARA EXAMEN ADAPTADO

-- INSERTAR UNA EXAMEN ADAPTADO
DELIMITER $$
CREATE PROCEDURE sp_insertarExamenAdaptado(
    IN p_EvaluacionID INT,
    IN p_ExamenAdaptado TEXT,
    IN p_FechaExamen DATE
)
BEGIN
    INSERT INTO examenadaptado(EvaluacionID, ExamenAdaptado, FechaExamen)
    VALUES (p_EvaluacionID, p_ExamenAdaptado, p_FechaExamen);
END $$
DELIMITER ;

-- Prueba:
CALL sp_insertarExamenAdaptado(4, 'Examen 2 Adaptado', '2024-10-10');


-- LEER LOS DATOS DE TODOS LOS EXAMENES ADAPTADOS
DELIMITER $$
CREATE PROCEDURE sp_leerExamenesAdaptados()
BEGIN
    SELECT * FROM examenadaptado;
END $$
DELIMITER ;

-- Prueba:
CALL sp_leerExamenesAdaptados();


-- ACTUALIZAR LOS DATOS DE UN EXAMEN ADAPTADO
DELIMITER $$
CREATE PROCEDURE sp_actualizarExamenAdaptado(
    IN p_ExamenID INT,
    IN p_EvaluacionID INT,
    IN p_ExamenAdaptado TEXT,
    IN p_FechaExamen DATE
)
BEGIN
    UPDATE examenadaptado
    SET EvaluacionID = p_EvaluacionID, ExamenAdaptado = p_ExamenAdaptado, FechaExamen = p_FechaExamen
    WHERE ExamenId = p_ExamenID;
END $$
DELIMITER ;

-- Prueba:
CALL sp_actualizarExamenAdaptado(14,4, 'Examen 3 Adaptado', '2024-10-09');


-- ELIMINAR LOS DATOS DE UN EXAMEN ADAPTADO
DELIMITER $$
CREATE PROCEDURE sp_eliminarExamenAdaptado(
    IN p_ExamenId INT
)
BEGIN
    DELETE FROM examenadaptado WHERE ExamenId = p_ExamenId;
END $$
DELIMITER ;

-- prueba
CALL sp_eliminarExamenAdaptado (12);


-- LEER LOS DATOS DE UN EXAMEN ADAPTADO POR SU ID
DELIMITER $$
CREATE PROCEDURE sp_leerExamenAdaptadoPorId(
    IN p_ExamenId INT
)
BEGIN
    SELECT * FROM examenadaptado WHERE ExamenId = p_ExamenId;
END $$
DELIMITER ;

-- prueba
CALL sp_leerExamenAdaptadoPorId(1);




-- //////////PROCEDIMIENTOS PARA INFORME PROGRESO

-- INSERTAR UN INFORME DE PROGRESO
DELIMITER $$
CREATE PROCEDURE sp_insertarInforme(
    IN p_EstudianteID INT,
    IN p_Progreso VARCHAR(255),
    IN p_FechaInforme DATE
)
BEGIN
    INSERT INTO informesprogreso(EstudianteID, Progreso, FechaInforme)
    VALUES (p_EstudianteID, p_Progreso, p_FechaInforme);
END $$
DELIMITER ;

-- Prueba:
CALL sp_insertarInforme(1, 'Sigue estudiando', '2024-10-10');


-- LEER LOS DATOS DE TODOS LOS INFORMES DE PROGRESO
DELIMITER $$
CREATE PROCEDURE sp_leerInformes()
BEGIN
    SELECT * FROM informesprogreso;
END $$
DELIMITER ;

-- Prueba:
CALL sp_leerInformes();


-- ACTUALIZAR LOS DATOS DE UN INFORME DE PROGRESO
DELIMITER $$
CREATE PROCEDURE sp_actualizarInforme(
    IN p_InformeID INT,
    IN p_EstudianteID INT,
    IN p_Progreso VARCHAR(255),
    IN p_FechaInforme DATE
)
BEGIN
    UPDATE informesprogreso
    SET EstudianteID = p_EstudianteID, Progreso = p_Progreso, FechaInforme = p_FechaInforme
    WHERE InformeID = p_InformeID;
END $$
DELIMITER ;

-- Prueba:
CALL sp_actualizarInforme(11,1, 'Sigue así', '2024-10-09');


-- ELIMINAR LOS DATOS DE UN INFORME DE PROGRESO
DELIMITER $$
CREATE PROCEDURE sp_eliminarInforme(
    IN p_InformeId INT
)
BEGIN
    DELETE FROM informesprogreso WHERE InformeId = p_InformeId;
END $$
DELIMITER ;

-- prueba
CALL sp_eliminarInforme (11);


-- LEER LOS DATOS DE UN INFORME DE PROGRESO POR SU ID
DELIMITER $$
CREATE PROCEDURE sp_leerInformePorId(
    IN p_InformeId INT
)
BEGIN
    SELECT * FROM informesprogreso WHERE InformeId = p_InformeId;
END $$
DELIMITER ;

-- prueba
CALL sp_leerInformePorId(10);
