package ru.aston.hometask;

class StrategySecond implements IStrategy {
    private String name;

    public StrategySecond(String name) {
        this.name = name;
    }

    @Override
    public void display(int number) {
        System.out.printf("Стратегия: %s. Число: %s\n", name, number);
    }
}
