/*The tower of Hanoi is a famous puzzle where we have three rods and n disks.
The objective of the puzzle is to move the entire stack to another rod.
You are given the number of discs n.Initially, these discs are in the rod 1.
You need to print all the steps of discs movement so that all the discs reach the 3rd rod. Also, you need to find the total moves.
You only need to complete the function toh() that takes following parameters: n (number of discs), from (The rod number from which we move the disc),
to (The rod number to which we move the disc), aux (The rod that is used as an auxiliary rod)
and prints the required moves inside function body (See the example for the format of the output) as well as return the count of total moves made.

Note: The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered n. Also, all the discs have different sizes and a bigger disc cannot be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle.*/









public class Main {

    public long toh(int n, int from, int to, int aux) {
        if (n == 1) {
            // Print the move of the single disk
            System.out.println("move disk 1 from rod " + from + " to rod " + to);
            return 1; // Only one move is made
        }

        long moves = 0;

        // Move n-1 disks from 'from' rod to 'aux' rod using 'to' as auxiliary
        moves += toh(n - 1, from, aux, to);

        // Move the nth disk from 'from' rod to 'to' rod
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        moves += 1;

        // Move n-1 disks from 'aux' rod to 'to' rod using 'from' as auxiliary
        moves += toh(n - 1, aux, to, from);

        return moves;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int n = 2; // Example number of disks
        long totalMoves = main.toh(n, 1, 3, 2);
        System.out.println(totalMoves); // Print the total number of moves
    }
}