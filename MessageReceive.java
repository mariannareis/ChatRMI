import java.rmi.*;

public class MessageReceive
{
	public static void main(String[] args)
	{
		int ultima=1;
		ServerInterface x;
		Message msg;

		try {
			x = (ServerInterface) Naming.lookup("rmi://localhost/ChatServer");

			for(;;)
			{
				msg = x.receive(ultima);
				if(msg != null)
				{
					System.out.println(msg.getAuthor() + " disse: " +  msg.getContent() );
					ultima++;
				}
				Thread.sleep(1000);
			}

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

