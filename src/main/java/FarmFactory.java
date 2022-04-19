public class FarmFactory {

    public Farm buildFarm(String farmType){
        if(farmType == null){
            return null;
        }

        if(farmType.equalsIgnoreCase("Crop")){
            return new Crop();
        } else if (farmType.equalsIgnoreCase("Animal")){
            return new Animal();
        } else if(farmType.equalsIgnoreCase("Hybrid")){
            return new Hybrid();
        }

        return null;
    }
}
