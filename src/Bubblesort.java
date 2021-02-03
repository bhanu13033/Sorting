//E19CSE307 Bhanu Prakash EB08
public class Bubblesort 
{

	static void bsort(int[] A,int n)
	{  
        
        int v = 0;  
         for(int a=0; a < n; a++)
         {  
                 for(int o=1; o < (n-a); o++)
                 {  
                          if(A[o-1] > A[o]){ v = A[o-1]; A[o-1] = A[o];A[o] = v;}        
                 }  
         }  
  
	    }  
    public static void main(String[] args)
    {  
                int Tup[] ={23,19,56,53,98,67,45,999}; 
                System.out.println("Before Bubble Sort");  
                for(int i=0; i < Tup.length; i++) System.out.print(Tup[i] + " ");
                System.out.println(); 
                int sz=Tup.length;
                bsort(Tup,sz);
                System.out.println("After Bubble Sort");  
                for(int i=0; i < Tup.length; i++)System.out.print(Tup[i] + " ");
    }  

}
