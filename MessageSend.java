import java.rmi.*;

class MessageSend
{
	public static void main(String[] args)
	{
		ServerInterface x;

		try
	    {
		    KeyboardReader author = new KeyboardReader();
		    KeyboardReader message = new KeyboardReader();
            Message msg;

		    x = (ServerInterface) Naming.lookup("rmi://localhost/ChatServer");
		    System.out.println("Autor: ");
		    String this_author = author.readString();

		    for(;;)
		    {
			    System.out.println("Digite a mensagem ou fim para sair");
			    msg = new Message(this_author, message.readString());
	        	x.send(msg);

	        	if (msg.getContent().equalsIgnoreCase("fim"))
	        	{
	        	  break;
	        	}
		    }

	    }

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

