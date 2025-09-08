package ru.aston.hometask;

public class ChainSecond extends Chain {
    public ChainSecond(int level) {
        this.level = level;
    }

    @Override
    protected void display(String message) {
        System.out.printf("Вывод 2: %s\n", message);
    }
}