package kochetov;

/**
 * interface Store.
 * Created by Сергей on 05.04.2017.
 */
public interface Store<T extends Base> {
    void add(T value);
    void update(String id, T value);
    void delete(String id);
}
