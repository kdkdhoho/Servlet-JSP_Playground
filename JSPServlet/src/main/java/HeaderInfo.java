import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/headerInfo")
public class HeaderInfo extends HttpServlet {

    /**
     * request.getHeaderNames()를 통한 Enumeration 활용 예시
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.print("<html><body><h3>요청 헤더 정보</h3>");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            writer.print(headerName + " : " + request.getHeader(headerName) + "<br>");
        }
        writer.print("</body></html>");
        writer.close();
    }
}
