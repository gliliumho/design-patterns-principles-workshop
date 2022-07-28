package statepattern;

public class BulbStateMain {
    public static void main(String[] args){
        //user code
        Bulb bulb = new Bulb();
        bulb.printState();
        bulb.touch();
        bulb.printState();
        bulb.touch();
        bulb.printState();
    }
}
