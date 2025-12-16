import java.util.*;

class CelciusConvertor{

public static double CelciusToFarheneit(double t){
return (t*(9/5))+32;
}
public static void main(String []args){
Scanner kb=new Scanner(System.in);
double cel=kb.nextDouble();
System.out.println("Temperature in degree fahrenheit"+ CelciusToFarheneit(cel));
}
}