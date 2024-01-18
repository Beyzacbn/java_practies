
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"laptop","asus",5000,5,"siyah");
//        product.setName("Laptop");
//        product.setDescription("Asus");
//        product.setId(1);
//        product.setPrice(5000);
//        product.setStackAmount(5);

        ProductManager productManager =new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }
}