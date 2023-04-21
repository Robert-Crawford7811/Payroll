/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
import java.util.Scanner;
public class PayrollDemo {
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String in1;
int in2;
double in3,in4;   
System.out.print("Enter Name: ");
in1=sc.nextLine();
System.out.print("Enter Id Number: ");
in2=sc.nextInt();
System.out.print("Enter Hours Worked: ");
in3=sc.nextDouble();
System.out.print("Enter Hourly PayRate: ");
in4=sc.nextDouble();

Payroll p1=new Payroll(in1,in2);
p1.sethours_worked(in3);
p1.sethourly_payrate(in4);
System.out.println("Gross Pay is "+p1.grosspay());
}
}
