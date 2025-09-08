package ru.aston.hometask;

class Real implements IMessage {
    private String name;

    public Real(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.printf("Исходное сообщение %s\n", name);
    }
}