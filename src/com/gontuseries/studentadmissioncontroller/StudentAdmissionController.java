package com.gontuseries.studentadmissioncontroller;



import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");

		return model;
	}
	/*
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name, @RequestParam("studentHobby") String hobby) {
        Student student=new Student();
        student.setFirstName(name);
        student.setHobby(hobby);
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headMessage","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);
        model.addObject("student",student);
		return model;
	}
*/
	//@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	//public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {

	///	String name = reqPar.get("studentName");
		//String hobby = reqPar.get("hobby");

		//ModelAndView model = new ModelAndView("AdmissionSuccess");
	//	model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);

	//	return model;
	//}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student) {
     
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headMessage","Details submitted by you:");
       
		return model;
	}
}