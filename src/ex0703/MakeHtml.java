package ex0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeHtml {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("<!DOCTYPE html>" + "\n" + "<html>" + "\n" + "<head>" + "\n" + "<title>My Page</title>" + "\n" + "</head>" + "\n" + "<body>");
		try{
			String line = reader.readLine();
			while (line != null){
				if (line.startsWith("■")){
					System.out.println("<h1>" + line + "</h1>");
				} else if(line.startsWith("●")){
					System.out.println("<h2>" + line + "</h2>");
				} else {
					System.out.println("<p>" + line + "</p>");
				}
				line = reader.readLine();
			}
		} catch(IOException e){
			System.out.println(e);
		}
		System.out.print("</body>" + "\n" + "</html>");


	}

}
