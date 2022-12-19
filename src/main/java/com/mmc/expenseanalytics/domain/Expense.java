package com.mmc.expenseanalytics.domain;

import com.mmc.expenseanalytics.domain.enumeration.ExpenseCategories;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

public class Expense {

    @Id
    private String id;
    @Field("amount")
    private float amount;
    @Field("member")
    private String by;
    @Field("date")
    private LocalDateTime date;
    @Field("category")
    private ExpenseCategories category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public ExpenseCategories getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategories category) {
        this.category = category;
    }
}
