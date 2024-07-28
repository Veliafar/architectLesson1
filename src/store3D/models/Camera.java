package store3D.models;

import java.awt.*;

public class Camera {

    private Point3D location;
    private Angle3D angle;

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void Rotate(Angle3D angle) {

    }

    public void Move(Point3D point) {

    }
}
