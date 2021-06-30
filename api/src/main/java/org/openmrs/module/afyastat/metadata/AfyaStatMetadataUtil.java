/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.afyastat.metadata;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.PatientIdentifierType;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Component;

/**
 * Metadata constants
 */
@Component
public class AfyaStatMetadataUtil {
	
	public static final String MODULE_ID = "afyastat";
	
	public static final String MEDIC_MOBILE_LAST_PATIENT_CONTACT_ENTRY = "medic.lastSavedPatientContact";
	
	public static final String MEDIC_MOBILE_SERVER_URL = "medic.chtServerUrl";
	
	public static final String MEDIC_MOBILE_LAST_PATIENT_ENTRY = "medic.lastSavedPersonId";
	
	public static final String MEDIC_MOBILE_USER = "medic.chtUser";
	
	public static final String MEDIC_MOBILE_PWD = "medic.chtPwd";
	
	public static final String TELEPHONE_CONTACT = "b2c38640-2603-4629-aebd-3b54f33f1e3a";
	
	public static final String AFYASTAT_LINKAGE_LIST_LAST_FETCH_TIMESTAMP = "afyastatLinkageListTask.lastFetchDateAndTime";
	
	public static final String AFYASTAT_CONTACT_LIST_LAST_FETCH_TIMESTAMP = "afyastatContactListTask.lastFetchDateAndTime";
	
	public static final class _PatientIdentifierType {
		
		public static final String CHT_RECORD_UUID = "c6552b22-f191-4557-a432-1f4df872d473";
	}
}
