package com.harold.activos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harold.activos.entity.Employee;
import com.harold.activos.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeService;
	
	@RequestMapping("/")
	public String getIndex(Model model) {
		model.addAttribute("list", employeService.getAll());
		return "index";
	}
	
	
	@GetMapping("/save/{id}")
	public String showSaveEmployee(@PathVariable("id") Long id,Model model) {
		if (id!=null && id!=0) {
			model.addAttribute("employee",employeService.get(id));
		}else {
			model.addAttribute("employee", new Employee());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Employee employee, Model model) {
		employeService.save(employee);
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		employeService.delete(id);
		return "redirect:/";
	}
	
}
