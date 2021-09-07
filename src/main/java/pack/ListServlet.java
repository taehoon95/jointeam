package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ListServlet() {
		System.out.println("리스트 생성자 콜");
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("list doget");
		response.setContentType("text/html; charset=UTF-8;"); // �븳湲� �꽕�젙
		String[] id = new String[] { "jinwoo", "taehoon", "ryeongeun", "songhwa" };

		PrintWriter pw = response.getWriter();// �슂泥�
		pw.println("<div>");
		pw.println("<table border='1' width='1200'>");
		pw.println("<tr>");
		pw.println("<td>이름</td>");
		pw.println("<td>삭제</td>");
		pw.println("<td>수정</td>");
		pw.println("</tr>");

		for (int i = 0; i < id.length; i++) {

			pw.println("<tr>");
			pw.println("<td>" + id[i] + "</td>");
			pw.println("<td><a href='delete?id=" + id[i] + "'>삭제</a></td>");
			pw.println("<td><a href='update?id=" + id[i] + "'>수정</a></td>");
			pw.println("</tr>");

			
		}

		pw.println("</table>");

		pw.println("</div>");

		pw.println("<a href='index.html'>메인 페이지로 이동</a>");

		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("list dopost");
	}

}
