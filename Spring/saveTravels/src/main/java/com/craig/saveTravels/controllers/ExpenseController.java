package com.craig.saveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.craig.saveTravels.models.Expense;
import com.craig.saveTravels.service.ExpenseService;

@Controller
public class ExpenseController {
	
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public String homeRedirect() {
		return "redirect:/expenses";
	}
	
	// View All Expenses
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "home.jsp";
	}

	// Submit new expense from home.jsp (with validation)
	@PostMapping("/expenses/submit")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result,  Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "home.jsp";
		}
		expenseService.createExpense(expense);
		return "redirect:/expenses";
	}
	
	
	
	// View One Expense
	@GetMapping("/expenses/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "showExpense.jsp";
	}



	// Edit expense page
	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "editExpense.jsp";
	}

	// Submit updates
	@PutMapping("/expenses/edit/{id}")
	public String update(@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result) {
		if (result.hasErrors()) {
			return "editExpense.jsp";
		} else {
			System.out.println();
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}

	// Delete a expense
	@DeleteMapping("/expenses/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}

}
