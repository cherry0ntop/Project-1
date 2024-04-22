import java.util.Arrays;

class Cart {
    Customer customer = new Customer();
    private int customerID = customer.getCustomerID();
    private int nProducts;
    Product[] products ;

    public int getcustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int CustomerID) {
        if (CustomerID>0)
        this.customerID = CustomerID;
        else
        this.customerID = Math.abs(CustomerID);
    }

    public int getNProducts() {
        return this.nProducts;
    }

    public void setNProducts(int nProducts) {
        this.nProducts=Math.abs(nProducts);
        products = new Product[this.nProducts];
    }

    public Product[] getProducts() {
        return this.products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
     
  public void addProduct (Product product, Product[] products){
       int emptySpace = -1;
       for (int i=0;i<products.length;i++){
        if (products[i] == null){
            emptySpace = i;
            break;
        }
       }
       if (emptySpace != -1)
        products[emptySpace] = product;
       else
       System.out.println("Your cart is full");
  }
  public void removeProduct (Product wanted, Product[] products){
   Product[] pros2 = new Product [products.length - 1];
   int indexOfRemovedPro = 0;
   for (int i =0;i<products.length;i++){
    if (products[i].getProductID() == wanted.getProductID())
       indexOfRemovedPro = i;
       break;
   }
    int shifter = 0;
    for (int i =0; i<products.length;i++){
        if (i!=indexOfRemovedPro){
            pros2[shifter] = products[i];
            shifter++;
        }
    }
    setProducts(pros2);
    setNProducts(getNProducts()-1);
    }
    
  public  float calcPrice(){
    float totalPrice = 0;
    for (int i =0;i< nProducts ;i++){
        totalPrice += products[i].getPrice();
    }
    return totalPrice;
  }
  public void PrintProductInfo (Product[] product){
   for (int i=0;i<product.length;i++){
    System.out.println("Name: " + product[i].getName());
    System.out.println("Price: "+product[i].getPrice());
    System.out.println("ID: " +product[i].getProductID());
    
   }
   System.out.println("Your total is " + calcPrice());
  }
  public void placeOrder(Product[] product){
    PrintProductInfo(product);
  }
}

