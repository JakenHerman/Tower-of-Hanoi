import java.util.*;

public class TowerOfHanoi {
    
    public static void main(String[] args){
        
        System.out.print("Tower of Hanoi Terminal Representation with a given N disks, and a given T pegs.");
        System.out.println("");
        System.out.println("How many disks are on the starting peg? ");
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.println("How many pegs are there on the gameboard? ");
        int t = scan.nextInt(); 
        
        int[] source = new int[n]; //populate the array in the for-loop
        
        for(int i = n; i >= n; i--){
            for(int j = 0; j <= n; j++){
                source[j] = i;   
            }
        }
        
        T(source, 5);
        int[] target;
        int[] helper;
        
    }
    
    public static void T(int n[], int r) {
        System.out.println(n);
    }
    
}