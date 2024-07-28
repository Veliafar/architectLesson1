import store3D.inMemory.ModelStore;
import store3D.inMemory.Observer1;
import store3D.models.*;
import store3D.models.Polygon;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();


        List<Point3D> points1 = new ArrayList<>();
        points1.add(new Point3D(3.2, 5.1, 6));
        points1.add(new Point3D(4, 2, 1));
        Polygon polygon1 = new Polygon(points1);

        List<Point3D> points2 = new ArrayList<>();
        points2.add(new Point3D(3.2, 5.1, 6));
        points2.add(new Point3D(4, 2, 1));
        Polygon polygon2 = new Polygon(points2);

        List<Polygon> polygons = new ArrayList<>();
        polygons.add(polygon1);
        polygons.add(polygon2);


        List<Point3D> points3 = new ArrayList<>();
        points3.add(new Point3D(5, 5, 6));
        points3.add(new Point3D(4, 3, 1));
        Polygon polygon3 = new Polygon(points3);

        List<Point3D> points4 = new ArrayList<>();
        points4.add(new Point3D(3.2, 1, 6));
        points4.add(new Point3D(4, 8, 1));
        Polygon polygon4 = new Polygon(points4);

        List<Polygon> polygons2 = new ArrayList<>();
        polygons.add(polygon3);
        polygons.add(polygon4);


        Texture textureCastle = new Texture("Castle");
        Texture textureEarth = new Texture("Earth");
        List<Texture> textures1 = new ArrayList<>();
        textures1.add(textureCastle);
        textures1.add(textureEarth);

        Texture textureBrick = new Texture("Brick");
        List<Texture> textures2 = new ArrayList<>();
        textures2.add(textureBrick);

        PolygonModel polygonModel = new PolygonModel(polygons, textures1);

        Flash flash = new Flash(
                new Point3D(1, 2, 3),
                new Color(10, 100, 200),
                new Angle3D(3, 2, 3),
                2.7F
        );

        Camera camera = new Camera(new Point3D(1, 2, 3), new Angle3D(3, 2, 3));

        List<PolygonModel> polygonModels = new ArrayList<>();
        polygonModels.add(polygonModel);

        List<Flash> flashes = new ArrayList<>();
        flashes.add(flash);

        List<Camera> cameras = new ArrayList<>();
        cameras.add(camera);

        Scene scene = new Scene(polygonModels, flashes, cameras);
        List<Scene> scenes = new ArrayList<>();
        scenes.add(scene);

        ModelStore modelStore = new ModelStore(polygonModels, scenes, flashes, cameras);
        modelStore.registerModelChanger(observer1);

        PolygonModel polygonModel2 = new PolygonModel(polygons2, textures2);

        modelStore.addModel(polygonModel2);
    }
}