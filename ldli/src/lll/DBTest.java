package lll;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class DBTest {

	public static void main(String[] args) {
		try {
			DBConnection b =new DBConnection();
			String sql = "question t = new question(id, question, A, B, C, D, answer) values('1507','Tom',20,'','')";
			
			b.execute(sql);
			ResultSet rs = b.executeQuery("select * from ti");
			
			ArrayList<question> list = new ArrayList();
			while(rs.next()){
				String id = rs.getString(1);
				String question = rs.getString(2);
				String A = rs.getString(3);
				String B = rs.getString(4);
				String C = rs.getString(5);
				String D = rs.getString(6);
				String answer = rs.getString(7);
				question t = new question(id, question, A, B, C, D, answer);
				list.add(t);
			}
			b.close();
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1};
			while(j<4) {
				int randnumber = r.nextInt(list.size());
				System.out.println(randnumber);
				//if not exist 
				ques[j] = randnumber;
				j++;
			}
			
			for(int k=0;k<4;k++) {
				question s = list.get(k);
				System.out.println(s.id);
				System.out.println(s.question);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
