package Ch1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/MemberJoin.do")
public class C04Prac extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		  // 파라미터 받기
				String userid = req.getParameter("userid");
				String Email = req.getParameter("Email");
				String addr1 = req.getParameter("addr1");
				String addr2 = req.getParameter("addr2");
				
				//헤더 추가
				req.setCharacterEncoding("UTF-8");
				resp.setContentType("text/html; charset=UTF-8");
				
				
				//브라우저로 보낼 out객체 꺼내기
				PrintWriter out = resp.getWriter();
				
				//브라우저로 Code 전송
				out.println("USERID :" + userid+"<br>");
				out.println("Email :" + Email+"<br>");
				out.println("addr1 :" + addr1+"<br>");
				out.println("addr2 :" + addr2+"<br>");
		
		
		
		
	}

	//서블릿 파일 만들기 (URL: /MemberJoin.do)o
	//dopost 함수 오버라이딩 하기o
	// Form으로 부터 요청이 들어오면 해당 파라미터를 브라우저로 전송합니다.
	// form 에서 전송하는 내용은 userid, email, addr1 ,addr2 입니다.
	// 03form.jsp를 만들어서 진행합니다.
	
	
	
	
	
	
	
}
