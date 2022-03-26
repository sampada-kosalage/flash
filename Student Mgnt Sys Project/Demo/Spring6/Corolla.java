@Component
public class Corolla implements Car{

	
	@Autowired
	Engine engine;
	
	public String spects() {
		String spects="sedan from toyota with engine as "+engine.type;
		return spects;
		
		//return "seden from toyota";
	}
}
