public class NoGeneric<T> {

    private T object;
    private NoGeneric<T> refNo;

    public NoGeneric() {
    }

    public NoGeneric(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoGeneric<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(NoGeneric<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + object +
                '}';
    }
}