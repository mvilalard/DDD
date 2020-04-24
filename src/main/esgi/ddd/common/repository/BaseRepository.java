package main.esgi.ddd.common.repository;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.valueObjectId.ValueObjectId;

import java.util.HashSet;

public class BaseRepository {

    private HashSet<Entity> entities;

    public BaseRepository(HashSet<Entity> entities) {
        this.entities = this.entities;
    }

    public BaseRepository() {
        this(new HashSet<>());
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    public void removeEntity(Entity entity){
        this.entities.remove(entity);
    }

    public Entity getEntity(ValueObjectId id) {
        for (Entity entity : entities) {
            if(entity.getId() == id) {
                return entity;
            }
        }
        return null;
    }
}
