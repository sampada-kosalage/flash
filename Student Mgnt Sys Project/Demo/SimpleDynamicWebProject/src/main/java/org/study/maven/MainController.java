package org.study.maven;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

public class MainController {

	@GetController("/")
	public ModelAndView home() {
		ModelAndView modelAndview=new ModelAndView("userFormView");
	    Users users=new Users();
	    modelAndview.addObject("users",users);
	    return modelAndview;
	}
	
		/*Map<String,String>gendermap=new HashMap<String,String>();
		gendermap.put("male","Male");
		gendermap.put("female","FeMale");

		Map<String,String>gendermap1=new HashMap<String,String>();
		countryMap.put("India","India");
        CountryMap.put("USA","USA");
        CountryMap.put("Thailand","InThailanddia");
        CountryMap.put("Africa","Africa");
        
        modelAndview.addObject("countryMap",countryMap);
        modelAndview.addObject("genderMap",gendermap1);
        modelAndview.addObject("users",users);
        return modelAndview;
        }*/
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@Valid Users users,BindingResult result) {
		ModelAndView modelAndview=new ModelAndView("displayUserInfo");
	    modelAndview.addObject("users",users);
		if(result.hasErrors()) {
			ModelAndView repopulatingModeAndView=new ModelAndView("userFormView");
			repopulatingModeAndView.addObject("users",users);
			System.out.println("Has Errors");
			return repopulatingModeAndView;
		}
		else {
			System.out.println("All good");
			return modelAndview;
		}
	}
}
