import java.lang.Math;
public class Product{
    private int productID;
    private String name;
    private double price;

    public int getProductID() {
        return this.productID;
    }

    public void setProductID(int productID){
    if (productID>0)
        this.productID = productID;
    else
    this.productID = Math.abs(productID);    

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price>0)
        this.price = price;
        else
        this.price = Math.abs(price);
    }

}