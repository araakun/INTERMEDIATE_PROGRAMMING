import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter ("C:\\Users\\adlac\\eclipse-workspace\\Gloomy_Thursday\\MyFile.txt");
			writer.write("Angelique");
			writer.write("\r \n"); //writers a new line
			writer.write("File Writer and Reader Combined");
			writer.close();
			
			FileReader reader = new FileReader("C:\\Users\\adlac\\eclipse-workspace\\Gloomy_Thursday\\MyFile.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				System.out.print(line);
			}
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
