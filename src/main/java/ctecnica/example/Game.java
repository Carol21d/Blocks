package ctecnica.example;

import ctecnica.example.entity.Block;
import ctecnica.example.entity.Piece;

public class Game {
    // methods

    public boolean overloap(Piece bloque1, Piece bloque2) throws Exception {

        
        if(!(bloque1 instanceof Block) ||!(bloque2 instanceof Block)){
            throw new Exception("error");
        }

         Block block1 = (Block) bloque1;
         Block block2 = (Block) bloque2;
         
         if(block1.horizontal(block2)|| block1.vertical(block2)){
            return true;
         }
        return false;
    }

}
