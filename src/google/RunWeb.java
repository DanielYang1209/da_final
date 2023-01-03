import java.io.IOException;
import java.io.PrintWriter;

//servlet���頦���剖��鞈∴蕭雿���剖��頦���哨蕭嚙踝蕭���頦���哨蕭嚙踝蕭嚙踝蕭皜莎蕭���嚙賡�貉�剖��頦���哨蕭嚙踝蕭���頦���哨蕭嚙賭����剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭���嚚���剜��皜莎蕭��刻�剖��頦���哨蕭嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙踝蕭���嚚���剖��鞈∴蕭雿���剖��頦���哨蕭嚙踝蕭���頦���哨蕭嚙賭����剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙賭����剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙賭����剖��頦���哨蕭嚙踝蕭���頦���哨蕭嚙踝蕭���嚙踝蕭嚙賢�刻�剖��鞈⊿�瘀蕭嚙賢�刻�剖��頦���哨蕭嚙踝蕭��佗蕭嚙踝蕭��刻�剖��鞈哨蕭嚙踝蕭嚙賢��嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���苑 server嚙踝蕭嚙賡�佗蕭嚙踝蕭���嚙踝蕭�����渲�剝�選蕭嚙踝蕭���嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙踝蕭��佗蕭嚙踝蕭��刻�剖��鞈哨蕭嚙踝蕭嚙賢��嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙踝蕭��佗蕭嚙踝蕭��刻�剖��鞈哨蕭嚙踝蕭嚙賢��嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙踝蕭��佗蕭嚙踝蕭��刻�剖��鞈哨蕭嚙踝蕭嚙賢��嚙踝蕭��佗蕭嚙踝蕭��刻�剖��鞈ｇ蕭曈渲�哨蕭嚙踝蕭���頦���哨蕭嚙賭����剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭��佗蕭嚙踝蕭��刻�剖��鞈哨蕭嚙踝蕭嚙賢��嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙踝蕭��佗蕭嚙踝蕭��刻�剖��鞈哨蕭嚙踝蕭嚙賢��嚙踝蕭��佗蕭嚙踝蕭��刻�剖��鞈ｇ蕭曈渲�哨蕭嚙踝蕭���頦���哨蕭嚙踝蕭���鞈ｇ蕭嚙賡�佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙踝蕭���嚙踝蕭嚙賢��嚙踝蕭���嚚���剖��鞈∴蕭雿���剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙踝蕭���嚙� ���頦���剖��鞈∴蕭雿���剖��頦���哨蕭嚙踝蕭���頦���哨蕭嚙踝蕭嚙踝蕭皜莎蕭���嚙賡�貉�剖��頦���哨蕭嚙踝蕭���頦���哨蕭嚙賭����剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙賭����剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭�����刻�剖��頦���剖��鞈ｇ蕭嚙賢��頦���哨蕭嚙賭����剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭��佗蕭嚙踝蕭��刻�剖��頦���哨蕭嚙賭����剖��頦���哨蕭嚙賢�鳴蕭���嚙踝蕭�����刻�剖��頦���剖��鞈ｇ蕭嚙賢��頦���哨蕭嚙賭����剖��頦���哨蕭嚙踝蕭���頦���哨蕭嚙踝蕭���嚙�
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BmiA
 */
@WebServlet("/RunWeb")
public class RunWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RunWeb() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestUri = request.getRequestURI();
		PrintWriter out = response.getWriter();
		
        // our search engine name is "Cafoogle" (whatever lol)
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cafoogle</title>");
		out.println("</head>");
		out.println("<body>");
		
        // 嚙踝蕭嚙賡�����嚙踝蕭嚙踝蕭嚙賡��嚙踝蕭嚙踝蕭嚙踝蕭嚙賣��嚙賜�ｇ蕭
		// ���嚙踝蕭嚙踝蕭嚙踝蕭嚙踝蕭嚙踝蕭���嚙賜��頦蛛蕭嚙踝蕭嚙踝蕭��啣��嚙質�剛��嚙踝蕭嚙踝蕭嚙踝蕭java combobox?
		// 嚙踝蕭��穿蕭嚙�!
		out.println("<form action='" + requestUri + "' method='post'>");
		out.println("<input type='text' name='keyword' placeholder = 'height'/>");
		out.println("<input type='submit' value='search' />");
		out.println("</form>");

        //body/web color
        out.println("<body id='WebPage' bgcolor='#E09200;>");
		
        //body/web color changes when user clicks(��������恬蕭嚙賣�潘蕭嚙�)
       out.println("<html>");
       out.println("<body id='WebPage' bgcolor='#E09200;>");
       out.println("<input type='button' onclick='ChangeBgColor()' value='���嚙踝蕭嚙賣葡嚙踝蕭嚙踝蕭��恬蕭嚙踝蕭嚙踝蕭'>");
    
       out.println("<script type='text/javascript'>");
       out.println("function ChangeBgColor(){   document.bgColor='gray'}");
       out.println("</script>");
       out.println("</body>");
       out.println("</html>");


		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		double weight  = Double.parseDouble(request.getParameter("weight"));
		double height  = Double.parseDouble(request.getParameter("height"));
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cafoogle</title>");
		out.println("</head>");
		out.println("<body>");
		
        //we need to place the search result (which is counted in other classes)
		out.println(("The searching result is: )+SearchResult);
		System.out.println(webpage.name+"          "+webpage.score);
		
		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}

}
