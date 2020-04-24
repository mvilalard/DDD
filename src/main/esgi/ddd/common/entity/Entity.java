package main.esgi.ddd.common.entity;

import main.esgi.ddd.common.valueObjectId.ValueObjectId;

import java.util.Objects;

public class Entity {

    private final ValueObjectId id;

    public Entity(ValueObjectId id) {
        this.id = id;
    }

    public ValueObjectId getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id.equals(entity.id);
    }
}
