package pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
        System.out.println("생성자 call");
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("doGet");
	   response.setContentType("text/html;Charset=UTF-8");
	   request.setCharacterEncoding("euc-kr");
	   String id=request.getParameter("id");
	   System.out.println(id);
	   
	   PrintWriter out=response.getWriter();
	   out.println("<html>");
	   out.println("<body>");
	   out.println("<h1>"+id+" 삭제됨"+"<h1>");
	   
	   out.println("</body>");
	   out.println("</html>");
	   out.close();
    
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   System.out.println("doPost");
   }
}