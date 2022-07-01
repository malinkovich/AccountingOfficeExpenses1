package com.company.accountingofficeexpenses.screen.subdivision;

import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import com.company.accountingofficeexpenses.entity.Subdivision;

@UiController("Subdivision.browse")
@UiDescriptor("subdivision-browse.xml")
@LookupComponent("subdivisionsTable")
public class SubdivisionBrowse extends StandardLookup<Subdivision> {
    //создание колонки в таблице с информацией о количестве сотрудников в подразделении
    @Install(to = "subdivisionsTable.employeeCount", subject = "columnGenerator")
    private io.jmix.ui.component.Component subdivisionsTableEmployeeCountColumnGenerator(Subdivision sub) {
        return new Table.PlainTextCell(String.valueOf(sub.getEmployeesSubdiv().size()));
    }
}