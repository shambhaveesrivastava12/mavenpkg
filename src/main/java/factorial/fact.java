package factorial;


public class fact {
	public int number(int n) {
	int f=1;
	
	for(int i=1; i<=n; i++)
	{
		f=f*i;
	}
	
	return f;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fact obj = new fact();
System.out.println(obj.number(7));
	}

}
