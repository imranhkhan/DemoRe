import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;




public class Temp {
   public static void main(String... s)throws MalformedURLException {
	   try{
	 URL url = new URL("http://httpd.apache.org/lists.html#http-announce");
	 InputStream in = url.openStream();
	 BufferedReader br = new BufferedReader(new InputStreamReader(in));
	 BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\imrank\\Desktop\\Work\\page.html")));
	 String fragment="";
	 while((fragment=br.readLine())!=null){
		 fragment = fragment+"\n";
		 bw.write(fragment);
	 }
	 bw.flush();
	 bw.close();
	 br.close();
	   }catch (IOException e) {
		System.out.println("An error occured while reading page "+e.getMessage());
	}
   }
}
