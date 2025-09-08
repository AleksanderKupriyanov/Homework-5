package ru.aston.hometask;

class ChainFirst extends Chain {
    public ChainFirst(int level) {
        this.level = level;
    }

    @Override
    protected void display(String message) {
        System.out.printf("Вывод: %s\n", message);
    }
}