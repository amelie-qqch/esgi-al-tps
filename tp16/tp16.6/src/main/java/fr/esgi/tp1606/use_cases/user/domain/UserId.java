package fr.esgi.tp1606.use_cases.user.domain;

import fr.esgi.tp1606.kernel.ValueObjectID;

import java.util.Objects;

public final class UserId implements ValueObjectID {
    private final int value;

    public UserId(int value) {
        this.value = value;
    }

    public int getIntValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return value == userId.value;
    }

    @Override
    public String getValue() {
        return String.valueOf(value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "UserId{" +
                "value=" + value +
                '}';
    }
}
