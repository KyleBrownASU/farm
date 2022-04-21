public class Cow implements Animal{
    @Override
    public void doSomething() {
        System.out.println("Cow");
    }

    @Override
    public String getType() {
        return "Cow";
    }
}
