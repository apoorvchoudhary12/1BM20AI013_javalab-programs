Create class Number with only one private instance variable as a double primitive type.
To include the following methods (include respective constructors) isZero( ),
isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() the above
methods return boolean primitive type. getFactorial(), getSqrt(), getSqr(), sumDigits(),
getReverse() the above methods return double primitive type. void listFactor(), void
dispBinary()
  
  
  
  public class Number {
 private int x;
 public Number(){
  x=0;
 }
 public Number(int x){
  this.x=x;
 }
 public boolean isNegative(){
  if(x<0)
   return true;
  else return false;
 }
 public boolean isPositive(){
  if(x>0)
   return true;
  else return false;
 }
 public boolean isZero(){
  if(x==0)
   return true;
  else return false;
 }
 public boolean isOdd(){
  if(x%2!=0)
   return true;
  else return false;
 }
 public boolean isEven(){
  if(x%2==0)
   return true;
  else return false;
 }
 
 public static void main(String [] args) throws ArrayIndexOutOfBoundsException
 {
  int x=Integer.parseInt(args[0]);
  Number m=new Number(x);
  if(m.isNegative())
   System.out.println("Number is Negative");
  if(m.isPositive())
   System.out.println("Number is Positive");
  if(m.isEven())
   System.out.println("Number is Even");
  if(m.isOdd())
   System.out.println("Number is Odd");
  if(m.isZero())
   System.out.println("Number is Zero");
 }

}
