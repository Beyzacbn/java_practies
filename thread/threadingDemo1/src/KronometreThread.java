import java.lang.Exception;
import java.util.*;
import java.lang.*;
import java.io.*;
public class KronometreThread implements Runnable{
    private Thread t ;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("oluşturuluyor:" +threadName);
    }

    public void run () {
        System.out.println("çalıştırılıyor: " +threadName);

        try{
            for(int i=1;i<=10;i++){
                System.out.println(threadName + ": " +i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception){
            System.out.println("kesildi: " +threadName);
        }

        System.out.println("Thread bitti: " +threadName);

    }

    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if(thread ==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }

}
