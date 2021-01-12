package org.openmrs.module.afyastat.api.service;

import org.openmrs.Person;
import org.openmrs.Role;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.afyastat.model.*;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 */
public interface AfyaStatDataService extends OpenmrsService {
	
	/**
	 * Return the queue data with the given id.
	 * 
	 * @param id the queue data id.
	 * @return the queue data with the matching id.
	 * @should return queue data with matching id.
	 * @should return null when no queue data with matching id.
	 */
	AfyaStatQueueData getQueueData(final Integer id);
	
	/**
	 * Return the queue data with the given uuid.
	 * 
	 * @param uuid the queue data uuid.
	 * @return the queue data with the matching uuid.
	 * @should return queue data with matching uuid.
	 * @should return null when no queue data with matching uuid.
	 */
	AfyaStatQueueData getQueueDataByUuid(final String uuid);
	
	/**
	 * Return all saved queue data.
	 * 
	 * @return all saved queue data.
	 * @should return empty list when no queue data are saved in the database.
	 * @should return all saved queue data.
	 */
	List<AfyaStatQueueData> getAllQueueData();
	
	/**
	 * Save queue data into the database.
	 * 
	 * @param queueData the queue data.
	 * @return saved queue data.
	 * @should save queue data into the database.
	 */
	AfyaStatQueueData saveQueueData(final AfyaStatQueueData queueData);
	
	/**
	 * Delete queue data from the database.
	 * 
	 * @param queueData the queue data
	 * @should remove queue data from the database
	 */
	void purgeQueueData(final AfyaStatQueueData queueData);
	
	/**
	 * Get the total number of the queue data in the database with partial matching search term on
	 * the payload.
	 * 
	 * @param search the search term.
	 * @return the total number of the queue data in the database.
	 */
	Number countQueueData(final String search);
	
	/**
	 * Get queue data with matching search term for a particular page.
	 * 
	 * @param search the search term.
	 * @param pageNumber the page number.
	 * @param pageSize the size of the page.
	 * @return list of all queue data with matching search term for a particular page.
	 */
	List<AfyaStatQueueData> getPagedQueueData(final String search, final Integer pageNumber, final Integer pageSize);
	
	/**
	 * Return the error data with the given id.
	 * 
	 * @param id the error data id.
	 * @return the error data with the matching id.
	 * @should return error data with matching id.
	 * @should return null when no error data with matching id.
	 */
	ErrorInformation getErrorData(final Integer id);
	
	/**
	 * Return the error data with the given uuid.
	 * 
	 * @param uuid the error data uuid.
	 * @return the error data with the matching uuid.
	 * @should return error data with matching uuid.
	 * @should return null when no error data with matching uuid.
	 */
	ErrorInformation getErrorDataByUuid(final String uuid);
	
	/**
	 * Return the registration error data with the given patientUuid.
	 * 
	 * @param patientUuid the error data patientUuid.
	 * @return the error data with the matching uuid.
	 * @should return error data with matching uuid.
	 * @should return null when no error data with matching uuid.
	 */
	ErrorInformation getRegistrationErrorDataByPatientUuid(final String patientUuid);
	
	/**
	 * Return all saved error data.
	 * 
	 * @return all saved error data.
	 * @should return empty list when no error data are saved in the database.
	 * @should return all saved error data.
	 */
	List<ErrorInformation> getAllErrorData();
	
	/**
	 * Save error data into the database.
	 * 
	 * @param ErrorInformation the error data.
	 * @return saved error data.
	 * @should save error data into the database.
	 */
	ErrorInformation saveErrorData(final ErrorInformation ErrorInformation);
	
	/**
	 * Delete error data from the database.
	 * 
	 * @param ErrorInformation the error data
	 * @should remove error data from the database
	 */
	void purgeErrorData(final ErrorInformation ErrorInformation);
	
	/**
	 * Get the total number of the error data in the database with partial matching search term on
	 * the payload.
	 * 
	 * @param search the search term.
	 * @return the total number of the error data in the database.
	 */
	Number countErrorData(final String search);
	
	/**
	 * Get error data with matching search term for a particular page.
	 * 
	 * @param search the search term.
	 * @param pageNumber the page number.
	 * @param pageSize the size of the page.
	 * @return list of all error data with matching search term for a particular page.
	 */
	List<ErrorInformation> getPagedErrorData(final String search, final Integer pageNumber, final Integer pageSize);
	
	/**
	 * Return the archive data with the given id.
	 * 
	 * @param id the archive data id.
	 * @return the archive data with the matching id.
	 * @should return archive data with matching id.
	 * @should return null when no archive data with matching id.
	 */
	ArchiveInfo getArchiveData(final Integer id);
	
	/**
	 * Return the archive data with the given uuid.
	 * 
	 * @param uuid the archive data uuid.
	 * @return the archive data with the matching uuid.
	 * @should return archive data with matching uuid.
	 * @should return null when no archive data with matching uuid.
	 */
	ArchiveInfo getArchiveDataByUuid(final String uuid);
	
	/**
	 * Return all archived data with the given form data uuid.
	 * 
	 * @param formDataUuid the form data uuid
	 * @return the list of archived data with the matching formDataUuid
	 * @should return the list of archived data with the matching formDataUuid
	 * @should return empty list when no archived data with matching formDataUuid
	 */
	List<ArchiveInfo> getArchiveDataByFormDataUuid(final String formDataUuid);
	
	/**
	 * Return all error data with the given form data uuid.
	 * 
	 * @param formDataUuid the form data uuid
	 * @return the list of error data with the matching formDataUuid
	 * @should return the list of error data with the matching formDataUuid
	 * @should return empty list when no error data with matching formDataUuid
	 */
	List<ErrorInformation> getErrorDataByFormDataUuid(final String formDataUuid);
	
	/**
	 * Return all queue data with the given form data uuid.
	 * 
	 * @param formDataUuid the form data uuid
	 * @return the list of queue data with the matching formDataUuid
	 * @should return the list of queue data with the matching formDataUuid
	 * @should return empty list when no queue data with matching formDataUuid
	 */
	List<AfyaStatQueueData> getQueueDataByFormDataUuid(final String formDataUuid);
	
	/**
	 * Return all saved archive data.
	 * 
	 * @return all saved archive data.
	 * @should return empty list when no archive data are saved in the database.
	 * @should return all saved archive data.
	 */
	List<ArchiveInfo> getAllArchiveData();
	
	/**
	 * Save archive data into the database.
	 * 
	 * @param ArchiveData the archive data.
	 * @return saved archive data.
	 * @should save archive data into the database.
	 */
	ArchiveInfo saveArchiveData(final ArchiveInfo ArchiveData);
	
	/**
	 * Delete archive data from the database.
	 * 
	 * @param ArchiveData the archive data
	 * @should remove archive data from the database
	 */
	void purgeArchiveData(final ArchiveInfo ArchiveData);
	
	/**
	 * Get the total number of the archive data in the database with partial matching search term on
	 * the payload.
	 * 
	 * @param search the search term.
	 * @return the total number of the archive data in the database.
	 */
	Number countArchiveData(final String search);
	
	/**
	 * Get archive data with matching search term for a particular page.
	 * 
	 * @param search the search term.
	 * @param pageNumber the page number.
	 * @param pageSize the size of the page.
	 * @return list of all archive data with matching search term for a particular page.
	 */
	List<ArchiveInfo> getPagedArchiveData(final String search, final Integer pageNumber, final Integer pageSize);
	
	/**
	 * Return the data source with the given id.
	 * 
	 * @param id the data source id.
	 * @return the data source with the matching id.
	 * @should return data source with matching id.
	 * @should return null when no data source with matching id.
	 */
	AfyaDataSource getDataSource(final Integer id);
	
	/**
	 * Return the data source with the given uuid.
	 * 
	 * @param uuid the data source uuid.
	 * @return the data source with the matching uuid.
	 * @should return data source with matching uuid.
	 * @should return null when no data source with matching uuid.
	 */
	AfyaDataSource getDataSourceByUuid(final String uuid);
	
	/**
	 * Return all saved data source.
	 * 
	 * @return all saved data source.
	 * @should return empty list when no data source are saved in the database.
	 * @should return all saved data source.
	 */
	List<AfyaDataSource> getAllDataSource();
	
	/**
	 * Save data source into the database.
	 * 
	 * @param DataSource the data source.
	 * @return saved data source.
	 * @should save data source into the database.
	 */
	AfyaDataSource saveDataSource(final AfyaDataSource DataSource);
	
	/**
	 * Delete data source from the database.
	 * 
	 * @param DataSource the data source
	 * @should remove data source from the database
	 */
	void purgeDataSource(final AfyaDataSource DataSource);
	
	/**
	 * Get the total number of the data source in the database with partial matching search term on
	 * the payload.
	 * 
	 * @param search the search term.
	 * @return the total number of the data source in the database.
	 */
	Number countDataSource(final String search);
	
	/**
	 * Get data source with matching search term for a particular page.
	 * 
	 * @param search the search term.
	 * @param pageNumber the page number.
	 * @param pageSize the size of the page.
	 * @return list of all data source with matching search term for a particular page.
	 */
	List<AfyaDataSource> getPagedDataSource(final String search, final Integer pageNumber, final Integer pageSize);
	
	/**
	 * Return the notification data with the given id.
	 * 
	 * @param id the notification data id.
	 * @return the notification data with the matching id.
	 * @should return notification data with matching id.
	 * @should return null when no notification data with matching id.
	 */
	NotificationInfo getNotificationData(final Integer id);
	
	/**
	 * Return the notification data with the given uuid.
	 * 
	 * @param uuid the notification data uuid.
	 * @return the notification data with the matching uuid.
	 * @should return notification data with matching uuid.
	 * @should return null when no notification data with matching uuid.
	 */
	NotificationInfo getNotificationDataByUuid(final String uuid);
	
	/**
	 * Return all saved notification data.
	 * 
	 * @return all saved notification data.
	 * @should return empty list when no notification data are saved in the database.
	 * @should return all saved notification data.
	 */
	List<NotificationInfo> getAllNotificationData();
	
	/**
	 * Return all paged notification data for a particular person with matching search term for a
	 * particular page.
	 * 
	 * @param search the search term.
	 * @param pageNumber the page number.
	 * @param pageSize the size of the page.
	 * @return all saved notification data.
	 * @should return empty list when no notification data are saved in the database.
	 * @should return all saved notification data.
	 */
	List<NotificationInfo> getNotificationDataByReceiver(final Person person, final String search, final Integer pageNumber,
	        final Integer pageSize, final String status, final Date syncDate);
	
	/**
	 * Return paged notification data from a particular person with matching search term for a
	 * particular page.
	 * 
	 * @param search the search term.
	 * @param pageNumber the page number.
	 * @param pageSize the size of the page.
	 * @return all saved notification data.
	 * @should return empty list when no notification data are saved in the database.
	 * @should return all saved notification data.
	 */
	List<NotificationInfo> getNotificationDataBySender(final Person person, final String search, final Integer pageNumber,
	        final Integer pageSize, final String status, final Date syncDate);
	
	/**
	 * Return count for the paged notification data for a particular person with matching search
	 * term for a particular page.
	 * 
	 * @param person the person.
	 * @param search the search term.
	 * @return all saved notification data.
	 * @should return empty list when no notification data are saved in the database.
	 * @should return all saved notification data.
	 */
	Number countNotificationDataByReceiver(final Person person, final String search, final String status);
	
	/**
	 * Return count for the paged notification data from a particular person with matching search
	 * term for a particular page.
	 * 
	 * @param person the person.
	 * @param search the search term.
	 * @return all saved notification data.
	 * @should return empty list when no notification data are saved in the database.
	 * @should return all saved notification data.
	 */
	Number countNotificationDataBySender(final Person person, final String search, final String status);
	
	List<NotificationInfo> getNotificationDataByRole(final Role role, final String search, final Integer pageNumber,
	        final Integer pageSize, final String status);
	
	Number countNotificationDataByRole(final Role role, final String search, final String status);
	
	/**
	 * Save notification data into the database.
	 * 
	 * @param notificationInfo the notification data.
	 * @return saved notification data.
	 * @should save notification data into the database.
	 */
	NotificationInfo saveNotificationData(final NotificationInfo notificationInfo);
	
	/**
	 * Delete notification data from the database.
	 * 
	 * @param notificationInfo the notification data
	 * @should remove notification data from the database
	 */
	void purgeNotificationData(final NotificationInfo notificationInfo);
	
	/**
	 * Void a single notification data.
	 * 
	 * @param notificationInfo the notification data to be voided.
	 * @return the voided notification data.
	 */
	NotificationInfo voidNotificationData(final NotificationInfo notificationInfo, final String reason);
	
	/**
	 * Return the error message with the given id.
	 * 
	 * @param id the error message id.
	 * @return the error message with the matching id.
	 * @should return error message with matching id.
	 * @should return null when no error message with matching id.
	 */
	ErrorMessagesInfo getErrorMessage(final Integer id);
	
	/**
	 * Return the error message with the given uuid.
	 * 
	 * @param uuid the error message uuid.
	 * @return the error message with the matching uuid.
	 * @should return error message with matching uuid.
	 * @should return null when no error message with matching uuid.
	 */
	ErrorMessagesInfo getErrorMessageByUuid(final String uuid);
	
	/**
	 * Return all saved error message.
	 * 
	 * @return all saved error message.
	 * @should return empty list when no error message are saved in the messagebase.
	 * @should return all saved error message.
	 */
	List<ErrorMessagesInfo> getAllErrorMessage();
	
	/**
	 * Save error message into the messagebase.
	 * 
	 * @param ErrorMessagesInfo the error message.
	 * @return saved error message.
	 * @should save error message into the messagebase.
	 */
	ErrorMessagesInfo saveErrorMessage(final ErrorMessagesInfo ErrorMessagesInfo);
	
	/**
	 * Delete error message from the messagebase.
	 * 
	 * @param ErrorMessagesInfo the error message
	 * @should remove error message from the messagebase
	 */
	void purgeErrorMessage(final ErrorMessagesInfo ErrorMessagesInfo);
	
	/**
	 * Get the total number of the error message in the messagebase with partial matching search
	 * term on the payload.
	 * 
	 * @param search the search term.
	 * @return the total number of the error message in the messagebase.
	 */
	Number countErrorMessage(final String search);
	
	/**
	 * Get error message with matching search term for a particular page.
	 * 
	 * @param search the search term.
	 * @param pageNumber the page number.
	 * @param pageSize the size of the page.
	 * @return list of all error message with matching search term for a particular page.
	 */
	List<ErrorMessagesInfo> getPagedErrorMessage(final String search, final Integer pageNumber, final Integer pageSize);
	
	List<ErrorMessagesInfo> validateData(String uuid, String formData);
	
	List<String> getDiscriminatorTypes();
	
	/**
	 * For a submitted payload the method fetches the associated ErrorData record, updates its
	 * payload with passed UUID whose patient UUID is changed to reflect the duplicate patient's
	 * uuid already in the system. The payload is re-queued with descriminator
	 * "json-update-demographics" instead of the "json-registration". All ErrorData records bearing
	 * the patient UUID in error are also fetched updated and re-queued.
	 * 
	 * @param errorDataUuid String - UUID of ErrorData record with duplicate patient details
	 *            submitted for registration.
	 * @param existingPatientUuid String - uuid for the existing patient.
	 * @param payload String - payload with demographic information to be updated to the existing
	 *            patient.
	 * @return List of QueueData - A list of newly submitted QueuedData.
	 */
	List<AfyaStatQueueData> mergeDuplicatePatient(@NotNull final String errorDataUuid,
	        @NotNull final String existingPatientUuid, @NotNull String payload);
	
	/**
	 * Get formDataStatus for form data with given form data uuid.
	 * 
	 * @param formDataUuid the form data uuid.
	 * @return the formDataStatus for form data with given form data uuid
	 * @should return with status 'archived' if form data was archived
	 * @should return with status 'errored' if form data was placed on error queue
	 * @should return with status 'queued' if form data is on queue waiting to be processed
	 * @should return with status 'unknown' if form data with given formDataUuid cannot be traced
	 */
	FormInfoStatus getFormDataStatusByFormDataUuid(String formDataUuid);
}
