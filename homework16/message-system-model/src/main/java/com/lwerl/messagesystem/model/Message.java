package com.lwerl.messagesystem.model;


import com.lwerl.messagesystem.model.Address;
import com.lwerl.messagesystem.model.Addressee;

public abstract class Message<T extends Addressee> {

    private final Address from;
    private final Address to;

    public Message(Address from, Address to) {
        this.from = from;
        this.to = to;
    }

    public Address getFrom() {
        return from;
    }

    public Address getTo() {
        return to;
    }

    public abstract void exec(T addressee);
}
