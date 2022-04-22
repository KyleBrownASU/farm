import java.util.LinkedList;

public class HelloWorld {


    public static void main(String[] args) {
        LinkedList<Farm> farmList = new LinkedList();

        FarmFactory farmFactory = new FarmFactory();
        Farm newFarm = farmFactory.buildFarm("Animal");
        newFarm.setFarmer(3);
        newFarm.setUnit(5);
        farmList.add(newFarm);



    }
}
