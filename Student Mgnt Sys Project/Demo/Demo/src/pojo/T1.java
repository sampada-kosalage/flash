package pojo;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T1")
public class T1 {
	private int id;

	private String
	//pojoZ.java01 COL,
			T1C1
			,T1C2
			,T1C3

;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getT1C1() {
		return T1C1;
	}
	public void setT1C1(String t1c1) {
		T1C1 = t1c1;
	}
	public String getT1C2() {
		return T1C2;
	}
	public void setT1C2(String t1c2) {
		T1C2 = t1c2;
	}
	public String getT1C3() {
		return T1C3;
	}
	public void setT1C3(String t1c3) {
		T1C3 = t1c3;
	}
	
}
