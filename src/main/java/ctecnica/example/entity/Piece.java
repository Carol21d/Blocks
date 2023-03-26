package ctecnica.example.entity;

public abstract class Piece {
    
     //atributos
     int length;
     String orientation;
     int positionX;
     int positionY;
     int width = 1;
     int id = 0;

     //constructores
    public Piece(int length, String orientation, int positionX, int positionY, int width, int id) {
        this.length = length;
        this.orientation = orientation;
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.id = id;
    }

    //constructor vacio
    public Piece(){}



    //getters y setters
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

     
 
     
    
 
}
