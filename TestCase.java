public class TestCase {

    public static void main(String[] args) {

        Dispatcher dispatcher = new Dispatcher();

        Customer User1 = new Customer("Bob");

        Customer User2 = new Customer("Sean");

        Movie Spiderman = new Movie("Spiderman", 0);
        Movie Ironman = new Movie("Ironman", 1);
        Movie Superman = new Movie("Superman", 1);

        Rental cost1 = new Rental(Spiderman, 2);
        Rental cost2 = new Rental(Ironman, 10);
        Rental cost3 = new Rental(Superman, 10);

        Interceptor interceptor = new Interceptor() {
            public void rentalAdded(ContextObject contextObject) {
                System.out.println("Name: " + contextObject.getName());
                System.out.println("Movie: " + contextObject.getTitle());
                System.out.println("Days Rented: " + contextObject.getRental().getDaysRented());
            }
        };

        dispatcher.register(interceptor);

        User1.addRental(cost1);
        ContextObject contextObject1 = new ContextObject(User1, cost1);
        dispatcher.rentalAdded(contextObject1);

        User1.addRental(cost2);
        ContextObject contextObject2 = new ContextObject(User1, cost2);
        dispatcher.rentalAdded(contextObject2);

        User1.addRental(cost3);
        ContextObject contextObject3 = new ContextObject(User1, cost3);
        dispatcher.rentalAdded(contextObject3);

        User2.addRental(cost1);
        ContextObject contextObject4 = new ContextObject(User2, cost1);
        dispatcher.rentalAdded(contextObject4);
    }
}