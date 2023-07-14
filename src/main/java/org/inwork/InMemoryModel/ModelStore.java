package org.inwork.InMemoryModel;

import org.inwork.ModelElements.*;
import org.inwork.Stuff.Angle3D;
import org.inwork.Stuff.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 3d model storage Class
 * в конструкторе создаем 4 непустых листа models, scenes, flashes, cameras
 * используем каталог Stuff с типовыми классами Angle3D, Point3D
 *
 * @author oleg-mng
 * version 1.0.0
 */

public class ModelStore implements IModelChanger {
    public List<PolygonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    Point3D point3d = new Point3D(1, 1, 1);
    Angle3D angle3D = new Angle3D(1, 1, 1, 1);
    Color color = new Color(3, 3, 3);


    public ModelStore(List<IModelChangedObserver> changedObservers) throws Exception {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PolygonalModel());
        scenes.add(new Scene(1, models, flashes, cameras));
        flashes.add(new Flash(point3d, angle3D, color, 7));
        cameras.add(new Camera(point3d, angle3D));
    }

    public Scene getScena(int id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) return scenes.get(i);

        }
        return null;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
