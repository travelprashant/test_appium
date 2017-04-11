package practice_office;

import java.util.ArrayList;

public class TechGig {

	public static void main(String[] args) {
		System.out.println(appearanceCount(4, 11, "cAda", "AbrAcadAbRa"));

	}
	
	static int count=0;
	
	public static int appearanceCount(int ip1,int ip2,String ip3,String ip4){
		permute(ip3,0,ip1-1,ip4);
		return count;
	}
	
	public static void permute(String str, int l, int r,String str2)
    {
        if (l == r){
        	if(str2.contains(str)){
             count++;
            }
        }
            
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r,str2);
                str = swap(str,l,i);
            }
        }
        
    }
	
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
