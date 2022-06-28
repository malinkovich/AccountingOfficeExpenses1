package com.company.accountingofficeexpenses.screen.expense;

import io.jmix.ui.screen.*;
import com.company.accountingofficeexpenses.entity.Expense;

@UiController("Expense.browse")
@UiDescriptor("expense-browse.xml")
@LookupComponent("expensesTable")
public class ExpenseBrowse extends StandardLookup<Expense> {
}