
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // reference type
        //stack-heap
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2; //2nin tuttuğu yeri tutar.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // value type
        //değerler değişir referans noktası değil
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);

        int [] sayilar1 = new int [] {1,2,3};
        int [] sayilar2 = new int [] {4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);



    }
}