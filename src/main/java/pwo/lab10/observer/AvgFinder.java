package pwo.lab10.observer;

import static pwo.lab10.observer.Publisher.Subscriber;

public class AvgFinder implements Subscriber {
    Float sum = null;
    Integer count = 0;


    @Override

    public void action(int x) {

        sum = sum == null ? x : sum + x;
        count++;

    }


    public float getAvg() {
        return sum / count;
    }
}
