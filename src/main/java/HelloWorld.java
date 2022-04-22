import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
        LinkedList<Farm> farmList = new LinkedList<Farm>();

        FarmFactory farmFactory = new FarmFactory();
        Farm newFarm = farmFactory.buildFarm("Animal");
        newFarm.setFarmer(3);
        newFarm.setUnit(5);
        farmList.add(newFarm);

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        String input = "Go";

        Ticker ticker = new Ticker(farmList);

        while(!input.equalsIgnoreCase("Y")){
            ticker.doDay();

            ticker.doNight();

            System.out.println("Do want to quit (Y/N)");
            input = scanner.next();
        }

    }
}
