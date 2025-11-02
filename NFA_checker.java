package automata;

import java.util.*;

public class NFA_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (a/b only): ");
        String input = sc.nextLine();
        
        if (isAccepted(input)) {
            System.out.println("Output: Accepted");
        } else {
            System.out.println("Output: Rejected");
        }
        
        sc.close();
    }

    // Function to simulate NFA
    public static boolean isAccepted(String input) {
        // States:
        // q0 = 0 (start)
        // q1 = 1 (saw 'a')
        // q2 = 2 (accept)
        Set<Integer> currentStates = new HashSet<>();
        currentStates.add(0); // start at q0

        for (char ch : input.toCharArray()) {
            Set<Integer> nextStates = new HashSet<>();

            for (int state : currentStates) {
                if (state == 0) {
                    if (ch == 'a') {
                        nextStates.add(0); // stay in q0
                        nextStates.add(1); // or move to q1
                    } else if (ch == 'b') {
                        nextStates.add(0); // stay in q0
                    }
                } 
                else if (state == 1) {
                    if (ch == 'a') {
                        nextStates.add(1); // stay in q1
                    } else if (ch == 'b') {
                        nextStates.add(2); // go to accept q2
                    }
                } 
                else if (state == 2) {
                    // once accepted, stay accepted
                    nextStates.add(2);
                }
            }

            currentStates = nextStates; // move to next step
        }

        // Accepted if state 2 is in current states
        return currentStates.contains(2);
    }
}
