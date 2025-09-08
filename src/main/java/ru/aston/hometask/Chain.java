package ru.aston.hometask;

abstract class Chain {
    public static int LEVEL1 = 1;
    public static int LEVEL2 = 2;

    protected int level;
    protected Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    public void message(int level, String name) {
        if (this.level <= level) {
            display(name);
        }
        if (nextChain != null) {
            nextChain.message(level, name);
        }
    }

    abstract protected void display(String message);
}