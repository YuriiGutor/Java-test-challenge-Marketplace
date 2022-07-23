import java.util.Scanner;

public class Marketplace {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String  MarketplaceMenu [] = {
            "List of all users",
            "List of all products",
            "Buy product",
            "list of user products by user id",
            "list of users that bought product",
            "Exit"
        };

        for(int i = 0; i < MarketplaceMenu.length; i++){
           System.out.print(i+1);
            System.out.println(". " + MarketplaceMenu[i]);
        }
        System.out.println("Сhoose a menu item by dialing its number: ");
        int menuId = in.nextInt();
        System.out.println("Your choice: \n" + menuId + ". " + MarketplaceMenu[menuId-1]);

        /*
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.println("Your name: " + name + " Your age : " + age + " Your Height: " + height);
        */

        in.close();

    }

}

