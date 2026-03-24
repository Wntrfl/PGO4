public class CafeCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void printCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
    }

    @Override
    public String toString() {
        return String.format("Customer ID: %s | First name: %s | Last name: %s |Email:%s |" , customerId, firstName,
                lastName, email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CafeCustomer that = (CafeCustomer) o;
        return customerId == that.customerId&&email.equals(that.email);
    }

}

