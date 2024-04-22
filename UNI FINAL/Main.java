import java.util.Scanner;

public class Main {
    public static void main(String[] args){   
        Cart cart = new Cart();
     ElectronicProduct ep = new ElectronicProduct();
     ep.setName("Mobile Phone");
     ep.setBrand("Samsung Galaxy Note 20");
     ep.setWarrantyPeriod(1);
     ep.setPrice(599.9);
     ep.setProductID(1);
     ClothingProduct cp = new ClothingProduct();
     cp.setFabric("Cotton");
     cp.setName("T-Shirt");
     cp.setPrice(19.99);
     cp.setSize("Medium");
     cp.setProductID(2);
     BookProduct book = new BookProduct();
     book.setAuthor("O'Rielly");
     book.setName("OOP");
     book.setPrice(39.99);
     book.setProductID(3);
     book.setPublisher("X Publications");
     Customer customer = new Customer();
     Scanner sc = new Scanner (System.in);
     System.out.println("Welcome to our E-Commerce system! Please Enter your name: ");
     String name = sc.nextLine();
     customer.setName(name);
     System.out.println("Enter your ID: ");
     int id = sc.nextInt();
     customer.setCustomerID(id);
     System.out.println("Enter your address: ");
     String address = sc.nextLine();
     sc.nextLine();
     customer.setAddress(address);
     System.out.println("How many products do you want to add to your cart?");
     int nprod = sc.nextInt();
     Product[] products = new Product[nprod];
     for (int i=0;i<nprod;i++){
        System.out.println("Which products do you want to add?\n(1) Mobile Phone\n(2)Java Book\n(3)TShirt");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            products[i] = ep;
            break;
            case 2:
            products[i] = book;
            break;
            case 3:
            products[i] = cp;
            break;
            default:
            System.out.println("Invalid Choice");
            products[i] = null;
            break;
            
        }
    }

cart.setProducts(products);
        System.out.println("Your total price is: " +  cart.calcPrice(

        
        ));
        System.out.println("Confirm the order? click 1 for yes and 2 for no");
        int choice2 = sc.nextInt();
        switch (choice2){
            case 1:
            cart.placeOrder(products);
            System.out.println("Your total is: " +cart.calcPrice());
            System.out.println("Thank you for using our program!");
            break;
            case 2:
            System.out.println("Do you want to remove products? click 1 if so");
            int choice3 = sc.nextInt();
            if (choice3 ==1){
                System.out.println("Enter product id: ");
                int ID2 = sc.nextInt();
                if (ID2==1){
                    cart.removeProduct(ep, products);
                    System.out.println("Product removed");
                    cart.PrintProductInfo(products);
                }
                else if (ID2==2){
                    cart.removeProduct(book, products);
                    System.out.println("Product removed");
                    cart.PrintProductInfo(products);

                }
                else if(ID2==3){
                    cart.removeProduct(cp, products);
                    System.out.println("Product removed");
                    cart.PrintProductInfo(products);

                }
                else{
                    System.out.println("invalid choice");
                    break;
                }
                
            }
        }
            
            }

        
     }
    

