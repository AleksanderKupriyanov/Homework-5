package ru.aston.hometask;

class Strategy {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void out(int number) {
        strategy.display(number);
    }
}
