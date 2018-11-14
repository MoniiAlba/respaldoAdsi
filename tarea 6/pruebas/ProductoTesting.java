import java.util.Scanner;

public class ProductoTesting{
  public static void pruebaProd(Producto prod, String fechaIn, String fechaOut){
    prod.info();
    prod.ingresaInv(fechaIn);
    prod.sacaInv(fechaOut);
  }

  public static void main(String[] args){
    System.out.println("Qué tipo de producto? (l/c)");
    Scanner res = new Scanner(System.in);
    String ans = res.next();
    if(ans.equalsIgnoreCase("l")){
      pruebaProd(new Leche(),"15/08/18","20/09/18");
    }else{
      pruebaProd(new Cereal(),"15/07/18","20/01/19");
    }

    System.out.println("Qué tipo de producto? (l/c)");
    Scanner res1 = new Scanner(System.in);
    String ans1 = res1.next();

    System.out.println("Ingrese nombre");
    Scanner nom = new Scanner(System.in);
    String nombre = nom.next();

    System.out.println("Ingrese fecha de caducidad");
    Scanner fec = new Scanner(System.in);
    String fecha = fec.next();

    if(ans1.equalsIgnoreCase("l")){
      pruebaProd(new Leche(nombre,fecha),"15/08/18","20/09/18");
    }else{
      pruebaProd(new Cereal(nombre,fecha),"15/07/18","20/01/19");
    }
  }
}
