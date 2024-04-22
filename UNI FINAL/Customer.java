import java.lang.Math;
class Customer {
    private int CustomerID;
    private String address;
    private String name;

    public int getCustomerID() {
        return this.CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        if (CustomerID >0)
        this.CustomerID = CustomerID;
        else
        this.CustomerID = Math.abs(CustomerID);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
