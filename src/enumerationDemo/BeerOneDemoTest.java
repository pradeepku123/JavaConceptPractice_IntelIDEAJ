package enumerationDemo;

import java.util.stream.Stream;

public class BeerOneDemoTest {
    public static void main(String[] args) {
            BeerOneDemo beerOneDemo=BeerOneDemo.KF;
        BeerOneDemo[] allBeerOneDemo = BeerOneDemo.values();
        Stream.of(allBeerOneDemo).forEach(System.out::println);
        for(BeerOneDemo b1:allBeerOneDemo){
            System.out.print(b1.ordinal());
            System.out.print(b1);
            System.out.println("  "+b1.printvalue());
        }
    }
}
