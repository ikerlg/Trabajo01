
CREATE or replace package gest_centros is
		consultaC SYS_REFCURSOR;
		PROCEDURE consulta_Centro (vnombre in Centro.nombre%type,consultaC OUT SYS_REFCURSOR);
		PROCEDURE listacentros(NOMBRE OUT SYS_REFCURSOR);
	end gest_centros;
/*-------------------------------------------------------------------*/

CREATE or replace package body gest_centros is
 PROCEDURE listacentros(NOMBRE OUT SYS_REFCURSOR) AS
        BEGIN
        OPEN NOMBRE FOR
        SELECT "A1"."NOMBRE" "NOMBRE" FROM "PROYECTOFINAL"."CENTRO" "A1";
    CLOSE NOMBRE;
    END;
PROCEDURE consulta_Centro (vnombre in Centro.nombre%type,consultaC OUT SYS_REFCURSOR) AS
    BEGIN
    OPEN consultaC FOR
        SELECT * FROM TRABAJADOR WHERE nombre=vnombre;
    CLOSE consultaC;
    END;

end;



