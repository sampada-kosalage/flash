package org.study.database;

@RequestMapping("/reservation")
@Controller
public class ReservationController {

	@RequestMapping("/bookingForm")
	public String bookingFrom(Model model) {
		
		Reservation re=new Reservation();
		model.addAttribute("reservation",re);
		return "reservationpage";
	}
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation")Reservation re) {
		return "confirmation-form";
	}
}
