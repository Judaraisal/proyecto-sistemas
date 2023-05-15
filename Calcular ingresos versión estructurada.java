import java.util.Scanner;
public class Calcular_ingresos_estructurada
{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] nits = new String[50];
      String[] años = new String[50];
      String[] nombredelmess = new String[50];
      double[] ingresouno = new double[50];
      double[] ingresodos = new double[50];
      double[] ingresotres = new double[50];
      
      int numMes;
      String nit, año, nombredelmes;
      double ingreso1, ingreso2, ingreso3;
      double promedio = 0;
      
      System.out.println("Digíte el número de meses");
      numMes = sc.nextInt();
      
      for(int i = 0; i < numMes; i++){
          System.out.println("Digíte el nit de la tienda");
          nit = sc.next();
          
          System.out.println("Digíte el año");
          año = sc.next();
          
          System.out.println("Digíte el nombre del mes");
          nombredelmes = sc.next();
          
          System.out.println("Digíte el ingreso 1 del mes :");
          ingreso1 = sc.nextDouble();
          
          System.out.println("Digíte el ingreso 2 del mes:");
          ingreso2 = sc.nextDouble();
          
          System.out.println("Digíte el ingreso 3 del mes:");
          ingreso3 = sc.nextDouble();
          
          nits[i] = nit;
          años[i] = año;
          nombredelmess[i] = nombredelmes;
          ingresouno[i] = ingreso1;
          ingresodos[i] = ingreso2;
          ingresotres[i] = ingreso3;
        }
      for(int i = 0; i < numMes; i++){
          promedio = promedio + (ingresouno[i] + ingresodos[i] + ingresotres[i] /3)/numMes;
      }
      System.out.println("El promedio de notas es:" + promedio);
  }
}