package com.company.accountingofficeexpenses.screen.expense;

import io.jmix.ui.Notifications;
import io.jmix.ui.screen.*;
import com.company.accountingofficeexpenses.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Expense.edit")
@UiDescriptor("expense-edit.xml")
@EditedEntityContainer("expenseDc")
public class ExpenseEdit extends StandardEditor<Expense> {
    @Autowired
    private Notifications notifications;
    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        if (getEditedEntity().getSumExpense().add(getEditedEntity().getEmployeeExpense().sumAllSxpenseOfEmployee()).intValue() >
                getEditedEntity().getTypeOfExpense().getLimitSumEmployee().intValue()) {
            notifications.create().withCaption("Your sum is more than the monthly limit").show();
            event.preventCommit();
        }
        else event.resume();
    }
}