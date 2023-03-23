package ctecnica.example.entity;



public class Block {
    //atributos
    Integer length;
    String orientation;
    Integer positionX;
    Integer positionY;
    Integer width = 1;
    Integer id = 0;

    //constructores
    public Block(Integer length, String orientation, Integer positionX, Integer positionY, Integer width, Integer id) {
        this.length = length;
        this.orientation = orientation;
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.id = id;
    }
    
    


// constructor vacio
    public Block() {
    }





    //getters y setters
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    

    
    
   


   

    
   
  



   


}
