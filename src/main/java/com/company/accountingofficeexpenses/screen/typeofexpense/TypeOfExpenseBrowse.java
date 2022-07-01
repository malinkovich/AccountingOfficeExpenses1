package com.company.accountingofficeexpenses.screen.typeofexpense;

import io.jmix.ui.screen.*;
import com.company.accountingofficeexpenses.entity.TypeOfExpense;

@UiController("TypeOfExpense.browse")
@UiDescriptor("type-of-expense-browse.xml")
@LookupComponent("typeOfExpensesTable")
public class TypeOfExpenseBrowse extends StandardLookup<TypeOfExpense> {
}