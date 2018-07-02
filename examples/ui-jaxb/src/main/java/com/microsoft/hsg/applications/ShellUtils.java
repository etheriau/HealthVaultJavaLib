/*
 * Copyright 2011 Microsoft Corp.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.microsoft.hsg.applications;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.microsoft.hsg.ApplicationConfig;

// TODO: Auto-generated Javadoc
/**
 * The Class ShellUtils.
 */
public class ShellUtils {

	/**
	 * Login.
	 * 
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param returnUrl
	 *            the Url in the app where this should return
	 * @throws ServletException
	 *             the servlet exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void login(HttpServletRequest request,
			HttpServletResponse response, String returnUrl)
			throws ServletException, IOException {
		sendShellTarget(request, response, "AUTH", returnUrl);
	}

	/**
	 * Logout.
	 * 
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param returnUrl
	 *            the Url in the app where this should return
	 * 
	 * @throws ServletException
	 *             the servlet exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void logout(HttpServletRequest request,
			HttpServletResponse response, String returnUrl)
			throws ServletException, IOException {
		sendShellTarget(request, response, "APPSIGNOUT", returnUrl);
	}

	/**
	 * 
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * 
	 * @throws ServletException
	 *             the servlet exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void appAuth(HttpServletRequest request,
			HttpServletResponse response, String returnUrl)
			throws ServletException, IOException {
		sendShellTarget(request, response, "APPAUTH", returnUrl);
	}

	/**
	 * Login and Create.
	 * 
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * 
	 * @throws ServletException
	 *             the servlet exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void createAccount(HttpServletRequest request,
			HttpServletResponse response, String returnUrl)
			throws ServletException, IOException {
		sendShellTarget(request, response, "CREATEACCOUNT", returnUrl);
	}

	/**
	 * Login and Create Record.
	 * 
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * 
	 * @throws ServletException
	 *             the servlet exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void CreateRecord(HttpServletRequest request,
			HttpServletResponse response, String returnUrl)
			throws ServletException, IOException {
		sendShellTarget(request, response, "CREATERECORD", returnUrl);
	}

	
	
	/**
	 * Send shell target.
	 * 
	 * @param request the request
	 * @param response the response
	 * @param target the target
	 * @param returnUrl the return url
	 * 
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@SuppressWarnings("deprecation")
	public static void sendShellTarget(HttpServletRequest request,
			HttpServletResponse response, String target, String returnUrl)
			throws ServletException, IOException {
				
		StringBuffer targetqs = new StringBuffer();
		targetqs.append("appid=");
		targetqs.append(ApplicationConfig.APP_ID);
		if (Config.RedirectUrl != null
				&& Config.RedirectUrl.trim().length() != 0) {
			targetqs.append("&redirect=");
			targetqs.append(request.getScheme());
			targetqs.append("://");
			targetqs.append(request.getServerName());
			targetqs.append(":");
			targetqs.append(request.getServerPort());
			targetqs.append(request.getContextPath());
			targetqs.append(Config.RedirectUrl);
		}
		
		if (returnUrl != null)
		{
			targetqs.append("&actionqs=");
			targetqs.append(URLEncoder.encode(returnUrl));
		}

		StringBuffer url = new StringBuffer();
		url.append(Config.ShellUrl);
		url.append("/redirect.aspx?target=" + target + "&targetqs=?");
		url.append(URLEncoder.encode(targetqs.toString()));
		
		response.sendRedirect(url.toString());
	}

}
