package Streams;

import java.util.*;
import java.util.stream.*;

public class streamPractice {
    public static void main(String[]args){
        List<Employee> em=new ArrayList<>();
        em.add(new Employee(1, "Yanksha", 28, 123, "F", "HR", "Blore", 2020));
        em.add(new Employee(2, "Francesca", 29, 120, "F", "HR", "Hyderabad", 2015));
        em.add(new Employee(3, "Ramesh", 30, 115, "M", "HR", "Chennai", 2014));
        em.add(new Employee(4, "Melanie", 32, 125, "F", "HR", "Chennai", 2013));

        em.add(new Employee(5, "Padma", 22, 150, "F", "IT", "Noida", 2013));
        em.add(new Employee(6, "Milad", 22, 140, "M", "IT", "Gurugram", 2017));
        em.add(new Employee(7, "Uzma", 26, 130, "F", "IT", "Pune", 2016));
        em.add(new Employee(8, "Ali", 23, 145, "M", "IT", "Trivandam", 2015));
        em.add(new Employee(9, "Ram", 25, 160, "M", "IT", "Blore", 2010));
       
       
        // Q1. How do you group employees by city?
        // Map<String ,List<Employee> > map=em.stream().collect(Collectors.groupingBy(Employee::getCity));
        // map.forEach((key,employee)->{
        //     System.out.println("The city is : "+key);
        //     employee.forEach(emp-> System.out.println("The employee name are :"+ emp.getName()));
        // });


        //    Q2. How do you group employees by age?
        // Map<Integer,List<Employee>> mp=em.stream().collect(
        //     Collectors.groupingBy(Employee::getAge)
        // );
        // mp.forEach((key,employee)->{
        //     System.out.println("This is the age :"+key);
        //     employee.forEach(emp->System.out.println(emp.getName()));
        // });


        // Q3. How do you count male and female employees?
       
                                        
    }
    
}
