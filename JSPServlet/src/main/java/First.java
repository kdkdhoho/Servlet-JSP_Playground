import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(value = "/first", description = "테스트용 서블릿")
public class First extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init() 호출");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("service() 호출");
    }
}