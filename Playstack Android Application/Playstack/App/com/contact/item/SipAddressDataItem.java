package com.contact.item;

import android.content.ContentValues;
import android.provider.ContactsContract.CommonDataKinds.SipAddress;

public class SipAddressDataItem extends DataItem {

	public SipAddressDataItem(ContentValues values) {
		super(values);
	}

	public String getSipAddress() {
		return getContentValues().getAsString(SipAddress.SIP_ADDRESS);
	}

	public String getLabel() {
		return getContentValues().getAsString(SipAddress.LABEL);
	}
}
