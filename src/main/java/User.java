public class User {
        int id;
        String firstName;
        String lastName;
        int cash;
        public User (int a, String fn, String ln, int b){
                id = a;
                firstName = fn;
                lastName = ln;
                cash = b;
        }
        public void out(){
                System.out.print (id + ". " + firstName + " " + lastName + " " + cash + "$\n" );
        }
}
