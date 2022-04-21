public class AnimalDecorator implements Animal{
    protected Animal decoratedAnimal;


    public AnimalDecorator(Animal decoratedAnimal){
        this.decoratedAnimal = decoratedAnimal;
    }


    @Override
    public void doSomething() {
        decoratedAnimal.doSomething();
    }

    @Override
    public String getType() {
        return decoratedAnimal.getType();
    }
}
