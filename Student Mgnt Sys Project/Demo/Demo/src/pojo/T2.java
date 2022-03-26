package pojo;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T2")
public class T2 {
	private int id;

	private String
	//pojoZ.java01 COL,
			T2C1
			,T2C2
			,T2C3

;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getT2C1() {
		return T2C1;
	}

	public void setT2C1(String t2c1) {
		T2C1 = t2c1;
	}

	public String getT2C2() {
		return T2C2;
	}

	public void setT2C2(String t2c2) {
		T2C2 = t2c2;
	}

	public String getT2C3() {
		return T2C3;
	}

	public void setT2C3(String t2c3) {
		T2C3 = t2c3;
	}	
	
}
