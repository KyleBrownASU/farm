import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
