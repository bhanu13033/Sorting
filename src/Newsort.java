//E19CSE307 Bhanu Prakash EB08
public class Newsort {

	public static void ssort(int[] A,int sz)
	{  
        for (int i = 0; i <sz - 1; i++)  
        {  
            int Y = i;  
            for (int j = i + 1; j < sz; j++){ if (A[j] < A[Y])Y = j;} 
            int t = A[Y];   
            A[Y] = A[i];  
            A[i] = t;  
        }  
    }  
    public static void main(String a[])
    {  
        int[] A1 = {23,19,56,53,98,67,45,999};  
        System.out.println("before selection sort");  
        for(int h:A1)System.out.print(h+" "); 
        System.out.println(); 
        int sz=A1.length;
        ssort(A1,sz); 
        System.out.println("after selection sort");  
        for(int h:A1) System.out.print(h+" ");   
    }  

}
