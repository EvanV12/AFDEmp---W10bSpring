package cb.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	//public TestCustomer() {}

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Customer cust=(Customer) context.getBean("customer");
        System.out.println(cust.toString());
        
        Customer cust2=(Customer) context.getBean("customer");
        System.out.println(cust2.toString());
        
        
        /*cust.setColor("dark angel's green");
        cust2.setColor("red");*/
        
        System.out.println("\n"+cust.toString());
        System.out.println(cust2.toString());

	}

}
