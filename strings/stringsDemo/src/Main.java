
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);


        System.out.println("Eleman sayısı:" +mesaj.length());
        System.out.println("5.eleman:" +mesaj.charAt(4));  //0'dan başlar
        System.out.println(mesaj.concat("Yaşasın!"));  // mesaj yazdırılırken değişir eski hali korunur.
        System.out.println(mesaj.startsWith("B")); // "B" harfi ile mi başlıyor
        System.out.println(mesaj.endsWith(".")); // sonunda nokta var mı / true-false

        char [] karakterler = new char [5];
        mesaj.getChars(0,5,karakterler,0); // mesajın ilk 4 karakterini karakterler dizisine 0'dan başlayarak gönder.
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av")); // baştan kaçıncı index av
        System.out.println(mesaj.lastIndexOf("a")); // sondan aramaya başlar, indexi baştan sayar

        String yeniMesaj= mesaj.replace(' ','-');  //boşlukları '-'ile değiştir
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,4)); // 2 ve 3. elemanı alır - 4 dahil değil.

        for(String kelime :mesaj.split(" ")){    // boiluk gördüğünde ayır parçaları yazdır.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // tüm harfleri küçük yap
        System.out.println(mesaj.toUpperCase()); // tüm harfleri büyük yap

        System.out.println(mesaj.trim());

    }
}