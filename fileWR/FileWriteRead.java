package fileWR;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileWriteRead
{
	protected File file;
	protected FileWriter fout;
	protected FileReader inFile;
	protected BufferedReader inBuffer;
	
	public void writeFile(String s)
	{
		try
		{
			file=new File("E:/AIUB/Project/Project/fileWR/DataBase.txt");
			file.createNewFile();
			fout=new FileWriter(file,true);
			//fout=new FileWriter("DataBase.txt",true);
			fout.write(s+"\n");
				
			fout.close();	
		}
		catch(FileNotFoundException e1)
		{
			e1.printStackTrace(); 			//printStackTrace() method is Java’s throwable class 
		}       							//which prints the line number and class name where the exception occurred.
		catch(IOException e2)
		{
			System.out.println("Exception : "+e2);
		}
	}
	
	public void readFile()
	{
		try
		{
			//inFile=new FileReader("DataBase.txt");
			inFile=new FileReader(file);
			inBuffer=new BufferedReader(inFile);
			String S="",temp;
			while((temp=inBuffer.readLine())!=null)
			{
				S=S+temp+"\n";
			}
			System.out.println(S);
			inFile.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
