package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {

	public static void main(String[] args) {
		
		String path = "c:\\temp";
		String fileName = "test.txt";
		
//		OutputStream os2 = new FileOutputStream(path +"\\"+ fileName);
		OutputStream os = null;
		try {
			// 스트림 열기
			os = new FileOutputStream(path +System.getProperty("file.separator")+ fileName);
			
			String data = "abc\n한글\n123";
			byte[] datas = data.getBytes();
			
			// 쓰기
			os.write(datas, 0, datas.length);
			// 버퍼에 남은 데이터 모두 출력
			os.flush();
			
			// 닫기는 finally에서 처리
//			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// try-with-resources
		try(
			OutputStream os3 = new FileOutputStream(path +"\\"+ fileName);
		){
			
			String data = "abc\n한글\n123213423434";
			byte[] datas = data.getBytes();
			
			// 쓰기
//			os.write(datas, 0, datas.length);
			os3.write(datas, 2, 10);
			os3.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}











