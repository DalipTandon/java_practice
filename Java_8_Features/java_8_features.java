package Java_8_Features;

import java.util.*;
// public class java_8_features {
//     public static void main(String[] args){
//         List<Students> li=new ArrayList<>();
//         li.add(new Students("Dalip",23,99));
//         li.add(new Students("Rahul",25,90));
//         li.add(new Students("Deepak",26,85));
//         li.add(new Students("Prakash",21,88));

//         //functional interfaces, instead of using comparable interface or creating the objects or creating the anonymous classes we are 
//         //are using the lambda expressions here
//         Collections.sort(li,(Students s1,Students s2)->s1.marks-s2.marks); 
//         for(Students s:li){
//             System.out.println("Name : "+s.name +" Age : "+s.age + " Marks : "+s.marks);
//         }
//     }
// }
// class Students{
//     String name;
//     int age;
//     int marks;
//     Students(String name,int age,int marks){
//         this.name=name;
//         this.age=age;
//         this.marks=marks;
//     }
// }



                    //without lambdas
// public class java_8_features implements  functionaInterface{
//     public int sum(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args){
//         functionaInterface obj=new java_8_features();
//         int total=obj.sum(4, 5);
//         System.out.println(total);
//         obj.check();
//     }
// }
// interface functionaInterface{
//     int  sum(int a,int b);
//     static int calculate(int a,int b){
//         return a+b;
//     }
//     default void check(){
//         System.out.println("This code is for testing purpose");
//     }
// }


                    //with lambdas
public class java_8_features {
    
    public static void main(String[] args){
        functionaInterface obj=(a,b)->a+b;
        System.out.println(obj.sum(5, 6));
        obj.check();
    }
}
interface functionaInterface{
    int  sum(int a,int b);
    static int calculate(int a,int b){
        return a+b;
    }
    default void check(){
        System.out.println("This code is for testing purpose");
    }
}