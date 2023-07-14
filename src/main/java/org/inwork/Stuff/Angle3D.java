package org.inwork.Stuff;

public class Angle3D {
    double x;
    double y;
    double z;
//    The angle of rotation in radians.
    double angle;

    public Angle3D(double x, double y, double z, double angle) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.angle = angle;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getAngle() {
        return angle;
    }
}
