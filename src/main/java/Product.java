public class Product {
    int id;
    String name;
    int price;
    public Product (int a, String n, int b){
        id = a;
        name = n;
        price = b;
    }
    public void out(){
        System.out.print (id + ". "  + " " + name + " " + price + "$\n" );
    }
}
