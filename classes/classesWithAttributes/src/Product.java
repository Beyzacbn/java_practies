public class Product {

    public Product(int id,String name, String description,double price,int stackAmount,String renk){
        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stackAmount=stackAmount;
        this.renk=renk;
    }

    public Product(){

    }
    //sadece tanımlandığı blokta geçerli
    private int id;
    private String name;
    private String description;
    private double price;
    private int stackAmount;
    private String renk;
    private String kod;


    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStackAmount() {
        return stackAmount;
    }

    public void setStackAmount(int stackAmount) {
        this.stackAmount = stackAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

}
