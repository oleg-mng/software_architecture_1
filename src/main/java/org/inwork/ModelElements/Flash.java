package org.inwork.ModelElements;

import org.inwork.Stuff.Angle3D;
import org.inwork.Stuff.Point3D;

import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate(Angle3D angle) {

    }

    public void move(Point3D location) {

    }
}

