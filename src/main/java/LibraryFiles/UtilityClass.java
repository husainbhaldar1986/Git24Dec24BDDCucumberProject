package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass 
{
	
	public static String getPFData(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\main\\java\\LibraryFiles\\PropertyFiles.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
	}

}
