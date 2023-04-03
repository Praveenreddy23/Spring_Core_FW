package com.spelExpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
public static void main(String[] args) {
	ApplicationContext c = new ClassPathXmlApplicationContext("com/spelExpression/spel.xml");
	
	Spel s = c.getBean("Bean1",Spel.class);
	System.out.println(s);
	
	
//	System.out.println("---------------------------------");
//	SpelExpressionParser e = new SpelExpressionParser();
//	Expression ex = e.parseExpression("10+29");
//	System.out.println(ex.getValue());
}
}
