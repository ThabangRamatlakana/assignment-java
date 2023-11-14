/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentquestion2;

import java.util.Random;
import java.util.Scanner;

// Farrell, J. 2019. JAVA PROGRAMMING. 9th edition. Boston; Cengage
public class AssignmentQuestion2 
{

    
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       Random rand = new Random();
       
       String networks[] = { "Vodacom", "MTN", "Cell C" };
       String names[] = new String[3];
       String networkProviders[] = new String[3];
       String phones[] = new String[3];
       
       
       for (int i = 0; i < 3; i++) 
       {
	System.out.print("Enter the name of the employee " + (i + 1) + ": ");
       
       
       names[i] = in.nextLine();
       boolean isProviderValid = false;
       int randP = 0;
       
       while (!isProviderValid) 
       {
          isProviderValid = true;
	  randP = rand.nextInt(3);
          
          
	  for (int provider = 0; provider < 3; provider++) 
          {
	  if (networkProviders[provider] == networks[randP]) 
          {
	    isProviderValid = false;
          }
          }
        }
	networkProviders[i] = networks[randP];
	phones[i] = networkProviders[i] + " 0" + rand.nextInt(10) + rand.nextInt(10);
	System.out.println("The employee network provider is: " + networkProviders[i]);
	System.out.println("The employee phone number is: " + phones[i] + "\n");

    }
    }
    
    
}
