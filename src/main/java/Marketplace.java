import java.util.Scanner;

public class Marketplace {
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
        int menuIdlevel2 = 0;
        User User1 = new User( 1, "Lena", "Ivanova", 100);
        User User2 = new User(2, "Ira", "Petrova", 500);
        User User3 = new User(3, "Oleg", "Shevchenko", 1000);

        Product Product1 = new Product(1, "Beer", 50);
        Product Product2 = new Product(2, "Chicken", 150);
        Product Product3 = new Product(3, "Nuts", 50);



        for ( ;menuId != MarketplaceMenu.length; ){   //нескінченний цикл виконання програми, для виходу ідентифікатор меню має відповідати останньому пункту меню
            System.out.print("\033[H\033[J"); // очищує консоль
            for(int i = 0; i < MarketplaceMenu.length; i++){  // Виведення головного меню
                System.out.print(i+1);
                System.out.println(". " + MarketplaceMenu[i]);
            }
            System.out.println("Сhoose a menu item by dialing its number: ");
            menuId = in.nextInt();
            switch (menuId) {
                case 1:
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    //Вивід користувачів
                    System.out.print("\033[H\033[J"); // очищує консоль
                    User1.out();
                    User2.out();
                    User3.out();
                    System.out.print("Для повернення натисніть будь яку цифру");
                    menuIdlevel2 = in.nextInt();
                    break;
                case 2:
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    //Вивід продуктів Маркетплейсу
                    System.out.print("\033[H\033[J"); // очищує консоль
                    Product1.out();
                    Product2.out();
                    Product3.out();
                    System.out.print("Для повернення виберіть будь яку цифру");
                    menuIdlevel2 = in.nextInt();
                    break;
                case 3:
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    //Купівля продуктів користувачем
                    System.out.print("\033[H\033[J"); // очищує консоль
                    break;
                case 4:
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    //Відображення продуктів користувача
                    System.out.print("\033[H\033[J"); // очищує консоль
                    break;
                case 5:
                    System.out.println("Your choice: " + menuId + ". " + MarketplaceMenu[menuId-1]);
                    //список користувачів, які купили продукт, за ідентифікатором продукту
                    System.out.print("\033[H\033[J"); // очищує консоль
                    break;
                case 6:   //Вихід з програми
                    System.out.print("\033[H\033[J"); // очищує консоль
                    System.out.print("You have chosen to exit the program. \nThank you for using our program");
            }
        }

        in.close();

    }

}

