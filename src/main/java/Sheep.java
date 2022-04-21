public class Sheep implements Animal{
    @Override
    public void doSomething() {
        System.out.println("Sheep");
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}
