import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class User {
        private int id;
        private String firstName;
        private String lastName;
        private BigDecimal cash;
        private List<Product> purchaseUser = new ArrayList<>(); // продукти куплені користувачем

        public User (int a, String fn, String ln, BigDecimal b){
                id = a;
                firstName = fn;
                lastName = ln;
                cash = b;
                //      List<Product>  = new ArrayList<>;
        }
        public void out(){
                System.out.print (id + ". " + firstName + " " + lastName + " " + cash + "$\n" );
        }

        public int getId() {
                return id;
        }

        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public String getName() {return firstName + " " + lastName; }

        public BigDecimal getCash() {
                return cash;
        }

        public void setCash(BigDecimal newCash) {
                this.cash = newCash;
        }

        public List<Product> getpurchaseUser() {
                return purchaseUser;
        }

        public void printPurchaseUser(){
                System.out.println("purchase of user " + this.firstName + " " + this.lastName);
                for (Product product: purchaseUser ) {
                     System.out.println(product.getName());
                }
        }

        public boolean addProduct(Product newProduct){
                return purchaseUser.add(newProduct);
        }

        @Override
        public String toString() {
                return "{" +
                        "name:'" + firstName + " " + lastName + '\'' +
                        ", id: " + id +
                        ", cash = " + cash +  "grn" + "}";
        }
}
