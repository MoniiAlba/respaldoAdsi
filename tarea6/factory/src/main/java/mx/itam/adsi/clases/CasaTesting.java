package mx.itam.adsi.clases;

import java.util.Scanner;

public class CasaTesting{


  public static void main(String[] args){
    System.out.println("Sin datos agregados");
    System.out.println("Qué tipo de vivienda? (d/c)");
    Scanner res = new Scanner(System.in);
    String ans = res.next();
    if(ans.equalsIgnoreCase("d")){
      CreaDepto constructor = new CreaDepto();
      Depto depto1 = constructor.construye();
      depto1.info();

    }else{
      CreaCasa constructorC = new CreaCasa();
      Casa casa1 = constructorC.construye();
      casa1.info();
    }
    System.out.println("Con datos agregados");
    System.out.println("Qué tipo de vivienda? (d/c)");
    res = new Scanner(System.in);
    ans = res.next();

    System.out.println("Ingrese numero de habitaciones");
    Scanner hab = new Scanner(System.in);
    int nh = hab.nextInt();
    System.out.println("Ingrese numero de metros cuadrados");
    Scanner metros = new Scanner(System.in);
    double nm = metros.nextDouble();
    System.out.println("Ingrese la direccion");
    Scanner dir = new Scanner(System.in);
    String d = dir.nextLine();

    if(ans.equalsIgnoreCase("d")){
      System.out.println("Ingrese numero de estacionamientos");
      Scanner est = new Scanner(System.in);
      int ne = est.nextInt();
      System.out.println("Ingrese numero de piso");
      Scanner piso = new Scanner(System.in);
      int p = piso.nextInt();
      CreaDepto constructor = new CreaDepto();
      Depto depto1 = constructor.construye(p, nh, ne, nm, d);
      depto1.info();

    }else{
      System.out.println("Ingrese numero de estacionamientos");
      Scanner est = new Scanner(System.in);
      int ne = est.nextInt();
      System.out.println("Tiene jardin? (s/n)");
      Scanner jar = new Scanner(System.in);
      char j = jar.next().charAt(0);
      CreaCasa constructorC = new CreaCasa();
      Casa casa1 = constructorC.construye(j, nh, ne, nm, d);
      casa1.info();
    }
  }
}
