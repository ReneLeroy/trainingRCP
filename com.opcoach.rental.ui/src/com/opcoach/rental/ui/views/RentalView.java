package com.opcoach.rental.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.rental.core.RentalCoreActivator;
import com.opcoach.training.rental.Rental;

public class RentalView extends ViewPart {
	
	private Label rentedObjectLabel;

	public RentalView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		Group infoGroup = new Group(parent,SWT.NONE );
		infoGroup.setText("Information");
		infoGroup.setLayout(new GridLayout(2, false));
		
		rentedObjectLabel = new Label(infoGroup, SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);
		setRental(RentalCoreActivator.getAgency().getRentals().get(0));
	}

	private void setRental(Rental r) {
		// TODO Auto-generated method stub
		rentedObjectLabel.setText(r.getRentedObject().getName());

	}
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
