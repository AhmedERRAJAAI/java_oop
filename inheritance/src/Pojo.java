public class Pojo {
    private String name;
    private String id;
    private String dateOfBirth;
    private String classList;

    public Pojo(String name, String id, String dateOfBirth, String classList) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override //this is annotation
    public String toString() { //used to print the current state of the class instance
        return "Pojo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
