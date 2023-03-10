package Task4;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;

//@XmlRootElement
public class Address {
    private String city;
    private String size;
    private String street;
    private String houseNumber;

    public Address() {
    }

    public Address(String city, String size, String street, String houseNumber) {
        this.city = city;
        this.size = size;
        this.street = street;
        this.houseNumber = houseNumber;


    }

    public String getCity() {
        return city;
    }

    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    public String getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(String size) {
        this.size = size;
    }

    public String getStreet() {
        return street;
    }

    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    @XmlElement
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
    @XmlRootElement (name = "Cities")
class City{
    @XmlElement (name = "city")
    private ArrayList<Address> ct = new ArrayList<>();
    public void addCity(Address city){
        ct.add(city);
        }

    @Override
    public String toString() {
        return Arrays.deepToString(ct.toArray());
    }
}
