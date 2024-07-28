package store3D.inMemory;

import store3D.models.Camera;
import store3D.models.Flash;
import store3D.models.PolygonModel;
import store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    private List<PolygonModel> models;
    private List<Scene> scenes;
    private List<Flash> flashes;
    private List<Camera> cameras;

    private List<IModelChangedObserver> observers = new ArrayList<>();



    public List<PolygonModel> getModels() {
        return models;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public ModelStore(List<PolygonModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
        notifyChange();
    }

    public void addModel(PolygonModel model) {
        models.add(model);
        notifyChange();
    }

    public Scene getScene(int index) {
        return scenes.get(index);
    }

    @Override
    public void notifyChange() {
        for (IModelChangedObserver observer : observers) {
            observer.applyUpdatedModel();
        }
    }

    @Override
    public void registerModelChanger(IModelChangedObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeModelChanger(IModelChangedObserver observer) {
        observers.remove(observer);
    }
}
