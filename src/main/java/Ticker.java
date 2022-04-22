import java.util.LinkedList;
import java.util.Random;


public class Ticker { //Mediator
    LinkedList<Farm> farmList;
    Random random = new Random();

    public Ticker( LinkedList<Farm> farmList){
        this.farmList = farmList;
    }

    public void doDay(){
        double budget = 0;

        for( int i = 0; i < farmList.size(); i++){
            System.out.println("Farm # " + i);
            System.out.println("This farm is a "  + farmList.get(i).getType());
            farmList.get(i).day();

            budget += farmList.get(i).getBudget();


        }

        System.out.println("You have $" + budget);
        System.out.println("Do you want to buy a new farm for $200 (Y/N");

        int chance = random.nextInt(10 - 1 + 1) + 1;

        if(chance <= 5){
            System.out.println("Do you want a Crop farm - C");
            System.out.println("Do you want a Animal farm - A");
            System.out.println("Do you want a Hybrid farm - H");


            FarmFactory farmFactory = new FarmFactory();

            if(chance >= 3 && chance < 5){
                Farm newFarm = farmFactory.buildFarm("Crop");
                newFarm.setFarmer(3);
                newFarm.setUnit(5);
                farmList.add(newFarm);

            } else if(chance >=  5){
                Farm newFarm = farmFactory.buildFarm("Animal");
                newFarm.setFarmer(3);
                newFarm.setUnit(5);
                farmList.add(newFarm);

            } else {
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


