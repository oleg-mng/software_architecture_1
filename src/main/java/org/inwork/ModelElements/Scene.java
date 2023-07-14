package org.inwork.ModelElements;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Class Scene
 * передаем в конструктор лист моделей (минимум 1), лист источников света, лист камер (минимум 1)
 * Определяем методы method1 и method2
 *
 * @author oleg-mng
 * version 1.0.0
 */

public class Scene {
    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) this.models = models;
        else throw new Exception("Должна быть минимум одна PolygonalModel");
        this.flashes = flashes;
        if (cameras.size() > 0) this.cameras = cameras;
        else throw new Exception("Должна быть минимум одна cameras");
    }

    public <T> T method1(T t) {
        return t;
    }

    public <T, P> T method2(T t, P p) {
        return t;
    }
}
