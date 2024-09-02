public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){}

    public Dog(String type, double weight){
        this(type, weight, "perky", "curved"); //
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight <= 15 ?  "small" : weight > 15 && weight <= 30 ? "Medium" : "Huge", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){ //this method overrides the Animal.makeNoise
    }

    @Override
    public void move(String speed) {
        super.move(speed); //calls the original method
        System.out.println("Dogs run and walk"); //adds additional functionality
    }
}
