package Class74;

import java.util.Objects;

public class Keys {
    private int key;

    public Keys(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keys keys = (Keys) o;
        return key == keys.key;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key);
    }
}
