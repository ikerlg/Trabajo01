DROP TABLE Viaje CASCADE CONSTRAINTS ;

DROP TABLE Parte CASCADE CONSTRAINTS ;

DROP TABLE Vehiculo CASCADE CONSTRAINTS ;

DROP TABLE Acceso CASCADE CONSTRAINTS ;

DROP TABLE Trabajador CASCADE CONSTRAINTS ;

DROP TABLE Centro CASCADE CONSTRAINTS ;

---------------------------------------------------------------
CREATE TABLE Centro
  (
    idCentro	NUMBER (3)
		GENERATED ALWAYS AS IDENTITY 
                        MINVALUE 1 
                        MAXVALUE 999
                        INCREMENT BY 1 
                        START WITH 1  
                        NOORDER  
                        NOCYCLE  NOT NULL ENABLE
		CONSTRAINT Centro_PK PRIMARY KEY ,
    nombre    VARCHAR2 (15) NOT NULL ,
    calle     VARCHAR2 (20) NOT NULL ,
    numero    NUMBER   (15) NOT NULL ,
    codPostal NUMBER   (15) NOT NULL ,
    ciudad    VARCHAR2 (20) NOT NULL ,
    provincia VARCHAR2 (15) NOT NULL ,
    telefono  NUMBER   (15) NOT NULL 
  ) ;


CREATE TABLE Trabajador
  (
    dni               VARCHAR2 (9) NOT NULL ,
    nombre            VARCHAR2 (15) NOT NULL ,
    apellido1         VARCHAR2 (15) NOT NULL ,
    apellido2         VARCHAR2 (15) ,
    calle             VARCHAR2 (20) NOT NULL ,
    numeroPortal      NUMBER   (15) NOT NULL ,
    piso              NUMBER   (15) NOT NULL ,
    mano              VARCHAR2 (8)  NOT NULL ,
    telfEmpresa       NUMBER   (15) NOT NULL ,
    telfPersonal      NUMBER   (15) ,
    fechaNacimiento   DATE ,
    salario           NUMBER   (15),
    categoria         VARCHAR2 (1) NOT NULL ,
    Centro_idCentro   NUMBER   (3)  NOT NULL ,
    CONSTRAINT Trabajador_PK PRIMARY KEY ( dni ),
    CONSTRAINT Trabajador_Centro_FK FOREIGN KEY ( Centro_idCentro ) REFERENCES Centro ( idCentro ),
    CONSTRAINT CHK_Cat CHECK ((categoria = 'a') or (categoria = 'l'))
  ) ;

CREATE TABLE Acceso
  (
    usuario        VARCHAR2 (9)  NOT NULL ,
    contrasena     VARCHAR2 (10) NOT NULL ,
    Trabajador_dni VARCHAR2 (9)  NOT NULL ,
    CONSTRAINT Acceso_PK PRIMARY KEY ( usuario, contrasena ) ,
    CONSTRAINT Acceso_Trabajador_FK FOREIGN KEY ( Trabajador_dni ) REFERENCES Trabajador ( dni )
  ) ;

CREATE TABLE Vehiculo
  (
    matricula     VARCHAR2 (7)  NOT NULL ,
    tipo          VARCHAR2 (15) NOT NULL ,
    km            NUMBER   (15) NOT NULL ,
    CONSTRAINT Vehiculo_PK PRIMARY KEY ( matricula )
  ) ;

CREATE TABLE Parte
  (
    idParte   NUMBER (6)
		GENERATED ALWAYS AS IDENTITY 
                        MINVALUE 1 
                        MAXVALUE 999999
                        INCREMENT BY 1 
                        START WITH 1  
                        NOORDER  
                        NOCYCLE  NOT NULL ENABLE
		CONSTRAINT Parte_PK PRIMARY KEY ,
    fecha              DATE          NOT NULL ,
    kmInicio           NUMBER   (15) NOT NULL ,
    kmFinal            NUMBER   (15) NOT NULL ,
    incidencias        VARCHAR2 (70) ,
    avisos             VARCHAR2 (70) NOT NULL ,
    finalizado         CHAR (1)      NOT NULL ,
    gasoil             NUMBER   (15),
    autopistas         NUMBER   (15),
    dietas             NUMBER   (15),
    otrosGastos        NUMBER   (15),
    horasTrabajadas    NUMBER   (15)NOT NULL ,
    Trabajador_dni     VARCHAR2 (9) NOT NULL ,
    Vehiculo_matricula VARCHAR2 (7) NOT NULL,
    CONSTRAINT Parte_Trabajador_FK FOREIGN KEY ( Trabajador_dni ) REFERENCES Trabajador ( dni ) , 
    CONSTRAINT Parte_Vehiculo_FK FOREIGN KEY ( Vehiculo_matricula ) REFERENCES Vehiculo ( matricula )
  ) ;

CREATE TABLE Viaje
  (
    idViaje   NUMBER (6)
		GENERATED ALWAYS AS IDENTITY 
                        MINVALUE 1 
                        MAXVALUE 999999
                        INCREMENT BY 1 
                        START WITH 1  
                        NOORDER  
                        NOCYCLE  NOT NULL ENABLE
		CONSTRAINT idViaje PRIMARY KEY ,
    horaInicio      DATE NOT NULL ,
    horaFin         DATE NOT NULL ,
    Parte_idParte 	NUMBER (6) NOT NULL , 
    CONSTRAINT Viaje_Parte_FK FOREIGN KEY ( Parte_idParte ) REFERENCES Parte ( idParte )
  ) ;

-- INSERTAR DATOS DE PRUEBA:

--desc centro
-- insertar un centro
--insert into centro values(DEFAULT, 'Informatica', 'Pradera', 2, 01002, 'vitoria', 'alava', 945268459);

--select *
--from centro;

--desc trabajador
-- insertar un trabajador
--insert into trabajador values('11111111A', 'Miguel', 'Olmo', 'Hernando','Palomas', 1, 2, 'Derecha', 945268444, 945284123, '19/07/1988', 288, 'Administrador', 1);

--select *
--from trabajador;

--insert into trabajador values('44344434A', 'Jona', 'El', 'Piloto','LasCarreras', 1, 2, 'Derecha', 902201222, 903666666, '19/07/1988', 288, 'L', 1);