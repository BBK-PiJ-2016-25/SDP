/**
 * Created by anniehawes on 04/02/2017.
 */
class Storage<T> {
    T x;
    public void setValue(T value) {
        x = value;
    }
    public T getValue() {
        return x;
    }
}