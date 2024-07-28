package store3D.inMemory;

public interface IModelChanger {
    public void notifyChange();

    public void registerModelChanger(IModelChangedObserver observer);

    public void removeModelChanger(IModelChangedObserver observer);
}
