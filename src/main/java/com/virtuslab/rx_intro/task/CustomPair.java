package com.virtuslab.rx_intro.task;

public class CustomPair<T,U> {
    private final T confirmation;
    private final U transaction;

    public CustomPair(T confirmation, U transaction) {
        this.confirmation = confirmation;
        this.transaction = transaction;
    }

    public T getConfirmation() {
        return confirmation;
    }

    public U getTransaction() {
        return transaction;
    }
}
