public class Product {

    private String name;
    private String code;
    private int count;
    private int price;

    public Product(String name, String code, int count, int price) {
        this.name = name;
        this.code = code;
        this.count = count;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

}
