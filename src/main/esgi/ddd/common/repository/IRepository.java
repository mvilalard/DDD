package main.esgi.ddd.common.repository;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.valueObjectId.ValueObjectId;

import java.util.HashSet;

public interface IRepository {

    HashSet<Entity> getEntities();
    Entity getEntity(ValueObjectId id);
    void add(Entity entity);
    void remove(Entity entity);
}
