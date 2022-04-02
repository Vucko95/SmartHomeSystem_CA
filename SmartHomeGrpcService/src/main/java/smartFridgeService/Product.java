package smartFridgeService;

class Product {
    int id;
    String name;
    int productStockStatus;

    public Product(int id, String name, int productStockStatus) {
        this.id = id;
        this.name = name;
        this.productStockStatus = productStockStatus;
    }
}