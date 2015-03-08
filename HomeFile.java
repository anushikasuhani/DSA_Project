/*
 * HouseFile Created by W.S.N.Perera
 */
//package myclass;//change the package name


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class HouseFile 
{
		
	public File file;
	boolean bool = false;

	//Class Constructor to create text file
	public HouseFile() throws IOException
	{
	
		 this.file = new File("housefile.txt");// create new text files
	}
	

	public boolean saveHouseDataFile(Object data) throws IOException
	{
		FileOutputStream tfileOut;//create fileoutputstream
		
		
		try 
		{
	       
    		tfileOut = new FileOutputStream(file.getAbsolutePath(),true);
			 ObjectOutputStream tobjout = new ObjectOutputStream(tfileOut);
			 tobjout.writeObject(data);
			 tobjout.writeObject("\n");
			 tobjout.close();
			 tfileOut.close();
		
 
	        
			
		} 
		catch (FileNotFoundException ex) 
		{
			
			ex.printStackTrace();
			
		}
		catch(IOException ex)
		{
			
			ex.printStackTrace();
		}
		return false;
		
		}
	
	
	

}
