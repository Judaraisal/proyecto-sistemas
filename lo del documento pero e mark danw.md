# Ejercicio Base:
#####  En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un administrador de empresas de una tienda de comidas rápidas, que desea calcular los ingresos durante un trimestre (3 meses) en un año determinado. Esta tienda evalúa a los ingresos de el negocio de forma permanente y calcula el promedio general del trimestre (3 meses). 
#####  Como información básica de cada mes se debe registrar: el total ingresos del mes, el nombre del mes y el número del año a calcular.
##### Aclaraciones:

##### • Se supondrá que la aplicación solo se requiere para calcular el promedio de un único trimestre especifico.
##### • Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
##### • No se realiza validación, ni se verifica calidad en los datos ingresados.


### Análisis del ejercicio:
#### Aproximación plantilla historia de usuario:

[![N|Solid](https://lh3.googleusercontent.com/WNjCfl6-w9vQ3i7sexU4GtVcW7sHRujMve8QTG6hbY_JHIXDkqlIUOYmFhQlcjCzcLV3U1HFG-gRPtCgYT7R7vGgQWlX1_Ez2SVJRVrw)
![N|Solid](https://lh3.googleusercontent.com/b3Asn1hI-4sG7g1yZ2rZ7wD_WFkjixW1ip2-8ojepoOKoEghWoJVWosH6qBxna8PFetSbEc5wH381IUtjOvEK2bsCgEp_EldeLJ_7LIQ)

## Aproximación caso de uso:

![N|Solid](https://lh3.googleusercontent.com/dBxtRRaqgj0GzUMWFucHeAJgUuAQe8PsRUkbx0jRz0tX9OUYIUg26frcjWbljICof4nQi2dUtQiBqKm8ZCcQswvIkcw19ygXtG2TwuKdqw) 

#### Descripción caso de uso
##### Nombre: Calcular promedio Ingresos Mensuales
##### Actores: Administrador de Empresas
##### Propósito: Guardar el nit de la tienda, el año, nombre del mes, y tres ingresos del mes para calcular su promedio.
##### Curso normal de eventos:
#####   1.  El Administrador ingresa la cantidad de meses.
#####  2.  El Administrador ingresa el nit de la tienda, año del mes, el nombre del mes, ingreso1, ingreso2, ingreso3 del mes.
#####  3.  Se calcula el promedio a partir de : ( ∑(ingreso 1, ingreso 2, ingreso 3) / Total ingresos) / Cantidad Meses 
#####  4.  Se muestra el promedio de los ingresos de los meses
##### postcondiciones: Promedio de ingresos calculado 
##### .

### Aproximación Diagrama de Flujo:
![N|Solid](https://lh3.googleusercontent.com/1gM-8L9YiDd8P4Dds6JY6b6Z8evBTAN99sf45ZcmrulRwqSh0WBNoqnDH5-wPI1sEnVb9XWCwNnhSoi5mLNK8oHVD3BTYuuVnzhzyaTz)
#### Aproximación seudocódigo          
###### .
#### Inicio 

######	Caracteres: nits [50], años [50], nombredelmess [50] 
######	Real: ingresouno [50], ingresodos [50], ingresotres [50] 
######	Caracteres: nit, año, nombredelmes 
######	Entero: numMes, i 
######	Real: ingreso1, ingreso2, ingreso 3, promedio <- 0 
######	Imprimir: ‘Digite el número de meses:’ 
######	Asignar: numMes 
######	Para i=0 hasta numMes - 1, 1 
######	Imprimir: ‘Digite el nit de la tienda:’ 
######	Asignar: nit 
######	Imprimir: ‘Digite el año:’ 
######	Asignar: año 
######	Imprimir: ‘Digite el nombre del mes:’ 
######	Asignar: nombredelmes 
######	Imprimir: ‘Digite el ingreso 1 del mes’ 
######	Asignar: ingresouno 
######	Imprimir: ‘Digite el ingreso 2 del mes:’ 
######	Asignar: ingresodos 
######	Imprimir: ‘Digite el ingreso 3 del mes:’ 
######	Asignar: ingresotres 
######	nits[i] <- nit 
######	años [i] <- año 
######	nombredelmess [i] <- nombredelmes 
######	ingresouno[i] <- ingreso1 
######	ingresodos[i] <- ingreso2 
######	ingresotres[i] <- ingreso3 
######	finPara 
######	Para i=0 hasta numMes -1, 1 
######	promedio <- promedio +((ingresouno[i]+ingresodos[i]+ingresotres[i])/3)numMes 
######	finPara 
######	Imprimir: ‘El promedio es:’ + promedio 
###### Fin

















  
