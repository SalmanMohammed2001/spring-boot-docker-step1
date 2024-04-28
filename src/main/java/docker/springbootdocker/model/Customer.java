package docker.springbootdocker.model;

public class Customer {
    public String id;

    public String name;
    public String address;

    public Customer() {
    }

    public Customer(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
