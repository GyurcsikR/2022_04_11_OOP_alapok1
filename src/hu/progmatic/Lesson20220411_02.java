package hu.progmatic;

public class Lesson20220411_02 {
    public static void main(String[] args) {

        Travel moonTravel = new Travel();
        moonTravel.from = "Föld";
        moonTravel.to = "Hold";
        moonTravel.time = 100;
        moonTravel.price = 1000;

        Travel marsTravel = new Travel();
        marsTravel.from = "Föld";
        marsTravel.to = "Mars";
        marsTravel.time = 350;
        marsTravel.price = 3500;

        Travel marsTravel2 = new Travel();
        marsTravel2.from = "Föld";
        marsTravel2.to = "Mars";
        marsTravel2.time = 350;
        marsTravel2.price = 3500;

        //marsTravel == marsTravel2 egyformák de nem azonosak
        // false -> két külön objektum, egyformák, de nem azonosak
        System.out.println(marsTravel == marsTravel2);
        // false -> két külön objektum, egyformák, de nem azonosak
        // alapértelmezetten az equals az ==-t követi
        // Stringeknél felül van írva (ott úgy működik, ahogyan elvárjuk)
        // lehetőség van megváltoztatni (lsd. később)
        System.out.println(marsTravel.equals(marsTravel2));


        Travel favouritTravel = marsTravel;
        favouritTravel.price *= 2;
        travelData(moonTravel);
        travelData(marsTravel);
        travelData(favouritTravel);

        Travel nextTravel = null;
        if (nextTravel != null){
            System.out.println(nextTravel.price);
        }


    }
    public static void travelData(Travel travel){
        System.out.println("Indulás " + travel.from);
        System.out.println("Cél " + travel.to);
        System.out.println("Hossz " + travel.time);
        System.out.println("Ár " + travel.price);

        travel.price += 10; // visszaíródik
        travel = null; // NEM íródik vissza
    }
}