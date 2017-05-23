package com.zbss.sevlet3;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("I will die");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("I am a Listener !");
	}

}
