package store3D.models;

import java.util.List;

public class PolygonModel {

    private List<Polygon> polygons;

    private List<Texture> textures;

    public List<Polygon> getPolygons() {
        return polygons;
    }


    public List<Texture> getTextures() {
        return textures;
    }

    public PolygonModel(List<Polygon> polygons) {
        this.polygons = polygons;
    }

    public PolygonModel(List<Polygon> polygons, List<Texture> textures) {
        this.polygons = polygons;
        this.textures = textures;
    }
}
