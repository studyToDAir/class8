package kr.or.human.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import kr.or.human.dto.EmpDTO;

public class EmpView {

	public void viewEmp(List<EmpDTO> list, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();
			out.println("<table border='1'>"); 
			out.println("    <tr>");
			out.println("        <th>empno</th>");
			out.println("        <th>ename</th>");
			out.println("        <th>hiredate</th>");
			out.println("    </tr>");
			
			for(int i=0; i<list.size(); i++) {
				EmpDTO dto = list.get(i);
				out.println("    <tr>");
				out.println("        <td>"+ dto.getEmpno() +"</td>");
				out.println("        <td>"+ dto.getEname() +"</td>");
				out.println("        <td>"+ dto.getHiredate() +"</td>");
				out.println("    </tr>");
			}
			out.println("</table>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
