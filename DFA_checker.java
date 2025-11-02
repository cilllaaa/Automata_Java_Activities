package automata;

import java.util.*;

//Accepting State - binary string ends with 01

public class DFA_checker {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a binary string: ");
		String input = sc.nextLine();
		
		if(isAccepted(input)) {
			System.out.print("Output: Accepted");
		} else {
			System.out.print("Output: Rejected");
		}
		sc.close();
	}
	
	public static boolean isAccepted(String str) {
		int state = 0;
		
		for(char ch: str.toCharArray()) {
			switch (state) {
			  case 0: 
                  if (ch == '0') state = 1;
                  else if (ch == '1') state = 0;
                  else return false; 
                  break;

              case 1: 
                  if (ch == '0') state = 1;
                  else if (ch == '1') state = 2;
                  else return false;
                  break;

              case 2: 
                  if (ch == '0') state = 1;
                  else if (ch == '1') state = 0;
                  else return false;
                  break;
			}
		}
		 return state == 2;
	}
}
