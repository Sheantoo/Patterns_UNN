public interface Subject {
    public void recordObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
}