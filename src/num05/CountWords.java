package num05;

import java.io.BufferedReader;
import java.io.FileReader;

public final class CountWords {
	private CountWords(){
		throw new AssertionError();
	}
	
	public static int countWords(String file, String word){
		int counter = 0;
		try(FileReader fr = new FileReader(file)){
			try(BufferedReader br = new BufferedReader(fr)){
				String line = null;
				while((line = br.readLine()) != null){
					int index = -1;
					while(line.length() >= word.length() && (index = line.indexOf(word)) >= 0){
						counter++;
						line = line.substring(index + word.length());
					}
				}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return counter;
	}
	public static void main(String[] args) {
		String file = "test.txt";
		String word = "abc";
		System.out.println(countWords(file, word));
	}
}	
