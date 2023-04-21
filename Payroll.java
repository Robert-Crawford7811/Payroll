/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
public class Payroll
{
String name;
int Id;
double payrate;
double hours_worked;

Payroll(String Name,int id){
this.name=Name;
this.Id=id;
}

void setName(String Name){this.name=Name;}
String getName(){return this.name;}

void setId(int id){this.Id=id;}
int getId(){return this.Id;}

void sethours_worked(double Hours_worked){this.hours_worked=Hours_worked;}
double gethours_worked(){return this.hours_worked;}

void sethourly_payrate(double Hourly_payrate){
this.payrate=Hourly_payrate;}
double gethourly_payrate(){return this.payrate;}


double grosspay(){
return (this.hours_worked*this.payrate);
}
}