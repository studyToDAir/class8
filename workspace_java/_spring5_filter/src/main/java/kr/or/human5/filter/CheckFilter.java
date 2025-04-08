package kr.or.human5.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.human5.dto.MemberDTO;

@WebFilter("/*")
public class CheckFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		long before = System.currentTimeMillis();
		
		// utf-8 세팅
		request.setCharacterEncoding("utf-8");
		// 내보낼때 무조건 html로 안하는게 좋아서 주석
//		response.setContentType("text/html; charset=utf-8;");
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		String servletPath = req.getServletPath();
		System.out.println("servletPath : "+ servletPath);
		
		if(	isExclude(servletPath) ) {
			System.out.println("세션 없이 진행");
			
			// 기존 흐름대로 이어가시게
			chain.doFilter(request, response);
		} else {
			HttpSession session = req.getSession();
			MemberDTO memberDTO = (MemberDTO)session.getAttribute("dto");
			
			if(memberDTO != null) {
				System.out.println("로그인 되어 있어서 통과!");
				chain.doFilter(request, response);
			} else {
				System.out.println("로그인 필수");
				resp.sendRedirect(req.getContextPath() + "/login");
			}
		}
		
		System.out.println("doFilter 실행 후");
		long after = System.currentTimeMillis();
		System.out.println("걸린시간 : "+ (after - before));
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	// 무조건 통과 시켜야 하나?
	private boolean isExclude(String servletPath) {
		if(		"/login".equals(servletPath)
			|| 	"/loginCheck".equals(servletPath)
			
			|| 	servletPath.indexOf("/resources/") != -1
			|| 	servletPath.startsWith("/resources/")
		) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}
	
	
}
