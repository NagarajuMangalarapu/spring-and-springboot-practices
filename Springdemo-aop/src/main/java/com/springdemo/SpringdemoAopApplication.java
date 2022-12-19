package com.springdemo;

import com.springdemo.dao.AccountDao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringdemoAopApplication {

	public static void main(String[] args) {
    ApplicationContext applicationContext =   SpringApplication.run(SpringdemoAopApplication.class, args);
    
    AccountDao accountDao =applicationContext.getBean(AccountDao.class);
    accountDao.addAccount();
    accountDao.welcome();
    
	}

}
