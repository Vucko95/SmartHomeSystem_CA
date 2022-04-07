package smartFridgeService;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class SmartFridgeProtoServiceImpl extends SmartFridgeServiceGrpc.SmartFridgeServiceImplBase {

    private List<Product> products = setProducts();

    private List<Product> setProducts() {
        List<Product> products = new ArrayList<Product>();

        products.add(new Product(1,"Milk",3));
        products.add(new Product(2,"Cheese",10));
        products.add(new Product(3,"Eggs",4));
        products.add(new Product(4,"Bacon",5));

        return products;
    }

    @Override
    public void productStockChecker(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {
        final String product = request.getProduct();

        Product prod = this.products.stream()
                .filter(p -> p.name.equalsIgnoreCase(product))
                .findFirst().orElse(new Product(0,product,0));
        		System.out.println( "This one is not in fridge");

        responseObserver.onNext(ProductResponse.newBuilder()
                .setProduct(product)
                .setStockStatus(prod.productStockStatus)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void fullStockChecker(ProductRequestNoParam request, StreamObserver<ProductResponse> responseObserver) {
        try {
            for(Product product : products){
                responseObserver.onNext(ProductResponse.newBuilder()
                        .setProduct(product.name)
                        .setStockStatus(product.productStockStatus)
                        .build());

                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            responseObserver.onError(e);
        }finally {
            responseObserver.onCompleted();
        }
    }


}
