TO RUN

=============================

Create a database on oracle and changes the properties **dabaseUrl**, **databaseUsername** and **databasePassword**

  

FUNCTION SCRIPT

=============================

The follow are the scripts to create the function

  

### Create object

>create or replace type sell_record as object (sell_id number,sell_value float);

  

### Create type

>create or replace type sellr_table as table of sell_record;

  

### Create function

>create or replace function obtener_ventas_empleado (employee_id IN NUMBER) return sellr_table as sells_return sellr_table:=sellr_table(); 
>begin 
>for i in (SELECT ID_VENTA,SELL_VALUE FROM SELL WHERE EMPLOYEE_ID =employee_id) loop
>sells_return.EXTEND;
>sells_return(sells_return.count) := (sell_record(i.ID_VENTA, i.SELL_VALUE)) ;
>end loop;
>return sells_return;
>end;