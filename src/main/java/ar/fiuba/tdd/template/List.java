package ar.fiuba.tdd.template;

public interface List<T> {

    boolean isEmpty();

    void append(T data);

    int size();

    T getFirst() throws AssertionError;

    void removeFirst() throws AssertionError;

}
