import java.util.ArrayList;

public class PosData implements Subject {
    private final ArrayList<Observer> observers;
    private float[] crds;
    private boolean Movement;

    public PosData() {
        crds = new float[]{0, 0};
        Movement = false;
        observers = new ArrayList<Observer>();
    }
    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void recordObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(crds, Movement);
        }
    }

    public void setLoc(float[] crds, boolean isMoving) {
        this.crds = crds;
        this.Movement = isMoving;
        locationChanged();
    }

    public void locationChanged() {
        notifyObservers();
    }
}


