import java.util.Scanner;
public class LambdaTest{

  public static void main(String[] args){
  System.out.println("Introduzca un numero");
  Scanner res = new Scanner(System.in);
  double num = res.nextDouble();


  System.out.println("Introduzca otro numero");
  res = new Scanner(System.in);
  double num2 = res.nextDouble();
  //Prom calcPromedio = (double a,double b) -> System.out.println((a+b)/2);
  Thread promedio = new Thread( () ->  System.out.println( (num+num2)/2 ) );
  promedio.run();
  }
}
