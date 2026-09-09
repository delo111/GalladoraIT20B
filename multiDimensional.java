/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package galladorait20b;

/**
 *
 * @author admin
 */
public class multiDimensional {
    public static void main(String[] args) {
        int numbers[][] = {
            {1,2,3},
            {3,2,1},
            {1,2,3},
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ,");
                
            }
            System.out.println();
        }
    }
    
}
