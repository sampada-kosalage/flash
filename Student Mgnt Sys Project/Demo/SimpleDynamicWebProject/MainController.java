import org.springframework.validation.BindingResult;

public class MainController {

	@GetController("/")
	public ModelAndView home() {
		ModeAndView modelAndview=new ModeAndView("userFormView")
	    User user=new User();
		Map<String,String>gendermap=new HashMap<String,String>();
		genderMap.put("male","Male");
		genderMap.put("female","FeMale");

		Map<String,String>gendermap=new HashMap<String,String>();
        CountryMap.put("India","India");
        CountryMap.put("USA","USA");
        CountryMap.put("Thailand","InThailanddia");
        CountryMap.put("Africa","Africa");
        
        modelAndview.addObject("countryMap",countryMap);
        modelAndview.addObject("genderMap",genderMap);
        modelAndview.addObject("user",user);
        return modeAndview;
        }
	@PostMapping("/displayUserInfo")
	public MOdelAndView displayUserInfo(@valid User user,BindingResult result) {
		ModeAndView modelAndview=new ModeAndView("displayUserInfo")
	    modelAndview.addObject("user",user);
		if(result.hasErrors()) {
			System.out.println("Has Errors");
		}
		return modelAndview;

	}
	
}
