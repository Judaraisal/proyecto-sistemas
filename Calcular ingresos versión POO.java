/**
 * Write a description of class ingresoprincipal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ingresoprincipal
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numMes;
        ingresoPOO[] losMeses = new ingresoPOO[50];
        String nit, año, nombredelmes;
        double ingreso1, ingreso2, ingreso3;
        double promedio = 0;
       
        System.out.println("Digíte el numero de meses");
        numMes = sc.nextInt();
        for(int i = 0; i < numMes; i++){
            System.out.println("Digíte el nit de la tienda");
            nit = sc.next();
            System.out.println("Digíte el año");
            año = sc.next();
            System.out.println("Digíte el nombre del mes");
            nombredelmes = sc.next();
            System.out.println("Digíte el ingreso 1 del mes");
            ingreso1 = sc.nextDouble();
            System.out.println("Digíte el ingreso 2 del mes");
            ingreso2 = sc.nextDouble();
            System.out.println("Digíte el ingreso 3 del mes");
            ingreso3 = sc.nextDouble();
            ingresoPOO unMes = new ingresoPOO();
            unMes.nit = nit;
            unMes.año = año;
            unMes.nombredelmes = nombredelmes;
            unMes.ingresouno = ingreso1;
            unMes.ingresodos = ingreso2;
            unMes.ingresotres = ingreso3;
            losMeses[i] = unMes;
        }
        for(int i = 0; i < numMes; i++){
            double sum = (losMeses[i].ingresouno + losMeses[i].ingresodos + losMeses[i].ingresotres)/3;
            promedio = promedio + sum / numMes;
        }
        System.out.println("EL promedio de ingresos es: "+ promedio);
    }
}
}
