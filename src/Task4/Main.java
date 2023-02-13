package Task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {
        List<Address> address = new ArrayList<>();
        File file = new File("JaxBXML.xml");
        JAXBContext context = JAXBContext.newInstance(City.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        City city = new City();


        city.addCity(new Address("London", "big", "King Richard", "156"));
        city.addCity(new Address("Paris", "big", "Jacko", "16"));
        city.addCity(new Address("Krakow", "small", "Robitnycza", "24a"));
        city.addCity(new Address("Lodz", "small", "Tworcza", "66"));
        city.addCity(new Address("Rome", "big", "Piano", "52B"));

        marshaller.marshal(city,file);

    }
}
