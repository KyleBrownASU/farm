import java.util.LinkedList;

public class Ticker { //Mediator 
    LinkedList<Farm> farmList = new LinkedList<Farm>();

    public Ticker( LinkedList<Farm> farmList){
        this.farmList = farmList;
    }

    public void doDay(){
        for( Farm i : farmList){
            i.day();
        }
    }

    public void doNight(){
        for( Farm i : farmList){
            i.night();
        }
    }
}
