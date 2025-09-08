package ru.aston.hometask;

public class XMLAdapter extends JsonConsumer {
    private XMLProducer xmlProducer;

    public XMLAdapter(XMLProducer xmlProducer) {
        this.xmlProducer = xmlProducer;
    }

    public Result process() {
        XMLProducer.XMLData process = xmlProducer.process();
        //convert
        JSONData convertedData = new JSONData("converted data");
        return super.process(convertedData);
    }
}
