
import java.util.Scanner;

class abc extends logics {

    public static void main(String[] args) {
        System.out.println("Enter question number");
        int a = 0;
        logics l = new logics();
          bridge b=new bridge();
       System.out.println("For question no 27 enter number  43 or 44 or 45 ");
            
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        switch (a) {
            case 1:
                System.out.println("display greeting");
                l.displaygreeting();
                break;
            case 2:
                
                System.out.println("your introduction");
                l.yourintroduction();
                break;
            case 3:
                
                System.out.println("sum and average");
                l.summandaverage();
                break;
            case 4:
                
                System.out.println("Simple intrest");
                l.si();
                break;
            case 5:
                
                System.out.println("Area");
                l.area();
                break;
            case 6:
                
                System.out.println("perimeter");
                l.perimeter();
                break;
            case 7:
                
                System.out.println("volume of cylinder");
                l.radius_and_lengthofcylinder_andvolume();
                break;
            case 8:
                
                System.out.println("ferenheit to celcius");
                l.fern_to_celcius();
                break;
            case 9:
                
                System.out.println("pound to kg");
                l.pound_to_kg();
                break;
            case 10:
                
                System.out.println("Math functions");
                l.mathfunction();
                break;
            case 11:
                
                System.out.println("roll_name_nationality");
                l.roll_name_nationality();
                break;
            case 12:
                
                System.out.println("relate two innteger");
                l.relate_two_integer();
                break;
            case 13:
                
                System.out.println("largest");
                l.largest();
                break;
            case 14:
                
                System.out.println("negative display");
                l.negative();
                break;
            case 15:
                
                System.out.println("types of triangle");
                l.triangle();
                break;
            case 16:

                System.out.println("odd or even");
                l.odddeven();
                break;
            case 17:
                l.ascii();//YO GARYA CHAINA
                break;
            case 18:
                l.calculator();//YO GARYA CHAINA
                break;
            case 19:
                
                System.out.println("number to day");
                l.number_to_day();
                break;
            case 20:
                
                System.out.println("leapyear");
                l.leapyear();
                break;
            case 21:
                
                System.out.println("multiple table");
                l.multipletable();
                break;
            case 22:
                
                System.out.println("sum of n natural numbers");
                l.sum_of_natural_number();
                break;
            case 23:
                
                System.out.println("factorial");
                l.factorial();
                break;
            case 24:
                
                System.out.println("");
                l.student();//YO GARYA CHAINA
                break;
            case 25:
                
                System.out.println("reverse of number");
                l.reverse_of_number();
                break;
            case 26:
                
                System.out.println("sum and product of number");
                l.sumnproduct_of_number();
                break;
            case 27:
                
                System.out.println("");
                l.mathematical();//YO GARYA CHAINA
                break;
            case 28:
                
                System.out.println("fibonacci");
                l.fibonacciseries();
                break;
            case 29:
                
                System.out.println("patterns");
                l.patterns();
                break;
            case 30:
                
                System.out.println("array sum");
                l.array_sum();
                break;
            case 31:
                
                System.out.println("reverse of array");
                l.reverse_element_of_array();
                break;
            case 32:

                System.out.println("ascending in array");
                l.ascending();
                break;
            case 33:
                
                System.out.println("second largest in array");
                l.second_largest_array();
                break;
            case 34:
                l.salesman();//YO AAFAI GAAR KK BHANYA HO
                break;
            case 35:
                
                System.out.println("matrix sum");
                l.matrixsum();
                break;
            case 36:
                
                System.out.println("palindrome");
                l.palindrome();
                break;
            case 37:
                
                System.out.println("short name");
                l.short_name();
                break;
            case 38:
                
                System.out.println("reverse string");
                l.reverse_string();
                break;
            case 39:
                
                System.out.println("duplicate letter");
                l.duplicate_letter();
                break;
            case 40:
                
                System.out.println("execption handling");
                l.execption_handling();
                break;
            case 41:
                l.name_n_address();//YO GARYA CHAINA
                break;
            case 42:
                l.duplicate_word(); // YO GARYA CHAINA
                break;
        
               case 43:
        b.allPrimebetween(1, 100);
        break;
            case 44:
        b.firstNthPrime(100);
        break;
            case 45:
        b.isPrimenumber(7);
                break;
    }}

}
