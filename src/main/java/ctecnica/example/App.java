package ctecnica.example;

import ctecnica.example.entity.Block;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    Block bloque1 = new Block();
    System.out.println("Enter datas from bloque 1 ID , Orientation (v/h) , Position X , Position Y and Length");
    bloque1.setId(teclado.nextInt());
    teclado.nextLine();
    bloque1.setOrientation(teclado.nextLine().toLowerCase());
    bloque1.setPositionX(teclado.nextInt());
    bloque1.setPositionY(teclado.nextInt());
    bloque1.setLength(teclado.nextInt());

    Block bloque2 = new Block();
    bloque2.setId(teclado.nextInt());
    teclado.nextLine();
    bloque2.setOrientation(teclado.nextLine().toLowerCase());
    bloque2.setPositionX(teclado.nextInt());
    bloque2.setPositionY(teclado.nextInt());
    bloque2.setLength(teclado.nextInt());
    teclado.close();


    Game game = new Game();
    try {
      if (game.overloap(bloque1, bloque2)) {
        System.out.println("overloap");
      } else {
        System.out.println("not overloap");
      }

    } catch (Exception e) {
      System.out.println("Error" + e.getMessage());
    }

  }
}
