/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabgr;

/**
 *
 * @author abdal
 */
public class ConditionalsandLoops {
    public static void main(String[]args){
    /*
        Syntax of if statement
        if (boolean expression T or F ){
        else{
        do this
        }
        */
    int salary =25400;
    if (salary > 10000){
    salary = salary + 2000;
    }
    else {
    salary = salary + 1000;
    }
        System.out.println(salary);
    }
    
}
