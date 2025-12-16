import java.util.*;
class KilometerToMile{
public static double kilometerToMile(double k){
return k*0.621371;
}
public static void main(String[]args){
Scanner kb=new Scanner(System.in);
double km=kb.nextDouble();
System.out.println("In miles: "+kilometerToMile(km));
}
}