//import java.util.Scanner;
import java.math.BigDecimal;
import java.util.*;

public class Marketplace {
    private static List<User> users = new ArrayList<>(Arrays.asList(
            new User( 1, "Lena", "Ivanova", new BigDecimal("100.50")),
            new User(2, "Ira", "Petrova", new BigDecimal("500.00")),
            new User(3, "Oleg", "Shevchenko", new BigDecimal("1000.01"))
    ));

    private static List<Product> marketProdukts = new ArrayList<>(Arrays.asList(
            new Product(1, "Beer", new BigDecimal("50.25")),
            new Product(2, "Chicken", new BigDecimal("150.00")),
            new Product(3, "Nuts", new BigDecimal("50.00"))
    ));


    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String  MarketplaceMenu [] = {     // Пункти головного меню у вигляді масиву строк
            "List of all users",
            "List of all products",
            "Buy product",
            "list of user products by user id",
            "list of users that bought product",
            "Exit"
        };

        int menuId = 1;     // перемінна для вибору пункту меню
        int menuIdlevel2 = 0;// перемінна для вибору пункту меню 2-го рівня

        while ( menuId != MarketplaceMenu.length ){   //нескінченний цикл виконання програми, для виходу ідентифікатор меню має відповідати останньому пункту меню
//            System.out.print("\033[H\033[J"); // очищує консоль  (не працює?)
            System.out.println("\n");
            for(int i = 0; i < MarketplaceMenu.length; i++){  // Виведення головного меню
                System.out.print(i+1);
                System.out.println(". " + MarketplaceMenu[i]);
            }
            System.out.println("Сhoose a menu item by dialing its number: ");
            menuId = in.nextInt();
            switch (menuId) {
                case 1://Вивід користувачів
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    for(User user : users){    //Вивід користувачів
                        System.out.println(user);
                    }
                    //
                    System.out.print("To return main menu, select any number");
                    menuIdlevel2 = in.nextInt();
                    break;
                case 2://Вивід продуктів Маркетплейсу
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    System.out.println("\n");
                    for (Product product : marketProdukts) {  //Вивід продуктів Маркетплейсу
                        System.out.println(product);
                    }
                    System.out.print("To return main menu, select any number");
                    menuIdlevel2 = in.nextInt();
                    break;
                case 3:   //Купівля продуктів користувачем
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    System.out.println("Enter: Id of user who want to buy product");
                    int idUserBuy = in.nextInt();
                    System.out.println("Enter: Id of  product which user want to buy");
                    int idProductBuy = in.nextInt();
                    User selectedUser = getUserById(idUserBuy);
                    Product selectedProduct = getProductById(idProductBuy);
                    if (selectedProduct.getPrice().longValue() >=    selectedUser.getCash().longValue()){
                        System.out.println("Sorry, but the user does not have enough money in their account to make a purchase");
                    }
                    else {
                        selectedUser.addProduct(selectedProduct);
                        BigDecimal result = selectedUser.getCash().subtract(selectedProduct.getPrice());
                        selectedUser.setCash( result);
                        System.out.println("Congratulations. The product \"" + selectedProduct.getName() + "\" has been purchased user: " + selectedUser.getName() );
                    }
                    System.out.println("To return main menu, select any number");
                    menuIdlevel2 = in.nextInt();
                    break;
                case 4://Відображення продуктів користувача
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    System.out.println("Enter: Id of user: ");
                    int idUser = in.nextInt();
                    selectedUser = getUserById(idUser);
                    selectedUser.printPurchaseUser();
                    System.out.println("To return main menu, select any number");
                    menuIdlevel2 = in.nextInt();
                    break;
                case 5://список користувачів, які купили продукт, за ідентифікатором продукту
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    System.out.println("Enter: Id of product: ");
                    int idProduct = in.nextInt();
                    selectedProduct = getProductById(idProduct);
                    for(User user : users) {  //Перебір користувачів
                        for (Product product : user.getpurchaseUser()) {// перебір продуктів користувача
                            if ( product == selectedProduct) {
                                System.out.println(user.getName());
                            }
                        }
                    }
                    System.out.println("To return main menu, select any number");
                    menuIdlevel2 = in.nextInt();
                    break;
                case 6:   //Вихід з програми
                    System.out.println("You have chosen to exit the program. \nThank you for using our program");
            }
        }

        in.close();

    }

    public static User getUserById(int id) {
        for (User user : users) {
            if(user.getId() == id) return user;
        }
        return null;
    }

    public static Product getProductById(int id) {
        for (Product product : marketProdukts) {
            if(product.getId() == id) return product;
        }
        return null;
    }

}

