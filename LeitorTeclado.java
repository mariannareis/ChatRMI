import java.io.*;
public class KeyboardReader
{
	BufferedReader buffer;

	public KeyboardReader()
	{
		buffer = new BufferedReader(new InputStreamReader(System.in));
	}

	public String leString()
	{
		String str=null;
		try{ str=buffer.readLine(); }
		catch(Exception e) {}
		return str;
	}

	public int leInteiro()
	{
		String str= this.leString();
		return Integer.parseInt(str);
	}

	public float leFloat()
	{
		String str= this.leString();
		return Float.parseFloat(str);
	}
}

