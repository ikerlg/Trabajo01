-- Generado por Oracle SQL Developer Data Modeler 4.1.1.888
--   en:        2017-04-04 16:42:45 CEST
--   sitio:      Oracle Database 12c
--   tipo:      Oracle Database 12c




DROP TABLE Acceso CASCADE CONSTRAINTS ;

DROP TABLE Centro CASCADE CONSTRAINTS ;

DROP TABLE Parte CASCADE CONSTRAINTS ;

DROP TABLE Trabajador CASCADE CONSTRAINTS ;

DROP TABLE Vehiculo CASCADE CONSTRAINTS ;

DROP TABLE Viaje CASCADE CONSTRAINTS ;

CREATE TABLE Acceso
  (
    usuario        VARCHAR2 (9) NOT NULL ,
    contrasena     VARCHAR2 (10) NOT NULL ,
    Trabajador_dni VARCHAR2 (9) NOT NULL
  ) ;
CREATE UNIQUE INDEX Acceso__IDX ON Acceso
  (
    Trabajador_dni ASC
  )
  ;
ALTER TABLE Acceso ADD CONSTRAINT Acceso_PK PRIMARY KEY ( usuario, contrasena ) ;


CREATE TABLE Centro
  (
    idCentro  VARCHAR2 (3) NOT NULL ,
    nombre    VARCHAR2 (15) NOT NULL ,
    calle     VARCHAR2 (20) NOT NULL ,
    numero    INTEGER NOT NULL ,
    codPostal INTEGER NOT NULL ,
    ciudad    VARCHAR2 (20) NOT NULL ,
    provincia VARCHAR2 (15) NOT NULL ,
    telefono  INTEGER NOT NULL
  ) ;
ALTER TABLE Centro ADD CONSTRAINT Centro_PK PRIMARY KEY ( idCentro ) ;


CREATE TABLE Parte
  (
    idParte            VARCHAR2 (9) NOT NULL ,
    fecha              DATE NOT NULL ,
    kmInicio           NUMBER NOT NULL ,
    kmFinal            NUMBER NOT NULL ,
    incidencias        VARCHAR2 (70) ,
    avisos             VARCHAR2 (70) NOT NULL ,
    finalizado         CHAR (1) NOT NULL ,
    gasoil             NUMBER ,
    autopistas         NUMBER ,
    dietas             NUMBER ,
    otrosGastos        NUMBER ,
    horasTrabajadas    NUMBER NOT NULL ,
    Trabajador_dni     VARCHAR2 (9) NOT NULL ,
    Vehiculo_matricula VARCHAR2 (7) NOT NULL
  ) ;
CREATE UNIQUE INDEX Parte__IDX ON Parte
  (
    Vehiculo_matricula ASC
  )
  ;
ALTER TABLE Parte ADD CONSTRAINT Parte_PK PRIMARY KEY ( idParte ) ;


CREATE TABLE Trabajador
  (
    dni               VARCHAR2 (9) NOT NULL ,
    nombre            VARCHAR2 (15) NOT NULL ,
    apellido1         VARCHAR2 (15) NOT NULL ,
    apellido2         VARCHAR2 (15) ,
    calle             VARCHAR2 (20) NOT NULL ,
    numeroPortal      INTEGER NOT NULL ,
    piso              INTEGER NOT NULL ,
    mano              VARCHAR2 (8) NOT NULL ,
    telfEmpresa       INTEGER NOT NULL ,
    telfPersonal      INTEGER ,
    fechaNacimiento   DATE ,
    salario           NUMBER ,
    categoria         VARCHAR2 (25) NOT NULL ,
    Centro_idCentro   VARCHAR2 (3) NOT NULL ,
    Acceso_usuario    VARCHAR2 (9) NOT NULL ,
    Acceso_contrasena VARCHAR2 (10) NOT NULL
  ) ;
CREATE UNIQUE INDEX Trabajador__IDX ON Trabajador
  (
    Acceso_usuario ASC , Acceso_contrasena ASC
  )
  ;
ALTER TABLE Trabajador ADD CONSTRAINT Trabajador_PK PRIMARY KEY ( dni ) ;


CREATE TABLE Vehiculo
  (
    matricula     VARCHAR2 (7) NOT NULL ,
    tipo          VARCHAR2 (15) NOT NULL ,
    km            NUMBER NOT NULL ,
    Parte_idParte VARCHAR2 (9) NOT NULL
  ) ;
CREATE UNIQUE INDEX Vehiculo__IDX ON Vehiculo
  (
    Parte_idParte ASC
  )
  ;
ALTER TABLE Vehiculo ADD CONSTRAINT Vehiculo_PK PRIMARY KEY ( matricula ) ;


CREATE TABLE Viaje
  (
    albaran       VARCHAR2 (10) NOT NULL ,
    horaInicio    DATE NOT NULL ,
    horaFin       DATE NOT NULL ,
    Parte_idParte VARCHAR2 (9) NOT NULL
  ) ;
ALTER TABLE Viaje ADD CONSTRAINT Viaje_PK PRIMARY KEY ( albaran ) ;


ALTER TABLE Acceso ADD CONSTRAINT Acceso_Trabajador_FK FOREIGN KEY ( Trabajador_dni ) REFERENCES Trabajador ( dni ) ;

ALTER TABLE Parte ADD CONSTRAINT Parte_Trabajador_FK FOREIGN KEY ( Trabajador_dni ) REFERENCES Trabajador ( dni ) ;

ALTER TABLE Parte ADD CONSTRAINT Parte_Vehiculo_FK FOREIGN KEY ( Vehiculo_matricula ) REFERENCES Vehiculo ( matricula ) ;

ALTER TABLE Trabajador ADD CONSTRAINT Trabajador_Acceso_FK FOREIGN KEY ( Acceso_usuario, Acceso_contrasena ) REFERENCES Acceso ( usuario, contrasena ) ;

ALTER TABLE Trabajador ADD CONSTRAINT Trabajador_Centro_FK FOREIGN KEY ( Centro_idCentro ) REFERENCES Centro ( idCentro ) ;

ALTER TABLE Vehiculo ADD CONSTRAINT Vehiculo_Parte_FK FOREIGN KEY ( Parte_idParte ) REFERENCES Parte ( idParte ) ;

ALTER TABLE Viaje ADD CONSTRAINT Viaje_Parte_FK FOREIGN KEY ( Parte_idParte ) REFERENCES Parte ( idParte ) ;


-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             6
-- CREATE INDEX                             4
-- ALTER TABLE                             13
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- TSDP POLICY                              0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
