/*
 * HouseFile Created by W.S.N.Perera
 */
package myclass;//change the package name


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;


public class HouseFile 
{
		
	public File file;
	String path = "";
    boolean bool = false;

	//Class Constructor to create text file
	public HouseFile() throws IOException
	{
	
		 this.file = new File("housefile.txt");// create new text files
		 if(!file.exists())
		 {
 			bool = file.createNewFile();
			//create new text file if it does not exist
 		 }
         

		
	}
	
	/*public static void main(String[] args) throws IOException 
	{
	//testing main	
		
		HouseFile h = new HouseFile();
		//h.saveHouseDataFile("ABC");
		h.saveHouseDataFile("");
	}*/
	public boolean saveHouseDataFile(String data)
	{
		//FileOutputStream tfileOut;//create fileoutputstream
		
		try 
		{
	        /*tfileOut = new FileOutputStream(path);
			 ObjectOutputStream tobjout = new ObjectOutputStream(tfileOut);
			 tobjout.writeObject(data);
			 tobjout.writeObject("/n");
			 tobjout.close();
			 tfileOut.close();*/
			//true = append file
    		FileWriter fdata = new FileWriter(file.getName(),true);
    	    BufferedWriter bufferWritter = new BufferedWriter(fdata);
    	    bufferWritter.write(data);
    	    bufferWritter.write("\n");
    	    bufferWritter.close();
 
	        
			
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
