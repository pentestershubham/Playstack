package com.contact.item;

import android.content.ContentValues;
import android.provider.ContactsContract.CommonDataKinds.Organization;

public class OrganizationDataItem extends DataItem {

	public OrganizationDataItem(ContentValues values) {
		super(values);
	}

	public String getCompany() {
		return getContentValues().getAsString(Organization.COMPANY);
	}

	public String getLabel() {
		return getContentValues().getAsString(Organization.LABEL);
	}

	public String getTitle() {
		return getContentValues().getAsString(Organization.TITLE);
	}

	public String getDepartment() {
		return getContentValues().getAsString(Organization.DEPARTMENT);
	}

	public String getJobDescription() {
		return getContentValues().getAsString(Organization.JOB_DESCRIPTION);
	}

	public String getSymbol() {
		return getContentValues().getAsString(Organization.SYMBOL);
	}

	public String getPhoneticName() {
		return getContentValues().getAsString(Organization.PHONETIC_NAME);
	}

	public String getOfficeLocation() {
		return getContentValues().getAsString(Organization.OFFICE_LOCATION);
	}

	public String getPhoneticNameStyle() {
		return getContentValues().getAsString(Organization.PHONETIC_NAME_STYLE);
	}
}
