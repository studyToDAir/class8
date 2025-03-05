package download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class FileDownload extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = request.getParameter("filename");
		String path = "C:\\temp\\upload";
		File file = new File(path +"\\"+ fileName);
		
		// 브라우저 캐시를 사용하지 않도록 설정
		response.setHeader("Cache-Control", "no-cache");
		// 지금 응답이 첨부파일이라는 것
		// 그리고 그 파일 이름이 뭐 라는 것
		response.addHeader("Content-disposition", "attachment; fileName="+ fileName);
		
		// 파일 읽기
		FileInputStream fis = new FileInputStream(file);
		// 메모리로 퍼 올릴 바가지 크기 설정
		byte[] buf = new byte[1024 * 1]; // 보통은 8kB
		
		OutputStream os = response.getOutputStream();
		
		int count = -1;
		// 바가지 크기 만큼 읽음
		// 읽을게 없으면 -1
		while(  (count = fis.read(buf)) != -1  ) {
			// 브라우저로 내보냄
			// 0 : 건너뛰 byte 수
			// count : 보낼 byte 수
			os.write(buf, 0, count);
		}
		os.flush();
		os.close();
		fis.close();
		
	}
}







