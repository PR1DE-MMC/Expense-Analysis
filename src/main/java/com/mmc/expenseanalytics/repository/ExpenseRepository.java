package com.mmc.expenseanalytics.repository;

import com.mmc.expenseanalytics.domain.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> { }
