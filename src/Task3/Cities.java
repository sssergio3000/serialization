package Task3;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Cities{

    String City = "";
    String size = "";
    String street = "";
    String houseNumber = "";

    public Cities(String city, String size, String street, String houseNumber) {
        City = city;
        this.size = size;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        List<Cities> address = new ArrayList<>();

        address.add(new Cities("London", "big", "King Richard", "156"));
        address.add(new Cities("Paris", "big", "Jacko", "16"));
        address.add(new Cities("Krakow", "small", "Robitnycza", "24a"));
        address.add(new Cities("Lodz", "small", "Tworcza", "66"));
        address.add(new Cities("Rome", "big", "Piano", "52B"));



        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("city.xml"));
        writer.writeStartDocument();

        for (Cities cities : address) {
            writer.writeCharacters("\n");


            writer.writeStartElement("City");
            writer.writeAttribute("size",cities.size);
            writer.writeCharacters(cities.City);
            writer.writeEndElement();

            writer.writeCharacters("\n");
            writer.writeStartElement("Street");
            writer.writeCharacters(cities.street);
            writer.writeEndElement();

            writer.writeCharacters("\n");
            writer.writeStartElement("HouseNumber");
            writer.writeCharacters(cities.houseNumber);
            writer.writeEndElement();

            writer.writeCharacters("\n");







        }





    }
}