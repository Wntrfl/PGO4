public class MenuItem {
    private String code;
    private String name;
    private double price;
    private String category;
    private static int productCount;

    public MenuItem(String code, String name, double price, String category, int productCount) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        this.productCount = productCount;
    }

    public String getCode() {
        return code;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    static int numberOfProducts() {
        return MenuItem.productCount;
    }

    @Override
    public String toString() {
        return String.format("Code: %s | Name: %s | Price: $%.2f |Category:%s |",code, category,
                price, productCount);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MenuItem menuItem = (MenuItem) o;
        return code.equals(menuItem.code);
    }



}
