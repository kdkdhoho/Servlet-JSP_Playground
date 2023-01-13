import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest")
public class QueryTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.print("<html><head><title>Query 문자열 테스트</title></head>");
        writer.print("<body><h1>GET 방식으로 요청되었습니다.</h1>");
        writer.print("이름 : " + req.getParameter("name"));
        writer.print("</body></html>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        ServletInputStream inputStream = req.getInputStream();
        int contentLength = req.getContentLength();
        byte[] buf = new byte[contentLength];
        inputStream.read(buf, 0, contentLength);
        String data = new String(buf);

        PrintWriter writer = resp.getWriter();
        writer.print("<html><head><title>Query 문자열 테스트</title></head>");
        writer.print("<body><h1>POST 방식으로 요청되었습니다.</h1>");
        writer.print("요청정보 data : " + data);
        writer.print("</body></html>");
        writer.close();
    }
}
