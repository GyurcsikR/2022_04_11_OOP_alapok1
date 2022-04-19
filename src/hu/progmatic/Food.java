package hu.progmatic;

public class Food {
    public String name;
    public String expirationDate;
    public boolean isLiquid;
    public int price;

    public Food(){}

    public Food(String name, String expirationDate, boolean isLiquid, int price){
        this.name = name;
        this.expirationDate = expirationDate;
        this.isLiquid = isLiquid;
        this.price = price;
    }
}
