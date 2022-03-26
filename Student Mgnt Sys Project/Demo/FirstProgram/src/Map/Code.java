package Map;

public class Code public Code(implement comparable, String sctionNO, String lectureNo) {
		super();
		Comparable = comparable;
		SctionNO = sectionNO;
		LectureNo = lectureNo;
	}
implement Comparable<Code>{

	private String SctionNO;
	private String LectureNo;
	public implement getComparable() {
		return Comparable;
	}
	public void setComparable(implement comparable) {
		Comparable = comparable;
	}
	public String getSctionNO() {
		return SctionNO;
	}
	public void setSctionNO(String sctionNO) {
		SctionNO = sctionNO;
	}
	public String getLectureNo() {
		return LectureNo;
	}
	public void setLectureNo(String lectureNo) {
		LectureNo = lectureNo;
	}
	@Override
	public String toString() {
		return "Code [SctionNO=" + SctionNO + ", LectureNo=" + LectureNo + "]";
	}
	public int compareTo(Code o) {
		String code1=sectionNo.concat(LectureNo);
		String code2=o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
}

