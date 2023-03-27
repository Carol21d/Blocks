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
    System.out.println("Enter datas from block 1:  ");
    System.out.println("Enter id: ");
    bloque1.setId(teclado.nextInt());
    teclado.nextLine();
    System.out.println("Enter orientation vertical(v) or horizontal(h):  ");
    bloque1.setOrientation(teclado.nextLine().toLowerCase());
    System.out.println("Enter position X: ");
    bloque1.setPositionX(teclado.nextInt());
    System.out.println("Enter position Y: ");
    bloque1.setPositionY(teclado.nextInt());
    System.out.println("Enter length: ");
    bloque1.setLength(teclado.nextInt());

    Block bloque2 = new Block();
    System.out.println("Enter datas from block 2: ");
    System.out.println("Enter id: ");
    bloque2.setId(teclado.nextInt());
    teclado.nextLine();
    System.out.println("Enter orientation vertical(v) or horizontal(h): ");
    bloque2.setOrientation(teclado.nextLine().toLowerCase());
    System.out.println("Enter position X:  ");
    bloque2.setPositionX(teclado.nextInt());
    System.out.println("Enter position Y: ");
    bloque2.setPositionY(teclado.nextInt());
    System.out.println("Enter length: ");
    bloque2.setLength(teclado.nextInt());
    teclado.close();

    Game game = new Game();
    try {
      if (game.overloap(bloque1, bloque2)) {
        System.out.println("The blocks overloap");
      } else {
        System.out.println("The blocks dont overloap");
      }

    } catch (Exception e) {
      System.out.println("Error" + e.getMessage());
    }

  }
}
