import org.junit.Test;

import static org.junit.Assert.*;

public class FarmBuilderTest {
    FarmFactory farmFactory = new FarmFactory();

    @Test
    public void testFarmBuilder1(){
        Farm farm1 = farmFactory.buildFarm("Crop");
        assertEquals("Crop",farm1.getType());

        Farm farm2 = farmFactory.buildFarm("Animal");
        assertEquals("Animal",farm2.getType());

        Farm farm3 = farmFactory.buildFarm("Hybrid");
        assertEquals("Hybrid",farm3.getType());
    }

    @Test
    public void testDay(){
        Farm farm = farmFactory.buildFarm("Crop");
        farm.day();
    }

    @Test
    public void testNight(){
        Farm farm = farmFactory.buildFarm("Crop");
        farm.night();
    }

    @Test
    public void testUnits(){
        Farm farm = farmFactory.buildFarm("Crop");
        assertEquals(1, farm.getUnit());

        farm.addUnit();
        assertEquals(2, farm.getUnit());

        farm.setUnit(5);
        assertEquals(5, farm.getUnit());
    }

    @Test
    public void daysTest(){
        Farm farm = farmFactory.buildFarm("Crop");
        assertTrue(farm.getDay());

        farm.change();

        assertFalse(farm.getDay());
    }

    @Test
    public void testBudget(){
        Farm farm = farmFactory.buildFarm("Crop");

        assertEquals(100, farm.getBudget(), 0.0);

        farm.addMoney(20);
        assertEquals(120, farm.getBudget(), 0.0);

        farm.setBudget(200);
        assertEquals(200, farm.getBudget(), 0.0);
    }

    @Test
    public void testUpgradeCosts(){
        Farm farm = farmFactory.buildFarm("Crop");

        assertEquals(100, farm.getUpgradeCost(),0.0);
        assertEquals(.20, farm.getUpgradeBuffer(),0.0);

        farm.setUpgradeCost(200);
        farm.setUpgradeBuffer(.30);

        assertEquals(200, farm.getUpgradeCost(),0.0);
        assertEquals(.30, farm.getUpgradeBuffer(),0.0);

    }

    @Test
    public void testUpgrade(){
        Farm farm = farmFactory.buildFarm("Crop");
        farm.setBudget(200);


        farm.upgrade();

        assertEquals(100, farm.getBudget(),0);
        boolean upgrade  = farm.haveBudgetToUpgrade();
    }

    @Test
    public void farmersTest(){
        Farm farm = farmFactory.buildFarm("Crop");

        assertEquals(farm.getFarmers(),0);


        farm.addFarmer(new CropFarmer());
        assertEquals(farm.getFarmers(),1);

        farm.setFarmer(5);
        assertEquals(farm.getFarmers(),5);

        farm.setFarmer(7);
        assertEquals(farm.getFarmers(),7);

        farm.setFarmer(3);
        assertEquals(farm.getFarmers(),3);

        farm.removeFarmer(2);
        assertEquals(farm.getFarmers(),1);


    }
}
