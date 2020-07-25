package tdd.junit;

public class RemoveCharacters {
	public String modified(String s)
	{
		String st=s;
			if((s.substring(0,2).equals("AA")))
			{
				st=s.replaceFirst("AA","");
			}
			else
			{
				if((s.substring(0,1).equals("A")) || (s.substring(1,2).equals("A")))
				{
					st=s.replaceFirst("A","");
				}
				
		     }
			return st;
	}

}
