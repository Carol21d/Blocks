package ctecnica.example;

import java.util.Scanner;

// import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    //    String bloque;
    //    Scanner entrada = new Scanner(System.in);
    //    System.out.println("introduce bloque 1");
    //    bloque = entrada.nextLine();
    //    System.out.println(bloque);

    Game game = new Game();
    String result = game.bloque("0235");
    System.out.println(result);
        

      
       
       
       
    }
}
