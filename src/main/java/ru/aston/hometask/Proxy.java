package ru.aston.hometask;

class Proxy implements IMessage {
    private Real real;
    private String name;

    public Proxy(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (real == null) {
            real = new Real(name);
        }
        real.display();
    }
}