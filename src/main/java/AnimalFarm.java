public class AnimalFarm implements Farm {
    String type = "Animal";
    Boolean day = true;
    Integer units = 1;
    double budget = 100;
    double upgradeCost = 100;
    double upgradeBuffer = .20; //in % ___ .20 = %20


    @Override
    public void day() {

    }

    @Override
    public void night() {

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
        units++;

        upgradeCost += 50;

    }


}
