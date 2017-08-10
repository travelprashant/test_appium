package practice_office;

public class NoofZero {

	public static void main(String[] args) {
		int num=0;
		int start =1;
		int end =10000;
		int count =0;
		
		for(int i=start;i<=end;i++){
			int temp=i;
			while(temp>0){
				int n=temp%10;
				if(n==num){
					count++;
				}
				temp=temp/10;
			}
		}
		
		System.out.println(count);

	}

}
