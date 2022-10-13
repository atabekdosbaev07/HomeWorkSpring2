package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
          ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
          Person person = context1.getBean("Person",Person.class);
          Person person2 = context1.getBean("Person2",Person.class);

          person.getAnimal().animalMinus();
          person.getAnimal().animalPlus();
          System.out.println(person);

          System.out.println();

          person2.getAnimal().animalPlus();
          person2.getAnimal().animalMinus();
          System.out.println(person2);











    }
}
