import java.util.LinkedList;
import java.util.Random;

public class AnimalFarm implements Farm {
    String type = "Animal";
    Boolean day = true;
    Integer units = 1;
    double budget = 100;
    double upgradeCost = 100;
    double upgradeBuffer = .20; //in % ___ .20 = %20
    LinkedList<Farmer> farmers = new LinkedList<Farmer>();

    int days = 1;

    Random random = new Random();


    @Override
    public void day() {
        int chance = random.nextInt(10 - 1 + 1) + 1;

        if(days == 2 ){
            System.out.println("Animals were harvested");
            days= 1;
            budget += (units * farmers.size() * 2 + 75);
        }

        budget += farmers.size() * units + 75;
        System.out.println("This farm earned " + farmers.size() * units + 75 + " for a total of " + budget);

        System.out.println("This Animal farm has " + units);

        if( chance >=2 && chance <4){
            System.out.println("Some animals where born");
            units += 1;
        }


    }

    @Override
    public void night() {
        int chance = random.nextInt(10 - 1 + 1) + 1;
        if(chance == 3){
            System.out.println("A fox ate an animal");
            units -=1;
        } else if( chance == 4){
            System.out.println("A wolf ate an animal ");
            units -= 1;
        }



    }

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

      if(( upgradeCost * upgradeBuffer) + upgradeCost < budget){
          return true;
      } else {
          return false;
      }
    }

    @Override
    public void upgrade() {
        budget = budget - upgradeCost;
        units+= 1;

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
                farmers.add(new AnimalFarmer());
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
