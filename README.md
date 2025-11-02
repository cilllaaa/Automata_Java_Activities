# Automata_Java_Activities
Automata activities and projects

**DFA String Acceptance Checker**

Objective: Implement a DFA that accepts binary strings ending with 01.

Instructions:
Write a Java program that takes a binary string as input.
Simulate the DFA and print whether the string is accepted or rejected.
Hint:

States: q0 (start), q1, q2 (accept)
Language: Strings ending with '01'
 
Sample Input/Output:
Input: 1101
Output: Accepted
 
Input: 1110
Output: Rejected

Screenshot: 
<img width="775" height="237" alt="image" src="https://github.com/user-attachments/assets/41a537af-a80a-4a17-a501-a05560258ebd" />


**NFA Simulation (Multiple Next States)**

Objective: Build an NFA simulator for strings containing ab as a substring.

Instructions:
Represent the NFA using a map: state -> (symbol -> set of next states).
Accept strings that contain the substring "ab".
Use recursion or queue to explore multiple transitions.

Hint:
NFA transitions can lead to multiple states for the same input symbol.

Example Input/Output:
Input: aab
Output: Accepted
 
Input: bbaa
Output: Rejected

Screenshot: 
<img width="757" height="213" alt="image" src="https://github.com/user-attachments/assets/3ebf58d4-cc05-4fc0-92e3-731ee3d04869" />

