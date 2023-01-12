import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/netInfo")
public class NetInfo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");

        PrintWriter writer = response.getWriter();
        writer.print("<html><head><title>Request 정보 출력</title></head>");
        writer.print("<body><h3>네트워크 관련 요청 정보</h3>");
        writer.print("Request Scheme : " + request.getScheme() + "<br>");
        writer.print("Server Name : " + request.getServerName() + "<br>");
        writer.print("Server Address : " + request.getLocalAddr() + "<br>");
        writer.print("Server Port : " + request.getServerPort() + "<br>");
        writer.print("Client Address : " + request.getRemoteAddr() + "<br>");
        writer.print("Client Host : " + request.getRemoteHost() + "<br>");
        writer.print("Client Port : " + request.getRemotePort() + "<br>");
        writer.print("</body></html>");
        writer.close();
    }
}
