import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/urlInfo")
public class URLInfo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.print("<html><head><title>Request 정보 출력</title></head>");
        writer.print("<body><h3>요청 방식과 프로토콜 정보</h3>");
        writer.print("Request URI : " + request.getRequestURI() + "<br>");
        writer.print("Request URL : " + request.getRequestURL() + "<br>");
        writer.print("Context Path : " + request.getContextPath() + "<br>");
        writer.print("Request Protocol : " + request.getProtocol() + "<br>");
        writer.print("Servlet Path : " + request.getServletPath() + "<br>");
        writer.print("</body></html>");
        writer.close();
    }
}
