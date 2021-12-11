/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ryanh
 */
public class ex2part5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the capital of Ireland");
        String name = scanner.nextLine();
         
        String name2 = "dublin";
        String name3 = "Dublin";
        String name4 = "DUBLIN";
        
        
        if(name == name2 || name == name3 || name == name4)
        {
            System.out.println("Your are correct!");
        }
        else
        {
        
            System.out.println("Your are Wrong!");    
        }
        
        
    }
}
