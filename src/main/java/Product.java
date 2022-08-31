import java.math.*;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    public Product (int a, String n, BigDecimal b){
        id = a;
        name = n;
        price = b;
    }

    public void out(){
        System.out.print (id + ". "  + " " + name + " " + price + "$\n" );
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "{" +
                "name:'" + name + " '" +
                ", id: " + id +
                ", price = " + price +  "grn" +
                '}';
    }

}
