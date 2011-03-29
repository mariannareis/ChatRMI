import java.io.*;
public class KeyboardReader
{
	BufferedReader buffer;

	public KeyboardReader()
	{
		buffer = new BufferedReader(new InputStreamReader(System.in));
	}

	public String readString()
	{
		String str=null;
		try{ str=buffer.readLine(); }
		catch(Exception e) {}
		return str;
	}
}

