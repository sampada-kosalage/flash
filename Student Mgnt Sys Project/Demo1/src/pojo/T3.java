package pojo;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T3")
public class T3 {
	private int id;

	private String
	//pojoZ.java01 COL,
			T3C1
			,T3C2
			,T3C3

;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getT3C1() {
		return T3C1;
	}

	public void setT3C1(String t3c1) {
		T3C1 = t3c1;
	}

	public String getT3C2() {
		return T3C2;
	}

	public void setT3C2(String t3c2) {
		T3C2 = t3c2;
	}

	public String getT3C3() {
		return T3C3;
	}

	public void setT3C3(String t3c3) {
		T3C3 = t3c3;
	}	
	
}
