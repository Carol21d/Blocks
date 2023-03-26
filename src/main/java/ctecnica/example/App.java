package ctecnica.example;

import ctecnica.example.entity.Block;

// import ctecnica.example.entity.Block;

// import java.util.Scanner;

// import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
    //    String bloque;
    //    Scanner entrada = new Scanner(System.in);
    //    System.out.println("introduce bloque 1");
    //    bloque = entrada.nextLine();
    //    System.out.println(bloque);

    // Game bloque1 = new Game();
    // // Game bloque2 = new Game();
    // String result = bloque1.bloque("0235");
    
    // System.out.println(result);


  /// metodo de abstraccion 
//    Block b = new Block();
//    b.horizontal();
//    b.vertical();


// error salta a "no lo hacen"
  // Game bloque1 = new Game(0,"h",2,3,1);
  // Game bloque2 = new Game(1, "h", 2, 3, 1);
  //      if(bloque1.overloap(false, true)){
  //       System.out.println("si lo hacen");
  //      }else{
  //       System.out.println("no lo hacen");
  //      }
  
      Block bloque1 = new Block();
      bloque1.setId(0);
      bloque1.setOrientation("h");
      bloque1.setPositionX(2);
      bloque1.setPositionY(3);
      bloque1.setLength(1);

      Block bloque2 = new Block();
      bloque2.setId(1);
      bloque2.setOrientation("h");
      bloque2.setPositionX(2);
      bloque2.setPositionY(3);
      bloque2.setLength(1);

      Game game = new Game();
      try {
        if(game.overloap(bloque1, bloque2)){
          System.out.println("se superpornen");
        }else{
          System.out.println("no se superponen");
        }
        
      } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
      }
       
       
       
    }
}
