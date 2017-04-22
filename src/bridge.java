
import java.util.Scanner;


interface declare{
   abstract void  displaygreeting();
   abstract void  yourintroduction();
   abstract void summandaverage();
   abstract void si();
   abstract void area();
   abstract void perimeter();
   abstract void radius_and_lengthofcylinder_andvolume();
   abstract void fern_to_celcius();
   abstract void pound_to_kg();
   abstract void mathfunction();
   abstract void roll_name_nationality();
   abstract void relate_two_integer();
   abstract void largest();
   abstract void negative();
   abstract void triangle();
   abstract void odddeven();
   abstract void ascii();//YO GARYA CHAINA
   abstract void calculator();//YO GARYA CHAINA
   abstract void number_to_day();
   abstract void leapyear();
   abstract void multipletable();
   abstract void sum_of_natural_number();
   abstract void factorial();
   abstract void student();//YO GARYA CHAINA
   abstract void reverse_of_number();
   abstract void sumnproduct_of_number();
   
   abstract void mathematical();//YO GARYA CHAINA
   abstract void fibonacciseries();
   abstract void patterns();
   abstract void array_sum();
   abstract void reverse_element_of_array();
   abstract void ascending();
   abstract void second_largest_array();
   abstract void salesman();//YO AAFAI GAAR KK BHANYA HO
   abstract void matrixsum();
   abstract void palindrome();
   abstract void short_name();
   abstract void reverse_string();
   abstract void duplicate_letter();
  
   abstract void execption_handling();
   abstract void name_n_address();//YO GARYA CHAINA
   abstract void duplicate_word(); // YO GARYA CHAINA
   ////////////////////////
   //KEI METHOD CHUTYA CHA BHANE HEER AAFAI!!
}
//////////////////////////////////////////////////
//ADAPTER CLASS
/////////////////////////////////////////////////
class adapter implements declare{
    public void  displaygreeting(){}
   public  void  yourintroduction(){}
   public  void summandaverage(){}
   public void si(){}
   public void area(){}
   public void perimeter(){}
   public void radius_and_lengthofcylinder_andvolume(){}
   public void fern_to_celcius(){}
   public void pound_to_kg(){}//user input required
  public void mathfunction(){}//
    public void roll_name_nationality(){}
   public  void relate_two_integer(){}//==,<>
  public void largest(){}//three input required
   public void negative(){}//print only negative value
   public void triangle(){}//to accept three sides of triangle and display which kind of triangle is formed.
   public void odddeven(){}
  public void ascii(){}
   public void calculator(){}
   public void number_to_day(){}
  public void leapyear(){}
   public void multipletable(){}
   public void sum_of_natural_number(){}
   public void factorial(){}
   public void student(){}
   public void reverse_of_number(){}
   public void sumnproduct_of_number(){}
    public void mathematical(){}
   public void fibonacciseries(){}
   public void patterns(){}
   public void array_sum(){}
   public void reverse_element_of_array(){}
   public void ascending(){}
  public void second_largest_array(){}
   public void salesman(){}
   public void matrixsum(){}
   public void palindrome(){}
   public void short_name(){}
   public void reverse_string(){}
   public void duplicate_letter(){}
  
   public void execption_handling(){}//divided by zero error
   public void name_n_address(){}//filehandling YO AAFAI GAR JHAU LAGYO MALAI
    @Override
   public void duplicate_word(){}  //fiehandling  YO AAFI GAAR JHAU LAGYO MALAI
    
}
class bridge{
    
    public void isPrimenumber(int x){
        }
    
    
	public void firstNthPrime(int y){
        
        
        }
	public void allPrimebetween(int z, int k ){
        
          
        }
    
        
        
        
        

    
}