import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
 
public class WebReader {
 
    public static String readWebPage(String pageURL, boolean lineSeparatorOn) {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
       
        try {
            URL url = new URL(pageURL);
            br = new BufferedReader(new InputStreamReader(url.openStream()));
 
            String line;
           
 
            while ((line = br.readLine()) != null) {
                sb.append(line);
                if (lineSeparatorOn)
                    sb.append(System.lineSeparator());
            }
         
        }
        catch(Exception e) {
            System.out.println("Error!!! " + e);
            return(null);
        }
        finally {
            if (br != null) {
               try{
                   br.close();
               }catch(Exception e) {
                   System.out.println("Error closing connection");
               }
            }  
            return(sb.toString() ) ;
        }  
       
       
    }
   
   
    public static void main(String[] args) throws MalformedURLException, IOException {
        //read page with line separators at end of lines (the 'true' argument)
        String url="http://google.com";
        String s=WebReader.readWebPage(url,true);
        System.out.println(s);
       
    }
   
 
 
    public static int findFirstTag(String s){
        return(s.indexOf("<"));
    }
    public static String removeFirstTag(String s){
        int tagStartPosition = findFirstTag(s);
        int tagEndPosition = s.indexOf(">");
        String newString = s.substring(0,tagStartPosition) + s.substring(tagEndPosition);
        if (tagStartPosition == -1){
            return(s);
        }
        return("newString");
    }
    public static String removeAllTags(String s){
        while(findFirstTag(s)>0){
            s = removeFirstTag(s);
        }return(s);
    }
   
 
}