package ctecnica.example.entity;

public class Block extends Piece {

    int length;
    String orientation;
    int positionX;
    int positionY;
    int width = 1;
    int id = 0;

    public Block(){
        super();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // methods

 

    @Override
    public void horizontal() {
        // TODO Auto-generated method stub
        System.out.println("orientation h");
    }

    @Override
    public void vertical() {
        // TODO Auto-generated method stub
       System.out.println(" v");
    }
    


























    // public boolean overlap(Block block) {
    //     //comprobamos si se superponen o no 
    //     // estan en orientacion h
    //     if(block.orientation == "h"){
    //         return positionY == block.positionY && (positionX <= block.positionX && block.positionX < positionX + length || block.positionX <= positionX && positionX < block.length);


    //     } else{
    //         return positionY <= block.positionY && block.positionY < positionY + 1 && positionX <= block.positionX && block.positionX < positionX + length;
    //     }



    //     // if(block.orientation == "v"){
    //     //     return positionX == block.positionX && ( positionY <= block.positionY && block.positionY < positionY + length || block.positionY <= positionY && positionY < block.length);
    //     // }   



    // }

}
