import java.util.Arrays;

/*
* Author : Isabelle
*Date : 10-Dec-2020 
*Objectif de ce programme est de trouver le plus grand nombre d'un tableau. 
*Après avoir trouvé ce nombre, le programme supprimera la valeur de la séquence, 
*tout en conservant la même quantité de valeurs dans le tableau.
*/

public class tableau_amputé_du_plus_grand_nombre_Isabelle 
{

	public static int nombrepeitit(int[] s, int total) 
		{  
			int n;  
			for (int i = 0; i < total; i++) 
			{  
				
				for (int j = i + 1; j < total; j++) 
				{  
					
					if (s[i] < s[j]) 
					{  
						n = s[i];    
						s[i] = s[j];  	
						s[j] = n;     
					}  
				}  
			}	
			
			return s[0];  
	}
	
	public static void main(String args[])
		{  
	
	int coolerArray[]; 
	int []s= {12,45,33,11};	
	
	coolerArray = Arrays.stream(s).filter(d -> d != nombrepeitit(s,4)).toArray();
	System.out.println(Arrays.toString(coolerArray));
		
	}
}  