import java.util.Scanner;

public class CriaturaTesting{


  public static void main(String[] args){
    System.out.println("Datos default");
    System.out.println("Qué tipo de criatura? (a/m)");
    Scanner res = new Scanner(System.in);
    String ans = res.next();
    if(ans.equalsIgnoreCase("a")){
      CreaAnimal creador = new CreaAnimal();
      Gato gato1 = creador.construye("Misifustofeles","negro/blanco");
      System.out.println("Gato normal");
      gato1.info();
      AnimalDef gato2 = creador.construyeDeforme(4,'n',1,"negro/blanco",4);
      System.out.println("Gato deforme");
      gato2.info();

    }else{
      CreaMonstruo creadorM = new CreaMonstruo();
      Troloide monst1 = creadorM.construyeDeforme("Timidito","Caverna detras del arbusto",3, 's',2,"gris");
      System.out.println("Monstruo");
      monst1.info();
    }
  }
}
