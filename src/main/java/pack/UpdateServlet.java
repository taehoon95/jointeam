package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateServlet() {
    	System.out.println("수정 생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("수정 두갯");
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		out.println(
				
				"<html>"+
						"<body>"+
							"<h1>"+id+"수정 되었습니다..</h1>"+
						"</body>"+
				"</html>"
		);
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("수정 포스트");
	}

}
