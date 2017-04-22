package practice_office;

public class OpeningDoor {

	public static void main(String[] args) {
    
		String str="geeks";
		System.out.println(palim(str,5));
	}
	
	public static int min(int a, int b)
	{   return a < b ? a : b;  }
	
   public static int palim(String str, int n)
	{
	    int l, h, gap;
	    int[][] table=new int[n][n];
	    for (gap = 1; gap < n; ++gap)
	        for (l = 0, h = gap; h < n; ++l, ++h)
	            table[l][h] = (str.charAt(l) == str.charAt(h))? table[l+1][h-1] :
	                          (min(table[l][h-1], table[l+1][h]) + 1);
	    return table[0][n-1];
	}
	 

}
