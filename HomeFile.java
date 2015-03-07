/*
 * HouseFile Created by W.S.N.Perera
 */
package myclass;//change the package name


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;



public class HouseFile 
{
		
	public File file;
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
	//testing main function	
		
		HouseFile h = new HouseFile();
		//h.saveHouseDataFile("ABC");
		h.saveHouseDataFile("");
	}*/
	public boolean saveHouseDataFile(String data)
	{
		
		
		try 
		{
	       
    		FileWriter fdata = new FileWriter(file.getName(),true);
    	        BufferedWriter bufferWritter = new BufferedWriter(fdata);
    	        bufferWritter.write(data);//add new record to the text file
    	        bufferWritter.write("\n");//add new line after each record
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
