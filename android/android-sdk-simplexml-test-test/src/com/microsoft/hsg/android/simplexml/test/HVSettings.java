package com.microsoft.hsg.android.simplexml.test;

import com.microsoft.hsg.android.HealthVaultService.ConnectionStatus;
import com.microsoft.hsg.android.HealthVaultSettings;

public class HVSettings implements HealthVaultSettings {

	@Override
	public boolean getIsMultiInstanceAware() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsMultiInstanceAware(boolean isAware) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getServiceUrl() {
		return "https://platform.healthvault-ppe.com/platform/wildcat.ashx";
	}

	@Override
	public void setServiceUrl(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getShellUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShellUrl(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAppId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAppId(String appid) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getMasterAppId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMasterAppId(String appId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthenticationSecret() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthenticationSecret(String secret) {
		// TODO Auto-generated method stub

	}

	@Override
	public ConnectionStatus getConnectionStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConnectionStatus(ConnectionStatus status) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

}
