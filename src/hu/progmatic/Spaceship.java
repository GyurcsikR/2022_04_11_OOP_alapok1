package hu.progmatic;

public class Spaceship {
    public String id;
    public String type;
    public boolean isFreight;
    public int speed;


    public Spaceship() {

    }

    public Spaceship(String id, String type, boolean isFreight, int speed) {
        this.id = id;
        this.type = type;
        this.isFreight = isFreight;
        this.speed = speed;
    }
}

/*class SpaceShip
        String id
        String type
        boolean isFreight
        int speed

legyen default + minden mezőt beállító konstruktor

        Hozzunk létre egy Lesson_20220411_05-t
        legyen egy printShipData statikus metódus (ami mindent kiír)

        hozzunk létre pár űrhajót

        írjuk ki a teherhajók számát, a leggyorsabb és a leglassabb űrhajók adatait*/
