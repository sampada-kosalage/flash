package org.study.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class DController {

	/*@Autowired
	DeveloperRepository repository;
	
	@Autowired
	SkillRepository skillRepository;
	
	@RequestMapping("/developer/{id}")
	public String developer(@PathVariable int id,Model model) {
		model.addAttribute("developer",repository.findOne(id));
		model.addAttribute("skill",skillRepository.findAll());
	    return "developer";
	}
	@RequestMapping(value="/developer",method=RequestMethod.GET)
	public String developerList(Model model) {
		model.addAttribute("developer",repository.findAll());
		return "developer";
		
		@RequestMapping(value="/developers",method=RequestMethod.POST)
		public String developersAdd(@RequestParam String email,@RequestParam String firstName,@RequestParam String lastName,Model model) {
			Developer newDeveloper=new Developer();
			newDeveloper.setEmail(email);
			newDeveloper.setFirstName(firstName);
			newDeveloper.setLastName(lastName);
			repository.save(newDeveloper);

			model.addAttribute("developer",newDeveloper);
			model.addAttribute("skill",skillRepository.findAll());
			return "redirect:/developer/"+newDeveloper.getId();
     }
		@RequestMapping(value="/developer/{Id}/skill",method=RequestMethod.POST)
		public String developersAddSkill(@PathVariable int id,@RequestParam int skillId,Model model) {
			Skill skill=skillRepository.findOne(skillId);
			Developer developer=repository.findOne(id);
			
			if(developer!=null) {
				if(!developer.hasSkill(skill)) {
					developer.getSkill().add(skill);
				}
				repository.save(developer);
				model.addAttribute("developer",repository.findOne(id));
				model.addAttribute("skill",skillRepository.findAll());
				return "redirect:/developer/"+developer.getId();
			}
			model.addAttribute("developer",repository.findAll());
			return "redirect:/developers";
		
	}*/
		
		@DController
		public class DController
		{
			@RequestMapping("/RegisterUser")
			public String register(HttpServletRequest request) throws ClassNotFoundException, SQLException
			{
				String id= request.getParameter("id");
                String firstname= request.getParameter("firstname");
				String lastname= request.getParameter("lastname");
				String email= request.getParameter("email");
				
				DBConnectivity.addDeveloper(id,firstname,lastname,email);
				return "developerDetails";
			}
			@RequestMapping("/show")
			public String showAll(HttpServletRequest request) throws ClassNotFoundException, SQLException
			{
				List<Developer> d=DBConnectivity.showAll();
				request.setAttribute("a", a);
				return "DBConnectivity";
				
			}
			
			
		}

	
}
