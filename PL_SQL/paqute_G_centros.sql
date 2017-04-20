
CREATE or replace package paquetecentros is
		type tipocursor  is SYS_REFCURSOR;
		PROCEDURE consulta_Centro (vnombre in Centro.nombre%type,consultaC OUT SYS_REFCURSOR);
		PROCEDURE listacentros(nombreC out tipocursor);
	end gest_centros;
/*-------------------------------------------------------------------*/

CREATE or replace package body gest_centros is
 PROCEDURE listacentros(nombreC out tipocursor) IS
        BEGIN
        OPEN nombreC FOR
        SELECT "A1"."NOMBRE" "NOMBRE" FROM "PROYECTOFINAL"."CENTRO" "A1";
    CLOSE nombreC;
    END;
PROCEDURE consulta_Centro (vnombre in Centro.nombre%type,consultaC OUT SYS_REFCURSOR) AS
    BEGIN
    OPEN consultaC FOR
        SELECT * FROM TRABAJADOR WHERE nombre=vnombre;
    CLOSE consultaC;
    END;

end;



