package ru.aston.hometask;

public class JsonConsumer {
    public Result process(JSONData json) {
        return new Result();
    }

    public record JSONData(String json) {
    }

    public record Result() {
    }
}
