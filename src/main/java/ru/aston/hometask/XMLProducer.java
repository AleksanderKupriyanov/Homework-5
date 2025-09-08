package ru.aston.hometask;

public class XMLProducer {
    public XMLData process() {
        return new XMLData("<XML>");
    }

    public record XMLData(String xml) {
    }
}