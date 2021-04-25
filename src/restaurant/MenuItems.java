package restaurant;

public class MenuItems {

    private String name;
    private Double price = 0.00;
    private String description;
    private String category;
    private boolean isNew;

    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }

    public void setPrice(Double aPrice) { price = aPrice; }
    public Double getPrice() { return price; }

    public void setDescription(String aDescription) {
        description = aDescription;
    }
    public String getDescription() {
        return description;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }
    public String getCategory() {
        return category;
    }
}
