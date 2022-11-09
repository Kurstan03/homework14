public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    void learn(){
        System.out.println("always learn something new");

    }
    void walk(){
        System.out.println("walk in the park");

    }
    void eat(){
        System.out.println("eat vitamin food");

    }

}
