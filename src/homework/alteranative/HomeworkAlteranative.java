
package homework.alteranative;

import java.util.Scanner;

public class HomeworkAlteranative {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("How many letters to you want to type in?");
        int l = 0;
        int t = input.nextInt(); //number of letters
        int n [] = new int[124]; //measures number of the same letter
        for(int i = 0; i < t ; i++){
        System.out.println("Input Letter " + (i+1));
        int u = input.next().charAt(0); //temporary part for using array "n"
  //      System.out.println(u);
        for(l = 96; l < 122; l++){
            if(u == l){
                n [l] = n [l] + 1;
              //  System.out.println(n[l]);
            }
    } 
    }
        for(int e = 97; e < 123; e++){
            char a = (char) e;
            int x = n[e];
            System.out.print(a + "" + x + " ");
        }
    
}
}