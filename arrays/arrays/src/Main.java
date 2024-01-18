
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Ayşe";
        String ogrenci3="Ahmet";
        String ogrenci4="Uğur";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Ayşe";
        ogrenciler[2]="Ahmet";
        ogrenciler[3]="Uğur";
       // ogrenciler[4]="Beyza";

        for(int i=0 ;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }





    }
}