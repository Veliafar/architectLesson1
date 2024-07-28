package store3D.inMemory;

public class Observer1 implements IModelChangedObserver{

    @Override
    public void applyUpdatedModel() {
        System.out.println("Была добавлена новая полигональная модель - observer#1");
    }
}
