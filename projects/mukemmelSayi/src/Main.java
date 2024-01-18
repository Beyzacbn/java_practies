
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //sayının tüm bölenlerinin toplamı kendisine eşitse mükemmel sayıdır
        //6---> 1,2,3
        //28---> 1,2,3,4,7,14

        int number= 218;
        int total= 0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total + i;
            }
        }

        if(total == number ){
            System.out.println("Mükemmel sayıdır");
        }
        else{
            System.out.println("Mükemmel sayı değildir");
        }
    }
}