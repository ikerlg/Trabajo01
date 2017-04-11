create or replace PROCEDURE consulta_trabajador (vDni in trabajador.dni%type,
consultaT OUT SYS_REFCURSOR) AS
BEGIN
OPEN consultaT FOR
SELECT * FROM TRABAJADOR WHERE dni=vDni;
CLOSE consultaT;
END;