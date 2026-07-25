//making the inner class static we can use other class without creating its object

// class staticKeyword{
//     static class BankAccount{
//         public static int turnOver;
//         private double holdings;
//         public static String vpName;
//         BankAccount(double holdings){
//             this.holdings=holdings;
//         }
        
//     }
//     public static void main(String[]args){
//         BankAccount b=new BankAccount(8000);
//         b.turnOver=4000;
//         b.vpName="Dalip";
//         System.out.println(b.turnOver);
//         System.out.println(b.vpName);
//     }
// }


//we have to first create the obejct of staticKeyword class by using that only we can create the object of BankAccount class
// class staticKeyword{
//      class BankAccount{
//         public static int turnOver;
//         private double holdings;
//         public static String vpName;
//         BankAccount(double holdings){
//             this.holdings=holdings;
//         }
        
//     }
//     public static void main(String[]args){
//         staticKeyword outer=new staticKeyword();
//         BankAccount b=outer.new BankAccount(8000);
//         b.turnOver=9000;
//         b.vpName="Dalip Tandon";
//         System.out.println(b.turnOver);
//         System.out.println(b.vpName);
//     }
// }

//here demo function is not static that's why we have to create the object of the class using that object we can use the demo function
// class staticKeyword{
//     void demo(){
//         System.out.println("this is demo");
//     }
//     public static void main(String[]args){
//        staticKeyword s=new staticKeyword();
//        s.demo();
//     }
// }

//no need to create object of the class as we are using the static keyword
class staticKeyword{
   static void demo(){
        System.out.println("this is demo static function");
    }
    public static void main(String[]args){
    //    staticKeyword s=new staticKeyword();
       demo();
    }
}