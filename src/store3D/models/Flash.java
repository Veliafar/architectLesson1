package store3D.models;

import java.awt.*;

public class Flash {
    private Point3D location;
    private Color color;
    private Angle3D angle;
    private float power;

    public Point3D getLocation() {
        return location;
    }

    public Color getColor() {
        return color;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Float getPower() {
        return power;
    }

    public Flash(Point3D location, Color color, Angle3D angle, float power) {
        this.location = location;
        this.color = color;
        this.angle = angle;
        this.power = power;
    }

    public void Rotate(Angle3D angle) {

    }

    public void Move(Point3D point) {

    }
}
