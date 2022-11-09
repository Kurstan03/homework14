public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    void singing(){
        System.out.println("singing in kyrgyz");

    }
    void playGuitar(){
        System.out.println("play guitar in concert");

    }

    @Override
    public String toString() {
        return "Singer" +
                "\nname: " + getName()+
                "\ndesignation: " + getDesignation()+
                "\nband name: " + getBandName();
    }
}
