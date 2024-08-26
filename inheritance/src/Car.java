public class Car {
//    private String make = "Mercedes"; //="default"
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

//    Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake() {
        return make;
    }

    //    Setters
    public void setModel(String model) {

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    public void setMake(String make) {
        if (make == null) make = "unknown";
        make = make.toUpperCase();
        switch (make){
            case "BMW", "VOLVO", "DACIA" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void describeCar() {
        System.out.println("model : " + model + ", doors " + doors + ", color " + color + ", make " + make + (convertible ? ", convertible" : ", not convertible"));
    }
}
