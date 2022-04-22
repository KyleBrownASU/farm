import org.junit.Test;

import java.util.LinkedList;

public class TickerTest {
    @Test
    public void test1(){
        FarmFactory farmFactory = new FarmFactory();
        Farm farm = farmFactory.buildFarm("Crop");
        LinkedList<Farm> farms = new LinkedList<>();

        farm.setUnit(5);
        farm.setFarmer(5);
        farms.add(farm);
        Ticker ticker = new Ticker(farms);

        ticker.doDay();

        ticker.doNight();
    }


}
