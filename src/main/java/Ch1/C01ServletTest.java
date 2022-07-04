package Ch1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Servlet1.do") //mapping 매핑
public class C01ServletTest  extends HttpServlet{

	
	@Override
	public void init() throws ServletException {
	    System.out.println("init함수 호출");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("service함수 호출");
		
		 
		
		 
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		 System.out.println("destroy함수 호출");
	}

	
}
