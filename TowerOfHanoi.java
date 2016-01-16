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
        
        for(int i = n; i >= 0; i--){
            
            int arrayIndex = (n - i);            
            if (arrayIndex == n){
                return;
            }
            else{
                source[arrayIndex] = i;
            }
           
        }
        
        
        T(source, t);
        int[] target;
        int[] helper;
        
    }
    
    public static void T(int n[], int r) {
        System.out.println(n);
    }

    
}