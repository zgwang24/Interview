package num07;

import java.io.File;

public class OpenDirs {
	public static void main(String[] args) {
		File f = new File("D:/360Downloads");
		for(File temp : f.listFiles()){
			if(temp.isDirectory()){
				System.out.println(temp.getName());
			}
		}
	}
}
