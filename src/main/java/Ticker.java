import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Scanner;

public class Ticker { //Mediator
    LinkedList<Farm> farmList;

    public Ticker( LinkedList<Farm> farmList){
        this.farmList = farmList;
    }

    public void doDay(){
        double budget = 0;
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        for( int i = 0; i < farmList.size(); i++){
            System.out.println("Farm # " + i);
            System.out.println("This farm is a "  + farmList.get(i).getType());
            farmList.get(i).day();

            budget += farmList.get(i).getBudget();


        }

        System.out.println("You have $" + budget);
        System.out.println("Do you want to buy a new farm for $200 (Y/N");

        String input = scanner.next();

        if(input.equalsIgnoreCase("y")){
            System.out.println("Do you want a Crop farm - C");
            System.out.println("Do you want a Animal farm - A");
            System.out.println("Do you want a Hybrid farm - H");

            input = scanner.next();
            FarmFactory farmFactory = new FarmFactory();

            if(input.equalsIgnoreCase("C")){
                Farm newFarm = farmFactory.buildFarm("Crop");
                newFarm.setFarmer(3);
                newFarm.setUnit(5);
                farmList.add(newFarm);

            } else if(input.equalsIgnoreCase("A")){
                Farm newFarm = farmFactory.buildFarm("Animal");
                newFarm.setFarmer(3);
                newFarm.setUnit(5);
                farmList.add(newFarm);

            } else if(input.equalsIgnoreCase("H")) {
                Farm newFarm = farmFactory.buildFarm("Hybrid");
                newFarm.setFarmer(3);
                newFarm.setUnit(5);
                farmList.add(newFarm);
            }
        }
    }

    public void doNight(){
        for( int i = 0; i < farmList.size(); i++){
            System.out.println("Farm # " + i);
            System.out.println("This farm is a "  + farmList.get(i).getType());
            farmList.get(i).night();
        }
    }
}
