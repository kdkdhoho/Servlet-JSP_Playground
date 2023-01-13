import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest2")
public class QueryTest2 extends HttpServlet {

    /**
     * html 페이지에서 charset을 설정한다.
     * 그러면 해당 인코딩 방법으로 인코딩되어 쿼리문에 그대로 포함되어 서버로 넘어온다.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.print("<html><head><title>Query 문자열 테스트</title></head>");
        writer.print("<body>");
        writer.print("<h1>GET 방식으로 요청되었습니다.</h1>");

        writer.print("이름 : " + req.getParameter("name"));

        writer.print("</body></html>");
        writer.close();
    }

    /**
     * 브라우저에서 사용하는 인코딩과 서버에서 사용하는 인코딩이 다를 수 있다.
     * 한글의 경우 글자가 깨진다.
     * 이때, `setCharaterEncoding(String env)` 메서드를 통해 브라우저에서 넘어온 글자의 인코딩을 설정할 수 있다.
     * 요청정보(request)의 body에 있는 문자열들을 인코딩해준다.
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.print("<html><head><title>질의 문자열 테스트</title></head>");
        writer.print("<body>");
        writer.print("<h1>POST 방식으로 요청되었습니다.</h1>");

        writer.print("이름 : " + req.getParameter("name"));

        writer.print("</body></html>");
        writer.close();
    }
}
