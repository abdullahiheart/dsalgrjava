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
import java.util.Scanner;
public class lop {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
        
    }
    
}
