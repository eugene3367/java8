package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception6 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않아 파일을 열 수 없음");
			e.printStackTrace();
		}

	}

}
