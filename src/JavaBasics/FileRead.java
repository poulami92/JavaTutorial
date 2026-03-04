package JavaBasics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FileRead {

	public static void main(String[] args) throws IOException {

      Path source = Path.of("C:\\Users\\MSUSERSL123\\eclipse-workspace\\JavaTutorials\\Info.txt");
      
      List<String> lines=Files.readAllLines(source); 
      
      for(String line:lines)
      {
    	  System.out.println(line);
      }

	}

}
