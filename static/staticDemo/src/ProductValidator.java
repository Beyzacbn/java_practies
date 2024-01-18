public class ProductValidator {
    // method static yapıldığında class ismiyle çağrılabilir.
    // static tanımlandığında bellekte kalır hep
    // new olmasa da static yapı ile çağrıldığında çalışır

    static{
        System.out.println("static yapıcı blok çalıştı");
    }

    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
