package ProxyDesignPattern;
import java.io.IOException;


//INTERFACE COMMAND EXECUTOR
interface CommandExecutor 
{
	public void runCommand(String cmd) throws IOException, Exception;
}


//CLASS COMMAND EXECUTOR IMPLEMENTATION
class CommandExecutorImplementation implements CommandExecutor
{
	@Override
	public void runCommand(String cmd) throws IOException
	{
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}
}


//COMMAND EXECUTOR PROXY 
class CommandExecutorProxy implements CommandExecutor 
{
	private boolean isAdmin;
	private CommandExecutor executor;
	
	//CONSTRUCTOR
	public CommandExecutorProxy(String userName, String password)
	{
		if("Prathamesh".equals(userName) && "admin123".equals(password)) isAdmin = true;
		executor = new CommandExecutorImplementation();
	} 
	
	@Override
	public void runCommand(String cmd) throws Exception 
	{
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}
		else
		{
			if(cmd.trim().startsWith("rm"))
			{
				throw new Exception("rm command is not allowed for non-admin users.");
			}
			else
			{
				executor.runCommand(cmd);
			}
		}
	}
}


//PROXY PATTERN TEST
class ProxyDesignPattern 
{
	public static void main(String[] args)
	{
		CommandExecutor executor = new CommandExecutorProxy("Prathamesh", "adminSSS");
		try 
		{
			executor.runCommand("ls -a");
			executor.runCommand("   rm abc.pdf");
		}
		catch (Exception e) 
		{
			System.out.println("Exception Message : "+e.getMessage());
		}		
	}
}


