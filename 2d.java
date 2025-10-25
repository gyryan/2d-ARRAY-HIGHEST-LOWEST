import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter The Row of the Array: ");
        int row = scanner.nextInt();
        
        System.out.print("Enter The Column of the Array: ");
        int col = scanner.nextInt();
        
        int ray[][] = new int[row][col];
        
        System.out.println("Enter Your Value");
        for (int i = 0; i< row; i++) 
        {
         for (int j = 0; j<col; j++) {
            System.out.print("INDEX [" + i + "] " + "[" + j + "] : "  );
            ray[i][j] = scanner.nextInt();
        } 
      }
      int highest = ray[0][0];
      int lowest = ray[0][0];
      
      
      for (int i = 0; i< row; i++) 
        {
         for (int j = 0; j<col; j++) {
             if (ray[i][j] > highest) {
                 highest = ray[i][j];
             } if (ray[i][j] < lowest) {
                 lowest = ray[i][j];
             }
         }
        } 
         
       for (int i = 0; i< row; i++) 
        {
         for (int j = 0; j<col; j++) {
             System.out.print(ray[i][j] + " ");
         }    
            System.out.println();
        }
            System.out.println("Highest Value: " + highest);
            System.out.println("Lowest Value : " + lowest);
        
            scanner.close();
    }
}
