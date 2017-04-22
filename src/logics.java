
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class logics extends adapter {

    Scanner sn = new Scanner(System.in);

    public void displaygreeting() {

        System.out.println("NAMASTE");
        System.out.println("GOOD_MORNING");
        System.out.println("GOOD_DAY");

    }
////////////////////////////////////////////////////////////////

    public void yourintroduction() {
        System.out.println("my name is gaurav jung kunwar");
        System.out.println("i live iin thankot");
        System.out.println("i am in early 20's");

    }
//////////////////////////////////////////////////////////////

    public void summandaverage() {

        //    Scanner sn = new Scanner(System.in);
        System.out.println("Enter first number");

        int a = sn.nextInt();
        System.out.println("enter second number");

        int b = sn.nextInt();
        System.out.println("Enter third number");

        int c = sn.nextInt();
        System.out.println("sum is=" + a + b + c + "  " + "Average=" + (a + b + c) / 3);

    }
///////////////////////////////////////////////////////////

    public void si() {
        //Scanner sn = new Scanner(System.in);
        System.out.println("Enter principal");

        int a = sn.nextInt();
        System.out.println("enter time");

        int b = sn.nextInt();
        System.out.println("Enter rate");

        int c = sn.nextInt();
        System.out.println("Simple intrest=" + (a * b * c) / 100);

    }
///////////////////////////////////////////////////////////

    public void area() {
        // Scanner sn = new Scanner(System.in);
        System.out.println("Enter radius");

        float a = sn.nextFloat();
        System.out.println("Area of circle=" + 3.14 * a * a);

        System.out.println("enter length of rectangle");

        float l = sn.nextFloat();
        System.out.println("enter breath of rectangle");

        float b = sn.nextFloat();
        System.out.println("Area of reactagle=" + l * b);

        System.out.println("base of  triangle");//right angled triangle

        float c = sn.nextFloat();
        System.out.println("height of  rectangle");

        float h = sn.nextFloat();
        System.out.println("Area of triangle=" + (c * h));

    }
//////////////////////////////////////////////////////////////

    public void perimeter() {
        System.out.println("Enter radius");

        float a = sn.nextFloat();
        System.out.println("perimeter of circle=" + 2 * 3.14 * a);

        System.out.println("enter length of rectangle");

        float l = sn.nextFloat();
        System.out.println("enter breath of rectangle");

        float b = sn.nextFloat();
        System.out.println("Perimeter of reactagle=" + 2 * (l + b));

        System.out.println("base of  triangle");//right angled triangle

        float c = sn.nextFloat();
        System.out.println("height of  rectangle");

        float h = sn.nextFloat();
        System.out.println("perpendicular of  rectangle");

        float p = sn.nextFloat();

        System.out.println("perimeter of triangle=" + (c + h + p));

    }
////////////////////////////////////////////////////////////////////

    public void radius_and_lengthofcylinder_andvolume() {
        System.out.println("enter radius of cylinder");
        float r = sn.nextFloat();

        System.out.println("enter radius of length");
        float l = sn.nextFloat();

        System.out.println("Volume of cylinder=" + 3.14 * r * r * l);

    }
////////////////////////////////////////////////////////////////////

    public void fern_to_celcius() {
        System.out.println("enter celcius");
        float c = sn.nextFloat();
        System.out.println("ferentheith" + (9 / 5) * c + 32);

        System.out.println("enter ferenheith");
        float f = sn.nextFloat();
        System.out.println("ferentheith" + (5 / 9) * (f - 32));

    }
/////////////////////////////////////////////////////////////////////

    public void pound_to_kg() {
        System.out.println("enter kg");
        float c = sn.nextFloat();
        System.out.println("pound=" + c * .454);
        System.out.println("enter pound");
        float p = sn.nextFloat();
        System.out.println("kg=" + c / .454);

    }

////////////////////////////////////////////////////////////////////
    public void mathfunction() {

        System.out.println("for calculation of s=ut+.5*a*t*t");
        System.out.println("enter u");
        float u = sn.nextFloat();
        System.out.println("enter t");
        float t = sn.nextFloat();
        System.out.println("enter a");
        float a = sn.nextFloat();
        System.out.println("s=" + u * t + (.5 * a * t + t));

        System.out.println("for calculation of a=(squarerootof(s(s-a)*(s-b)*(s-c))");
        System.out.println("enter s");
        float s = sn.nextFloat();
        System.out.println("enter a");
        float aa = sn.nextFloat();
        System.out.println("enter b");
        float b = sn.nextFloat();
        System.out.println("enter c");
        float c = sn.nextFloat();
        float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("area=" + area);

        System.out.println("for calculation of s=ut+.5*a*t*t" + area);

        System.out.println("for calculation of x=(-b+squreroot(b*b-4*a*c))/(2*a)");
        System.out.println("enter b");
        float bb = sn.nextFloat();
        System.out.println("enter a");
        float aaa = sn.nextFloat();
        System.out.println("enter cc");
        float cc = sn.nextFloat();
        float x = (float) (((-b) + Math.sqrt(bb - 4 * aaa * cc)) / (2 * a));
        System.out.println("value of x=" + x);

    }
///////////////////////////////////////////////////////////////////////////////////

    public void roll_name_nationality() {

        int roll = sn.nextInt();
        String name = sn.next();
        String nationality = sn.next();
        System.out.println("" + roll + "" + name + "" + nationality);
    }
/////////////////////////////////////////////////////////////////////////////////

    public void relate_two_integer() {
        System.out.println("input number");
        int a = sn.nextInt();
        System.out.println("input 2nd nuber");
        int b = sn.nextInt();
        if (a == b) {
            System.out.println("They are equal");
        }
        if (a < b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");

        }
    }
////////////////////////////////////////////////////////////////////////////////

    public void largest() {
        System.out.println("first number");
        int a = sn.nextInt();
        System.out.println("second number");
        int b = sn.nextInt();
        System.out.println("third number");
        int c = sn.nextInt();
        if (a > b && a > c) {
            System.out.println(a + "is greatest");

        } else if (b > a && b > c) {
            System.out.println(b + "is greatest");

        } else {
            System.out.println(c + "is greatest");

        }
    }
////////////////////////////////////////////////////////////////////////////////

    public void negative() {
        System.out.println("Enter a number negative or positive");
        float a = sn.nextFloat();
        if (a < 0) {
            System.out.println("" + a);
        }

    }

////////////////////////////////////////////////////////////////////////////////
    public void triangle() {
        System.out.println("enter first side's length of triangle");
        int a = sn.nextInt();
        System.out.println("enter second side's length of triangle");
        int b = sn.nextInt();
        System.out.println("enter third side's length of triangle");
        int c = sn.nextInt();
        if (a == b && a == c && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a != b && a != c && b != c) {
            System.out.println("Scalene triangle");

        } else {
            System.out.println("Isoceles Triangle");
        }

    }
///////////////////////////////////////////////////////////////////////////////////

    public void odddeven() {
        System.out.println("enter number");
        int a = sn.nextInt();
        if (a % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("Odd number");
        }

    }
/////////////////////////////////////////////////////////////////////////////////

    public void ascii() {
    }
//////////////////////////////////////////////////////////////////////////////////
    public void calculator() {
    }
////////////////////////////////////////////////////////////////////////////////////
    public void number_to_day() {
        System.out.println("enter nummber from 1 to 7");
        int a=sn.nextInt();
        if(a==1){
            System.out.println("Sunday");
        }else if(a==2){
            System.out.println("monday");
        }
        else if(a==3){
            
        System.out.println("tuseday");
        }else if(a==4){
            
        System.out.println("Wednesday");
        }else if(a==5){
            
        System.out.println("Thursday");
        }else if(a==6){
            
        System.out.println("friday");
        }
        else 
    System.out.println("Saturday");    
            
        }
        
   /////////////////////////////////////////////////////////////////////////////     
    

    public void leapyear() {

        int year = 2004;

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }
///////////////////////////////////////////////////////////////////////////////////
    public void multipletable() {
        System.out.println("Enter a number");
        int a = sn.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }

    }
////////////////////////////////////////////////////////////////////////////////
    public void sum_of_natural_number() {
        System.out.println("Enter a number");
        int n = sn.nextInt();
        System.out.println("sum of natural number is +" + (n * (n + 1) / 2));

    }
/////////////////////////////////////////////////////////////////////////////////

    public void factorial() {
        int i, fact = 1;
        int number = 5;//It is the number to calculate factorial    
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
////////////////////////////////////////////////////////////////////////////////
    public void student() {
    }
/////////////////////////////////////////////////////////////////////////////////
    public void reverse_of_number() {
        int n, reverse = 0;

        System.out.println("Enter the number to reverse");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse of entered number is " + reverse);
    }
//////////////////////////////////////////////////////////////////////////////////
    public void sumnproduct_of_number() {
        int sum = 0;
        int sum1 = 1;
        
        System.out.println("Enter number");
        int n=sn.nextInt();
        while (n > 9) {
            int rem;
            rem = n % 10;
            sum = sum + rem;
            sum1 = sum1 * rem;
            n = n / 10;
        }
        n = sum;
        System.out.println("sum is" + sum + "product is " + sum1);
    }
/////////////////////////////////////////////////////////////////////////////////////
   
////////////////////////////////////////////////////////////////////////////////////
    public void mathematical() {
    }
////////////////////////////////////////////////////////////////////////////////

    public void fibonacciseries() {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1    

        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed    
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
////////////////////////////////////////////////////////////////////////////////

    public void patterns() {
        int count = 4;
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < (count - i); j++) {
                System.out.print(i);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(k);
            }
            System.out.print('\n');
        }

    }
///////////////////////////////////////////////////////////////////////////////

    public void array_sum() {

        int a[] = new int[5];
        System.out.println("Enter  number of array");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter first number of array");
            a[i] = sn.nextInt();
            sum = sum + a[i];

        }
        System.out.println("sum of array" + sum);
    }
//////////////////////////////////////////////////////////////////////////////

    public void ascending() {
        int n, temp;
        System.out.print("Enter no. of elements you want in array:");
        n = sn.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }

    //////////////////////////////////////////////////////////////////////////
    public void reverse_element_of_array() {
        int size, i, j, temp;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        size = scan.nextInt();

        System.out.print("Enter Array Elements : ");
        for (i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        j = i - 1;     // now j will point to the last element
        i = 0;         // and i will point to the first element

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("Now the Reverse of Array is : \n");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

/////////////////////////////////////////////////////////////////////////////////
    public void second_largest_array() {
        int arr[] = {14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
        int largest = arr[0];
        int secondLargest = arr[0];

        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }

        System.out.println("\nSecond largest number is:" + secondLargest);

    }

    public void salesman() {

    }
//////////////////////////////////////////////////////////////////////////////////

    public void matrixsum() {

        int i, j;
        int a = 0;
        int arr[] = {4, 5, 6, 2, 7, 8, 3, 1, 9};
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scan = new Scanner(System.in);
        int arrsum[] = new int[9];
        System.out.println("Enter Matrix 1 Elements : ");
        for (i = 0; i < arr.length; i++) {
            arrsum[i] = arr[i] + arr1[i];
            System.out.println("" + arrsum[i]);
        }

    }
    /////////////////////////////////////////////////////////////////////////////

    public void palindrome() {
        String str = "MADAM";
        String revstring = "";

        for (int i = str.length() - 1; i >= 0; --i) {
            revstring += str.charAt(i);
        }

        System.out.println(revstring);

        if (revstring.equalsIgnoreCase(str)) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
/////////////////////////////////////////////////////////////////////////////////

    public void short_name() {
        System.out.println("Enter first name");
        String fname = sn.next();
        String toUpperCase = fname.toUpperCase();
        System.out.println("Enter middle name");
        String mname = sn.next();
        String toUpperCase1 = mname.toLowerCase();
        System.out.println("Enter last name");
        String lname = sn.next();

        System.out.println("Short-form:" + toUpperCase.charAt(0) + "." + toUpperCase1.charAt(0) + "." + lname);

    }
//////////////////////////////////////////////////////////////////////////////////

    public void reverse_string() {
        String input = "";
        System.out.println("Enter the input string");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1 = input.toCharArray();
            for (int i = try1.length - 1; i >= 0; i--) {
                System.out.print(try1[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//////////////////////////////////////////////////////////////////////////////////

    public void duplicate_letter() {
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        System.out.println("Enter words");
        String str = sn.nextLine();
        char[] chrs = str.toCharArray();
        for (Character ch : chrs) {
            if (dupMap.containsKey(ch)) {
                dupMap.put(ch, dupMap.get(ch) + 1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        System.out.println("Space");

        for (Character ch : keys) {

            if (dupMap.get(ch) > 1) {
                System.out.println(ch + "--->" + dupMap.get(ch));
            }
        }

    }

//////////////////////////////////////////////////////////////////////////////////
    public void execption_handling() {
        int a = 0;
        int b = 30;
        try {
            int c = b / a;
        } catch (Exception ex) {
            System.out.println("" + ex);
        }
    }
/////////////////////////////////////////////////////////////////////////////////

    public void name_n_address() {
    }//filehandling
/////////////////////////////////////////////////////////////////////////////////

    public void duplicate_word() {
    }
////////////////////////////////////////////////////////////////////////////////
}
