package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register") 
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
        super();
        System.out.println("회원가입완료 ");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		System.out.println(id);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
			out.println("<body>");
				out.println("<h1>" + id + "님 회원가입완료되었습니다</h1>");	
			out.println("</body>");
		out.println("</html>");
		out.close();
	}  

}