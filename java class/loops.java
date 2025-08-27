public class loops {
<<<<<<< HEAD
    
    public static void main (String[] args) {
       // out put numbbers 1 to 10
       // starting point
       int Start = 1;
       //ending point
       int end = 50;


       //if divisible bt 3 - fizz
       //if divisible by 5 - buzzz
       //if divisible by both 3 and

       
       
       while (Start <=end) {
            System.out.println(Start);
            Start = Start + 1 ;
       }
=======
    public static void main(String[] args) {
        //out put numbers 1 to 10
        //starting point
        int start = 1;
        //ending point
        int end = 10;

        // while (start <= end) {
        //     System.out.println(start);
        //     start++;
        // }

        int start2 = 1;
        while(start2 <= 50){
            if (start2 % 3 == 0 && start2 % 5 == 0) {
                System.out.println(start2 + " - fizzbuzz");
            }else if (start2 % 3 == 0){
                System.out.println(start2 + " - fizz");
            }else if (start2 % 5 == 0){
                System.out.println(start2 + " - buzz");
            }
            start2 ++;
        }

        //if divisible by 3- fizz
        //if divisible by 5- buzz
        //if divisible by 3 and 5- fizzbuzz

        //arithmetic operators
        // + addition
        // - subtraction
        // / division
        // * multiplication

        //logical operators
        // || OR
        // && AND
        // ! NOT

        // relational operators
        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to
        // == equal to
        // != not equal to

       
>>>>>>> e8c72c2723bb56a78aed0b1aa630fca4e0144ef8
    }
}
