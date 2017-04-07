
/*PAQUETE*/
CREATE or replace package gest_centros is

type total is ref Cursor;


procedure visualiza_lista_centro (c_centros out total);
procedure visualizar_datos_centros(p_id in number,c_centro out total,n_total out number) ;
/*sobrecargada*/
procedure visualizar_datos_centros(pnom_centro in varchar2,c_centros out total,n_total out number );
procedure buscar_por_nombre(n_cntros in varchar2,pn_centro out number);
procedure insertar_centro(n_centro in varchar2,p_provincia in varvhar2);
procedure borrar_centro (n1_centro in number,n2_centro in number);
procedure cambiar_provincia (n_centro in number,p_provincia in varchar2);
end;
Create or replace package  body gest_centros is
 procedure visualiza_lista_centro(c_centros out total) is
   begin
    open total for
        select * from centros;
     close total;
   end  visualiza_lista_centro;
procedure  visualizar_datos_centros(p_id in number,c_centro out total,n_total out number) is
begin
        open total for
        select * from centros where id=p_id;
        select count(dni)as n_total into total from trabajadores where idcentros=p_id;
        /*como tengo count...por si acaso no hay nada-----if o excepciones*/
        if total is null then 
        RAISE_APPLICATION_ERROR(-20100,'VACIO');
        end if;
        close total;
end visualizar_datos_centros; 
 /*sobre con llamada ala anteiror*/
 procedure visualizar_datos_centros(pnom_centro in varchar2,c_centros out total,n_total out number )is
 
 
 p_id centros.id%type;
 begin
 
 p_id:=visualizar_datos_centros(pnom_centro);
 
     open total for
        select * from centros where id=p_id;
        select count(dni)as n_total into total from trabajadores where idcentros=p_id;
        /*como tengo count...por si acaso no hay nada-----if o excepciones*/
        if total is null then 
        RAISE_APPLICATION_ERROR(-20100,'VACIO');
        end if;
        close total;
end;        

end;



