package com.craig.saveTravels.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craig.saveTravels.models.Expense;
import com.craig.saveTravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;
	
    // retrieves all the expenses
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
    // creates a expense
    public Expense createExpense(Expense b) {
        return expenseRepository.save(b);
    }
    // retrieves a expense if it exists (optional)
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if (optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    // update a expense
//    public Expense updateExpense(Expense expense, Long id) {
//        Optional<Expense> optionalExpense = expenseRepository.findById(id);
//        if (optionalExpense.isPresent()) {
//            return expenseRepository.save(expense);
//        } else {
//            return null;
//        } 
//    }
    public Expense updateExpense(Expense expense) {
        
           return expenseRepository.save(expense);
       
    }
    // delete a expense
    public String delete(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if (optionalExpense.isPresent()) {
            expenseRepository.deleteById(id);
            return "Deleted";
        } else {
            return "No expense to delete";
        }
    }
	
	
	
}
