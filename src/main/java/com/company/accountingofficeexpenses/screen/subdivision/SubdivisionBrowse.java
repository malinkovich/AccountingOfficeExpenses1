package com.company.accountingofficeexpenses.screen.subdivision;

import io.jmix.ui.screen.*;
import com.company.accountingofficeexpenses.entity.Subdivision;

@UiController("Subdivision.browse")
@UiDescriptor("subdivision-browse.xml")
@LookupComponent("subdivisionsTable")
public class SubdivisionBrowse extends StandardLookup<Subdivision> {
}