import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Maria");
        Human human3 = new Human("Alina");
        Human human4 = new Human("Denis");

        Market market = new Market();

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();
    }
}