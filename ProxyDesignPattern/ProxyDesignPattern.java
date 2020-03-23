package ProxyDesignPattern;
import java.io.IOException;

//INTERFACE COMMAND EXECUTOR
interface CommandExecutor 
{
	public void runCommand(String cmd) throws IOException;
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


//CLASS PROXY DESIGN PATTERN
public class ProxyDesignPattern
{
	public static void main(String[] args) throws IOException 
	{
		CommandExecutorImplementation commandExecutorImplementationObject =  new CommandExecutorImplementation();
		commandExecutorImplementationObject.runCommand("cmd");
		commandExecutorImplementationObject.runCommand("cmd cd");
	}
}
