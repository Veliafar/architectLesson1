package store3D.models;

import java.util.List;

public class Scene {

    private static int count = 100;

    private int id;
    private List<PolygonModel> models;
    private List<Flash> flashes;
    private List<Camera> camera;

    {
        id = ++count;
    }

    public Scene(List<PolygonModel> models, List<Flash> flashes, List<Camera> camera) {
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public void method1() {

    }

    public void method2() {

    }

}
