public class Refatorado<T> {

    private NoGeneric<T> refNoEntradaFila;

    public Refatorado() {

        this.refNoEntradaFila = null;

    }

    public void enqueue(T obj) {

        NoGeneric<T> novoNo = new NoGeneric<>(obj);

        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;

    }

    public T first() {

        if (!this.isEmpty()) {
            NoGeneric<T> primeiroNo = refNoEntradaFila;

            while (true) {

                if (primeiroNo.getRefNo() != null) {

                    primeiroNo = primeiroNo.getRefNo();

                } else {

                    break;

                }
            }

            return (T) primeiroNo.getObject();

        }
        return null;

    }

    public T dequeue() {

        if (!this.isEmpty()) {
            NoGeneric<T> primeiroNo = refNoEntradaFila;
            NoGeneric<T> noAuxiliar = refNoEntradaFila;

            while (true) {

                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                } else {
                    noAuxiliar.setRefNo(null);
                    break;

                }
            }
            return (T) primeiroNo.getObject();

        }
        return null;

    }

    public boolean isEmpty() {

        return refNoEntradaFila == null ? true : false;

    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoGeneric<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]---> ";

                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno += "null";
        }

        return stringRetorno;
    }

}
