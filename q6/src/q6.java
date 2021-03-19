import java.util.Arrays;

import javax.swing.JOptionPane;

public class q6 {
    public static void main(String[] args) throws Exception {
        String n1;
        int num1;
        int v1[] = new int[10];
        int v2[] = new int[10];

        for (int i=0 ; i<10 ; i++){         
            n1 = JOptionPane.showInputDialog("Numero : ");
            num1 = Integer.parseInt(n1);
            v1[i] = num1;
            v2[i] = num1;
        }

        Arrays.sort(v2);  

        System.out.print("Ordem digitada:    "); 
       	  for (int j = 0; j < v1.length; j++) 
       	  {
       		System.out.print(v1[j]+ "  ");       		
		  }

        System.out.print("Ordem crescente:    "); 
       	  for (int j = 0; j < v2.length; j++) 
       	  {
       		System.out.print(v2[j]+ "  ");       		
		  }


    }
}
