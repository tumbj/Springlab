package register;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        CashRegister register = context.getBean("register", CashRegister.class);
        register.recordPurchase(100);
        System.out.println(register.getTotal());
        //asasd
    }
}
