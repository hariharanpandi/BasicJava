package newFeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class FilePathGetting {
	private static Logger logger = Logger.getLogger(FilePathGetting.class.getName());

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("E:\\JavaProject\\newFeatures\\sample\\Example.txt");
		String file=Files.readString(path);
		logger.info(file);
	}
}
