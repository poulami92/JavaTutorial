package JavaBasics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(String[] args) throws IOException {

      Path source = Path.of("C:\\Users\\MSUSERSL123\\eclipse-workspace\\JavaTutorials\\Info.txt");
      Path dest = Path.of("C:\\Users\\MSUSERSL123\\eclipse-workspace\\JavaTutorials\\Info_copy.txt");
      
      Files.copy(source, dest,StandardCopyOption.REPLACE_EXISTING);      

	}

}
