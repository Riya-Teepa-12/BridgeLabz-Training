import java.util.*;
class AddNumber{
public static int addTwoNumber(int a, int b){
return a+b;
}
public static void main(String []args){
Scanner kb=new Scanner(System.in);
int a=kb.nextInt();
int b=kb.nextInt();
System.out.println(addTwoNumber(a,b));
}
}