create or replace PROCEDURE consulta_Centro (vnombre in Centro.nombre%type,
consultaC OUT SYS_REFCURSOR) AS
BEGIN
OPEN consultaC FOR
SELECT * FROM TRABAJADOR WHERE nombre=vnombre;
CLOSE consultaC;
END;