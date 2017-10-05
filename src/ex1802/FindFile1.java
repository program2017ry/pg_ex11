package ex1802;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FindFile1 {
	public static void main(String[] args){
		if (args.length != 2) {
			System.out.println("使用法：Java FindFiles 検索文字列 検索対象ファイル");
			System.out.println("例：java FindFile1 System FindFile1.java");
			System.exit(0);
		}
		String findstring = args[0];
		String filename = args[1];
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();
			int linenum = 1;
			while(line != null){
				int n = line.indexOf(findstring);
				if (n >= 0) {
					System.out.println(linenum + ":" + line);
				}
				linenum++;
		}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(filename + "が見つかりません。");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
