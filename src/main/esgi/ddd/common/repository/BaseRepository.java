package main.esgi.ddd.common.repository;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.valueObjectId.ValueObjectId;

import java.util.HashSet;

public class BaseRepository implements IRepository {

    HashSet<Entity> entities;

    public BaseRepository(HashSet<Entity> entities) {
        this.entities = entities;
    }

    public BaseRepository() {
        this(new HashSet<>());
    }

    @Override
    public HashSet<Entity> getEntities() {
        return entities;
    }

    @Override
    public Entity getEntity(ValueObjectId id) {
        for (Entity entity : entities) {
            if (entity.getId() == id) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public void add(Entity entity) {
        this.entities.add(entity);
    }

    @Override
    public void remove(Entity entity) {
        this.entities.remove(entity);
    }

}
