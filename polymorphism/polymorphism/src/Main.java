
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BaseLogger [] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger()};

        for( BaseLogger logger :loggers){
            logger.log("log mesajı");

        }

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();

    }
}