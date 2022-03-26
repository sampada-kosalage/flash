package pojo;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "P1")
public class P1 {
	private int id;

	private String
	//pojoZ.java01 COL,
			P1C1
			,P1C2
			,P1C3

;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getP1C1() {
		return P1C1;
	}

	public void setP1C1(String p1c1) {
		P1C1 = p1c1;
	}

	public String getP1C2() {
		return P1C2;
	}

	public void setP1C2(String p1c2) {
		P1C2 = p1c2;
	}

	public String getP1C3() {
		return P1C3;
	}

	public void setP1C3(String p1c3) {
		P1C3 = p1c3;
	}	
	
}
