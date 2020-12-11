import java.util.Scanner;

/*
* Author : Isabelle
*Date : 10-Dec-2020 
*l'Objectif de ce programme est de demander à l'utilisateur un numéro. 
*Une fois le numéro est reçu, le programme analysera sa table pour voir s'il a le même numéro.
* Si le tableau a le même numéro que celui donné, il répondra en disant "__ est dans le tableau".
* Mais si le numéro n'est pas dans le tableau, il répondra en disant "__ n'est pas dans le tableau".
*/
public class tester_un_element_donner_Isabelle
	{

		public static void main(String[] args)
			{	
						Scanner sc = new Scanner(System.in);
						int[] a = {12, 14, 65, 55, 39, 15 };


System.out.println("Nombre?");
				int nombre = sc.nextInt();
			int nd = nombre;
			boolean f = false;

			for (int n : a) 
			{
			if (n == nd) 
			{
			f = true;
			break;
						}
						}
		if(f)
System.out.println(nd + " est dans le tableau.");
		else
System.out.println(nd + " n'est pas dans le tableau.");
				}
		}