package ctecnica.example;

import java.util.Scanner;

import ctecnica.example.entity.Block;

// import ctecnica.example.entity.Block;

// import java.util.Scanner;

// import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    // String bloque;
    // Scanner entrada = new Scanner(System.in);
    // System.out.println("introduce bloque 1");
    // bloque = entrada.nextLine();
    // System.out.println(bloque);

    // Game bloque1 = new Game();
    // // Game bloque2 = new Game();
    // String result = bloque1.bloque("0235");

    // System.out.println(result);

    /// metodo de abstraccion
    // Block b = new Block();
    // b.horizontal();
    // b.vertical();

    // error salta a "no lo hacen"
    // Game bloque1 = new Game(0,"h",2,3,1);
    // Game bloque2 = new Game(1, "h", 2, 3, 1);
    // if(bloque1.overloap(false, true)){
    // System.out.println("si lo hacen");
    // }else{
    // System.out.println("no lo hacen");
    // }

    // Block bloque1 = new Block();
    // bloque1.setId(0);
    // bloque1.setOrientation("h");
    // bloque1.setPositionX(2);
    // bloque1.setPositionY(3);
    // bloque1.setLength(1);

    // Block bloque2 = new Block();
    // bloque2.setId(1);
    // bloque2.setOrientation("h");
    // bloque2.setPositionX(2);
    // bloque2.setPositionY(3);
    // bloque2.setLength(1);

    // Block bloque1 = new Block();
    int id;
    String orientation;
    int positionX;
    int positionY;
    int length;

    // Block bloque2 = new Block();
    // int id2;
    // String orientation2;
    // int positionX2;
    // int positionY2;
    // int width2;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Enter datas from bloque 1 orientation , id , position X , position Y  y  lenght");
    //orientation debe ir primero si lo colocamos luego de id da error 
    orientation = teclado.nextLine().toLowerCase();
    id = teclado.nextInt();
    positionX = teclado.nextInt();
    positionY = teclado.nextInt();
    length = teclado.nextInt();
    teclado.close();

    // System.out.println("orientation "+orientation);
    // System.out.println("id " +id);
    // System.out.println("X "+positionX);
    // System.out.println("Y "+positionY);
    // System.out.println("L "+length);
    System.out.println( " Block 1 is : "+ id + orientation + positionX + positionY + length);

    // Game game = new Game();
    // try {
    // if(game.overloap(bloque1, bloque2)){
    // System.out.println("se superpornen");
    // }else{
    // System.out.println("no se superponen");
    // }

    // } catch (Exception e) {
    // System.out.println("Error" + e.getMessage());
    // }

  }
}
