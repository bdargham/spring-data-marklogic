package org.springframework.data.marklogic.repository;

import org.springframework.data.marklogic.core.mapping.Document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Sample domain class.
 *
 * @author Stéphane Toussaint
 */
@Document(uri = "/contact/person/#{id}.xml", defaultCollection = "Person")
@XmlRootElement
public class Person {

    private static AtomicInteger INCREMENT = new AtomicInteger(1);

    private String id;
    private String firstname;
    private String lastname;
    private Integer age;

    private Address address;

    public Person() {}

    public Person(String id, String firstname, String lastname, Integer age, String country) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

        address = new Address();
        address.setCountry(country);
    }

    /**
     * @return the id
     */
    @XmlElement()
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s %s", firstname, lastname);
    }

}
