public interface Farm {
    void day();
    void night();

    int getUnit();
    void addUnit();
    void setUnit(int units);

    boolean getDay();
    void change();

    String getType();

    double getBudget();
    void setBudget(double budget);
    void addMoney(double money);
    double getUpgradeCost();
    void setUpgradeCost(double upgradeCost);
    double getUpgradeBuffer();
    void setUpgradeBuffer(double upgradeBuffer);

    boolean haveBudgetToUpgrade();
    void upgrade();

    void addFarmer(Farmer farmer);
    void setFarmer(int num);
    void removeFarmer(int num);
    int getFarmers();








}
