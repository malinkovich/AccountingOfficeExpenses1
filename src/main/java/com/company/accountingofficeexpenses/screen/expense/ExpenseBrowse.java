package com.company.accountingofficeexpenses.screen.expense;

import io.jmix.core.FileRef;
import io.jmix.ui.screen.*;
import com.company.accountingofficeexpenses.entity.Expense;

@UiController("Expense.browse")
@UiDescriptor("expense-browse.xml")
@LookupComponent("expensesTable")
public class ExpenseBrowse extends StandardLookup<Expense> {
    @Install(to = "expensesTable.documentOfExpense", subject = "valueProvider")
    private Object expensesTableDocumentOfExpenseValueProvider(Expense expense) {
        if (expense.getDocumentOfExpense() != null) {
            return expense.getDocumentOfExpense().getFileName();
        }
        else return "";
    }
}