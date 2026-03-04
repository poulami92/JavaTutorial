package JavaBasics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCreate {

	public static void main(String[] args) throws IOException {

      Path dest = Path.of("C:\\Users\\MSUSERSL123\\eclipse-workspace\\JavaTutorials\\newFile.txt");
      
      Files.writeString(dest, "This is a new file");

	}

}
