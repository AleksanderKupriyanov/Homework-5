package ru.aston.hometask;

class StrategyFirst implements IStrategy {
    private String name;

    public StrategyFirst(String name) {
        this.name = name;
    }

    @Override
    public void display(int number) {
        System.out.printf("Стратегия: %s. Число: %s\n", name, number);
    }
}