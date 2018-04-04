import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadSolrLogFile 
{
	
	public static void main(String []a) 
	{
		try {
		/*	Files.lines(new File("D:\\solr-7.0.0\\example\\techproducts\\logs\\solr.log").toPath())
		    .map(s -> s.trim())
		 .filter(s -> !s.isEmpty())
		 .forEach(System.out::println);*/
			
			/*File file = new File("D:\\solr-7.0.0\\example\\techproducts\\logs\\solr.log");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());*/
			
			BufferedReader reader = new BufferedReader(new FileReader(
					"D:/solr-7.0.0/example/techproducts/logs/solr.log"));
			String line = reader.readLine();
			while (line != null) {
				
				if(line.contains("params={q="))
				{
					System.out.println(line);
					
					//Pattern pattern = Pattern.compile("\\{q=(.*?)\\}");
					
					Pattern pattern = Pattern.compile(":\"(.*?)\"");
					
					Matcher matcher = pattern.matcher(line);
					while (matcher.find()) {
					    System.out.println(matcher.group(1));
					}
					
				}
				
				
				
				
				// read next line
				line = reader.readLine();
			}
			reader.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
