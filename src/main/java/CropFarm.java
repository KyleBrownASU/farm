import java.util.LinkedList;
import java.util.Random;

public class CropFarm implements Farm{
    String type = "Crop";
    Boolean day = true;
    Integer units = 1;

    double budget = 100;
    double upgradeCost = 100;
    double upgradeBuffer = .20; //in % ___ 20 = %20
    LinkedList<Farmer> farmers = new LinkedList<>();

    int days = 0;


    @Override
    public int getUnit() {
        return units;
    }

    @Override
    public void addUnit() {
        units += 1;
    }

    @Override
    public void setUnit(int units) {
        this.units = units;
    }

    @Override
    public void day() {
        if(days == 3){
            System.out.println("Crops where harvested today");
            days = 1;
            budget += (units * farmers.size() * 2 + 75);
        }
        units += 1;


        budget += farmers.size() * units + 75;
        System.out.println("This farm earned " + farmers.size() * units + 75 + " for a total of " + budget);

        System.out.println("This Hybrid farm has " + units);



    }

    @Override
    public void night() {

        Random random = new Random();
        int chance = random.nextInt(10 - 1 + 1) + 1;

        if(chance == 3){
            System.out.println("Oh no. A field has become diseased, do you want treat it (Y/N) ");

            chance = random.nextInt(10 - 1 + 1) + 1;


            if(chance < 6){
                System.out.println("Nice! You saved it!");
            } else {
                System.out.println("It died ");
                units -= 1;
            }
        } else if (chance ==4){
            System.out.println("Oh no. Rabbits eat the crop");
            units -= 1;
        } else if (chance == 5){
            System.out.println("oh no. the moles tore up the soil");
            units -= 1;
        }

    }

    @Override
    public boolean getDay() {
        return day;
    }

    @Override
    public void change() {
        day = !day;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getBudget() {
        return budget;
    }

    @Override
    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public void addMoney(double money) {
        budget += money;
    }


    @Override
    public double getUpgradeCost() {
        return upgradeCost;
    }

    @Override
    public void setUpgradeCost(double upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

    @Override
    public double getUpgradeBuffer() {
        return upgradeBuffer;
    }

    @Override
    public void setUpgradeBuffer(double upgradeBuffer) {
        this.upgradeBuffer = upgradeBuffer;
    }

    @Override
    public boolean haveBudgetToUpgrade() {
        return (upgradeCost * upgradeBuffer) + upgradeCost >= budget;
    }

    @Override
    public void upgrade() {
        budget = budget - upgradeCost;
        units+=1;

        upgradeCost += 50;

    }

    @Override
    public void addFarmer(Farmer farmer) {
        farmers.add(farmer);
    }

    @Override
    public void setFarmer(int num) {
        int difference = farmers.size() - num;

        if(difference > 0){
            while(farmers.size() != num){
                farmers.remove();
            }
        } else {
            while(farmers.size() != num){
                farmers.add(new CropFarmer());
            }
        }
    }

    @Override
    public void removeFarmer(int num) {
        for (int i = 0; i < num;i++){
            farmers.pop();
        }
    }

    @Override
    public int getFarmers() {
        return farmers.size();
    }


}


