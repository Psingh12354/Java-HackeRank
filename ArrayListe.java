/* Run on Online compiler*/
import java.lang.String;
import java.io.*; 
import java.util.*;
class ArrayListe {
    public static void main(String[] args) 
    { 
        int n = 5; 
        ArrayList<Integer> arrli 
            = new ArrayList<Integer>(n); 
        for (int i = 1; i <= n; i++) 
            arrli.add(i); 
        System.out.println(arrli); 
        arrli.remove(3); 
        System.out.println(arrli); 
        for (int i = 0; i < arrli.size(); i++) 
            System.out.print(arrli.get(i) + " "); 

}
