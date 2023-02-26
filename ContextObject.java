public class ContextObject {
    private Customer customerObj;
    private Rental rentalObj;

    public ContextObject(Customer customer, Rental rental) {
        customerObj = customer;
        rentalObj = rental;
    }

    public Rental getRental() {
        return rentalObj;
    }

    public String getName() {
        return customerObj.getName();
    }

    public String getTitle() {
        return rentalObj.getMovie().getTitle();
    }

}
