package Day12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReverseFileContent {

	public static void main(String[] args) {
        
        try
        {
        
        	FileReader reader = new FileReader("input.txt");
        	FileWriter writer = new FileWriter("output.txt");
        	StringBuffer content = new StringBuffer();
        	
        	int ch;
        	while((ch = reader.read())!=-1)
        	{
        		content.append((char)ch);
        	}
        	
        	System.out.println("Original:"+content);
        	StringBuffer reversed = new StringBuffer();
        	
        	for(int i = content.length()-1 ;i>=0;i--)
        	{
        		reversed.append(content.charAt(i));
        	}
        	System.out.println("Reversed:"+reversed);
        	
        	writer.write(reversed.toString());
        	
        	reader.close();
        	writer.close();
        }
        catch(IOException e)
        {
        	System.out.println(e.getMessage());
        }
	}
}