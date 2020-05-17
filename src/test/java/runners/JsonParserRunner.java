package runners;

import org.xml.sax.SAXException;
import parsers.MyJsonParser;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class JsonParserRunner {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        MyJsonParser.parseJSON();
    }
}