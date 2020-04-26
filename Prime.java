import java.util.Arrays;
public class Prime
{
	public static void main(String[] args)
	{
		int arr[]={2,3,5,7,11,13,17,19};
		
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=8;j>1;j--)
			{
				if(arr[i]%j==0)
				{
					c=1;
					break;
				}
			}
			if(c==0&&i%2!=0)
			{
				
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}