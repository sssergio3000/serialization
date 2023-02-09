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
        JAXBContext context = JAXBContext.newInstance(Address.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


        address.add(new Address("London", "big", "King Richard", "156"));
        address.add(new Address("Paris", "big", "Jacko", "16"));
        address.add(new Address("Krakow", "small", "Robitnycza", "24a"));
        address.add(new Address("Lodz", "small", "Tworcza", "66"));
        address.add(new Address("Rome", "big", "Piano", "52B"));

        for (Address elem : address) {
            marshaller.marshal(elem, file);
//            marshaller.marshal(elem,System.out);
        }

    }
}
