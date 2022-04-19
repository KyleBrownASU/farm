public class HelloWorld {
    public static void main(String[] args) {


        FarmFactory farmFactory = new FarmFactory();

        Farm farm1 = farmFactory.buildFarm("Crop");
        System.out.println(farm1.getType());

        Farm farm2 = farmFactory.buildFarm("Animal");
        System.out.println(farm2.getType());

        Farm farm3 = farmFactory.buildFarm("Hybrid");
        System.out.println(farm3.getType());
    }
}
