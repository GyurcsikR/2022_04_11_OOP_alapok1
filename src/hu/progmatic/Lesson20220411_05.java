package hu.progmatic;

public class Lesson20220411_05 {
    public static void main(String[] args) {

        Spaceship rombolo = new Spaceship();
        rombolo.id = "LV426";
        rombolo.type = "Medium";
        rombolo.isFreight = false;
        rombolo.speed = 300;

        Spaceship nautilus = new Spaceship();
        nautilus.id = "LV999";
        nautilus.type = "Large";
        nautilus.isFreight = true;
        nautilus.speed = 100;

        Spaceship terraforer = new Spaceship();
        terraforer.id = "LV10000";
        terraforer.type = "Extralarge";
        terraforer.isFreight = false;
        terraforer.speed = 200;

        printShipData(rombolo);
        printShipData(nautilus);
        printShipData(terraforer);

        Spaceship[] spaceships = {
                new Spaceship("LV426", "Medium", false, 300),
                new Spaceship("LV999", "Large", true, 100),
                new Spaceship("LV10000", "Extralarge", false, 200)
        };

    }


    public static void printShipData(Spaceship spaceship){
        System.out.println("=========================");
        System.out.println("Rendszám: " + spaceship.id);
        System.out.println("Típus " + spaceship.type);
        System.out.println("Teherszállítő-e " + spaceship.isFreight);
        System.out.println("Sebesség " + spaceship.speed);
        System.out.println();
    }
}
