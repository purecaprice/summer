package lll;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class Search extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=utf-8");
		
	
		try {
			////////////
			// do something
			////////////
			DBConnection db = new DBConnection();
			ArrayList<question> list =new ArrayList<question>();
			int MAX = 4;
			for(int i=1 ; i< 5; i++){
			Random r = new Random();
			int Id = r.nextInt(100)%MAX;
			ResultSet rs = db.executeQuery("select * from ti where id = '" + Id + "'");
			String id = "";
			String question = "";
			String A = "";
			String B = "";
			String C = "";
			String D = "";
			String answer = "";
			int count=0;
			
			while(rs.next()){
				question=rs.getString(2);
				A=rs.getString(3);
				B=rs.getString(4);
				C=rs.getString(5);
				D=rs.getString(6);
				answer=rs.getString(7);
				question q = new question(id, question, A, B, C, D, answer);
				list.add(q);
			}
			}
			db.close();
			
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();
			
			JSONObject obj1 = new JSONObject();
			question q1=list.get(0);
			obj1.put("id", q1.id);
			obj1.put("question",q1.question);
			obj1.put("A", q1.A);
			obj1.put("B",q1. B);
			obj1.put("C", q1.C);
			obj1.put("D", q1.D);
			obj1.put("answer", q1.answer);
			obj.put("question1",obj1);
			
			JSONObject obj2 = new JSONObject();
			question q2=list.get(1);
			obj2.put("id", q2.id);
			obj2.put("question",q2.question);
			obj2.put("A", q2.A);
			obj2.put("B",q2. B);
			obj2.put("C", q2.C);
			obj2.put("D", q2.D);
			obj2.put("answer", q2.answer);
			obj.put("question3",obj2);
			
			JSONObject obj3 = new JSONObject();
			question q3=list.get(2);
			obj3.put("id", q3.id);
			obj3.put("question",q3.question);
			obj3.put("A", q3.A);
			obj3.put("B",q3. B);
			obj3.put("C", q3.C);
			obj3.put("D", q3.D);
			obj3.put("answer", q3.answer);
			obj.put("question3",obj3);
			
			JSONObject obj4 = new JSONObject();
			question q4=list.get(3);
			obj4.put("id", q4.id);
			obj4.put("question",q4.question);
			obj4.put("A", q4.A);
			obj4.put("B",q4. B);
			obj4.put("C", q4.C);
			obj4.put("D", q4.D);
			obj4.put("answer", q4.answer);
			obj.put("question4",obj4);
			
			System.out.println(obj.toString());
			out.print(obj.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
	}

}
