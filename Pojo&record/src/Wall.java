public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height){
        this.width = width >= 0 ? width : 0 ;
        this.height = height >= 0 ? height : 0;
    }

    // GETTERS
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width * height;
    }

    // SETTERS
    public void setWidth(double width){
        this.width = width >= 0 ? width : 0;
    }

    public void setHeight(double height){
        this.height = height >= 0 ? height : 0;
    }

}