
public class Bird extends Animal{
	
  private String type;
  private String feature;
  
  public Bird() {
	  this.type="Animal with feature";
	  this.feature="fly";
  }
  public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getFeature() {
	return feature;
}

public void setFeature(String feature) {
	this.feature = feature;
}
}
