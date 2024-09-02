import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point(){
        //No args constructor
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // GETTERS
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double distance(){
        //x=0 & y=0
        return  sqrt((this.x^2 - 0) + (this.y^2 - 0));
    }

    public double distance(Point pt){
        //x=0 & y=0
        return  sqrt((this.x^2 - pt.x^2) + (this.y^2 - pt.y^2));
    }

    public double distance(int x, int y){
        //x=0 & y=0
        return  sqrt((this.x^2 - x^2) + (this.y^2 - y^2));
    }

    // SETTERS
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
}