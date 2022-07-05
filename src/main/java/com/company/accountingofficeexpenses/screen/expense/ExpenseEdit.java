package com.company.accountingofficeexpenses.screen.expense;

import io.jmix.ui.screen.*;
import com.company.accountingofficeexpenses.entity.Expense;

@UiController("Expense.edit")
@UiDescriptor("expense-edit.xml")
@EditedEntityContainer("expenseDc")
public class ExpenseEdit extends StandardEditor<Expense> {
}