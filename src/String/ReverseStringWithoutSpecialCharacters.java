package String;

public class ReverseStringWithoutSpecialCharacters {

public static void main(String[] args) {
	String str = "Hel@lo G@oo#d Mo_rni*ng";  //gni@nr o@Md#o @oG_oll*eH

	int lastIndex=str.length();
	char []arr=str.toCharArray();
	for(int i=0;i<arr.length/2;i++)
	{
			if(arr[i]!='#'&& arr[i]!='*'&&arr[i]!='_'&&arr[i]!='@'&&arr[i]!='$'&&arr[i]!=' ')
			{
				if(arr[lastIndex]!='#'&& arr[lastIndex]!='*'&&arr[lastIndex]!='_'&&arr[lastIndex]!='@'&&arr[lastIndex]!='$'&&arr[lastIndex]!=' ')
				{
					char ch=arr[i];
					arr[i]=arr[lastIndex];
					arr[lastIndex]=ch;
				}
				lastIndex--;	
			}		
	}	
}
}

