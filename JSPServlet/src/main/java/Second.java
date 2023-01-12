import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class Second extends HttpServlet {

    /**
     * Get 방식으로 /second 요청 시 호출
     * 응답하는 객체 HttpServletResponse에 값을 넣어서 응답
     * 응답 정보를 받은 브라우저는 해당 값(데이터)를 그대로 body부에 작성 -> html 형식인 경우 html 형식에 맞게 출력. 형식에 어긋난다면 쌩으로 body에 작성
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Second.doGet() 호출");

        PrintWriter writer = response.getWriter();
        writer.print("ttttttttttttest");
        writer.print("<html><body><h1>Hello World!!!!!!!!!!!!!!!!!!!!!</h1></body></html>");
        writer.close();
    }

    public int solution(int num, int k) {
        return (" " + num).indexOf(String.valueOf(k));
    }
}
