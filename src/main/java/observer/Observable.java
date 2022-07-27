package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observerList = new ArrayList<>();

    protected void attach(Observer observer){
        observerList.add(observer);
    }

    protected void detach(Observer observer) {
        observerList.remove(observer);
    }

    protected void refreshAll() {
        for (Observer ob : observerList){
            ob.refresh();
        }
    }
}
