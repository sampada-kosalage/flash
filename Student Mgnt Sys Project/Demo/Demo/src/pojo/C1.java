package pojo;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "C1")
public class C1 {
	private int id;

	private String
	//pojoZ.java01 COL,
			C1P1id
			,C1C2
			,C1C3

;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getC1P1id() {
		return C1P1id;
	}

	public void setC1P1id(String c1p1id) {
		C1P1id = c1p1id;
	}

	public String getC1C2() {
		return C1C2;
	}

	public void setC1C2(String c1c2) {
		C1C2 = c1c2;
	}

	public String getC1C3() {
		return C1C3;
	}

	public void setC1C3(String c1c3) {
		C1C3 = c1c3;
	}	
	
}
