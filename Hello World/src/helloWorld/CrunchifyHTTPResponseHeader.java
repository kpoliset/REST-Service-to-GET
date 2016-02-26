package helloWorld;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
 
/**
 * @author Crunchify.com
 */
 
public class CrunchifyHTTPResponseHeader {
 
    public static void main(String[] args) {
        try {
 
            URL obj = new URL("https://github.com/kpoliset/gitFooBarBaz/issues/1");
            URLConnection conn = obj.openConnection();
            
            
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            StringBuffer buffer = new StringBuffer();
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
                buffer.append(inputLine);
            in.close();
            System.out.println(buffer.toString());
            
    /*        Map<String, List<String>> map = conn.getHeaderFields();
 
            System.out.println("Printing All Response Header for URL: "
                    + obj.toString() + "\n");
 
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                for(int i=0;i<entry.getValue().size();i++){
                    System.out.println(entry.getValue().get(i));
                }
            }
 
            System.out.println("\nGet Response Header By Key ...\n");
            List<String> contentLength = map.get("Content-Type");
 
            if (contentLength == null) {
                System.out
                .println("'Content-Length' doesn't present in Header!");
            } else {
                for (String header : contentLength) {
                    System.out.println("Content-Lenght: " + header);
                }
            }
 
        */} catch (Exception e) {
            e.printStackTrace();
        }
    }
}
