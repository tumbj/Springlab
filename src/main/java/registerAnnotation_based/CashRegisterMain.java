package registerAnnotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configAnnotation.xml");

        CashRegister register = context.getBean( CashRegister.class);
        register.recordPurchase(100);
        System.out.println(register.getTotal());
    }
}
