public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer(
                "Kurstan",
                "Backend devoloper",
                "Peaksoft");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("------------------------------------------");

        Dancer dancer = new Dancer(
                "Henry",
                "balet dancer",
                "Ballet and B-Boys");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("------------------------------------------");

        Singer singer = new Singer(
                "Kurt",
                "vocalist",
                "Nirvana");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();
        System.out.println("------------------------------------------");

    }
}