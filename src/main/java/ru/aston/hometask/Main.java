package ru.aston.hometask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Home home = Home.builder("", "", "")
                .setField2("")
                .setField5("")
                .setField10("")
                .setField15("")
                .build();

        Home home2 = Home.builder("", "", "")
                .setField1("")
                .setField6("")
                .setField12("")
                .build();

        XMLProducer xmlProducer = new XMLProducer();
        XMLAdapter xmlAdapter = new XMLAdapter(xmlProducer);
        JsonConsumer.Result process = xmlAdapter.process();

        List<String> o = new ArrayList<>();
        ListSizeDecorator<String> listSizeDecorator = new ListSizeDecorator<>(o);
        o.add("1");
        o.add("2");
        o.add("3");
        System.out.println(listSizeDecorator.size());
        System.out.println(listSizeDecorator.fullSize());
        o.remove(0);
        o.remove(1);
        System.out.println(listSizeDecorator.size());
        System.out.println(listSizeDecorator.fullSize());

        ChainFirst first = new ChainFirst(Chain.LEVEL1);
        ChainSecond second = new ChainSecond(Chain.LEVEL2);
        first.setNextChain(second);
        first.message(Chain.LEVEL1, "Level 1 Message");
        first.message(Chain.LEVEL2, "Level 2 Message");

        Proxy proxy = new Proxy("(Прокси)");
        proxy.display();

        Strategy context = new Strategy();
        context.setStrategy(new StrategyFirst("Первая"));
        context.out(10);
        context.setStrategy(new StrategySecond("Вторая"));
        context.out(20);
    }
}