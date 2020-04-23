package main.esgi.ddd.model.utils;

import java.util.Objects;
import java.util.UUID;

public class ValueObjectId {

    private final UUID id;

    public ValueObjectId() {
        this.id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ValueObjectId that = (ValueObjectId) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
