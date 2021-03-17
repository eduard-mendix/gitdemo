// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class Query
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject queryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.Query";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Done("Done"),
		Encoding("Encoding"),
		MaxBatchSize("MaxBatchSize"),
		TotalSize("TotalSize"),
		NextRecordsUrl("NextRecordsUrl"),
		AllOrNone("AllOrNone"),
		Query("Query"),
		QueryResults("QueryResults"),
		StartDate("StartDate"),
		EndDate("EndDate"),
		EarliestDateAvailable("EarliestDateAvailable"),
		LatestDateCovered("LatestDateCovered"),
		Records_Query("Salesforce_Connector.Records_Query"),
		Query_Query("Salesforce_Connector.Query_Query");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Query(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.Query"));
	}

	protected Query(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject queryMendixObject)
	{
		if (queryMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Query", queryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.Query");

		this.queryMendixObject = queryMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Query.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.Query initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.Query.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.Query initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.Query(context, mendixObject);
	}

	public static salesforce_connector.proxies.Query load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.Query.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Done
	 */
	public final java.lang.Boolean getDone()
	{
		return getDone(getContext());
	}

	/**
	 * @param context
	 * @return value of Done
	 */
	public final java.lang.Boolean getDone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Done.toString());
	}

	/**
	 * Set value of Done
	 * @param done
	 */
	public final void setDone(java.lang.Boolean done)
	{
		setDone(getContext(), done);
	}

	/**
	 * Set value of Done
	 * @param context
	 * @param done
	 */
	public final void setDone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean done)
	{
		getMendixObject().setValue(context, MemberNames.Done.toString(), done);
	}

	/**
	 * @return value of Encoding
	 */
	public final java.lang.String getEncoding()
	{
		return getEncoding(getContext());
	}

	/**
	 * @param context
	 * @return value of Encoding
	 */
	public final java.lang.String getEncoding(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Encoding.toString());
	}

	/**
	 * Set value of Encoding
	 * @param encoding
	 */
	public final void setEncoding(java.lang.String encoding)
	{
		setEncoding(getContext(), encoding);
	}

	/**
	 * Set value of Encoding
	 * @param context
	 * @param encoding
	 */
	public final void setEncoding(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String encoding)
	{
		getMendixObject().setValue(context, MemberNames.Encoding.toString(), encoding);
	}

	/**
	 * @return value of MaxBatchSize
	 */
	public final java.lang.Integer getMaxBatchSize()
	{
		return getMaxBatchSize(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxBatchSize
	 */
	public final java.lang.Integer getMaxBatchSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaxBatchSize.toString());
	}

	/**
	 * Set value of MaxBatchSize
	 * @param maxbatchsize
	 */
	public final void setMaxBatchSize(java.lang.Integer maxbatchsize)
	{
		setMaxBatchSize(getContext(), maxbatchsize);
	}

	/**
	 * Set value of MaxBatchSize
	 * @param context
	 * @param maxbatchsize
	 */
	public final void setMaxBatchSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maxbatchsize)
	{
		getMendixObject().setValue(context, MemberNames.MaxBatchSize.toString(), maxbatchsize);
	}

	/**
	 * @return value of TotalSize
	 */
	public final java.lang.Integer getTotalSize()
	{
		return getTotalSize(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalSize
	 */
	public final java.lang.Integer getTotalSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TotalSize.toString());
	}

	/**
	 * Set value of TotalSize
	 * @param totalsize
	 */
	public final void setTotalSize(java.lang.Integer totalsize)
	{
		setTotalSize(getContext(), totalsize);
	}

	/**
	 * Set value of TotalSize
	 * @param context
	 * @param totalsize
	 */
	public final void setTotalSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer totalsize)
	{
		getMendixObject().setValue(context, MemberNames.TotalSize.toString(), totalsize);
	}

	/**
	 * @return value of NextRecordsUrl
	 */
	public final java.lang.String getNextRecordsUrl()
	{
		return getNextRecordsUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of NextRecordsUrl
	 */
	public final java.lang.String getNextRecordsUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NextRecordsUrl.toString());
	}

	/**
	 * Set value of NextRecordsUrl
	 * @param nextrecordsurl
	 */
	public final void setNextRecordsUrl(java.lang.String nextrecordsurl)
	{
		setNextRecordsUrl(getContext(), nextrecordsurl);
	}

	/**
	 * Set value of NextRecordsUrl
	 * @param context
	 * @param nextrecordsurl
	 */
	public final void setNextRecordsUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nextrecordsurl)
	{
		getMendixObject().setValue(context, MemberNames.NextRecordsUrl.toString(), nextrecordsurl);
	}

	/**
	 * @return value of AllOrNone
	 */
	public final java.lang.Boolean getAllOrNone()
	{
		return getAllOrNone(getContext());
	}

	/**
	 * @param context
	 * @return value of AllOrNone
	 */
	public final java.lang.Boolean getAllOrNone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllOrNone.toString());
	}

	/**
	 * Set value of AllOrNone
	 * @param allornone
	 */
	public final void setAllOrNone(java.lang.Boolean allornone)
	{
		setAllOrNone(getContext(), allornone);
	}

	/**
	 * Set value of AllOrNone
	 * @param context
	 * @param allornone
	 */
	public final void setAllOrNone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allornone)
	{
		getMendixObject().setValue(context, MemberNames.AllOrNone.toString(), allornone);
	}

	/**
	 * @return value of Query
	 */
	public final java.lang.String getQuery()
	{
		return getQuery(getContext());
	}

	/**
	 * @param context
	 * @return value of Query
	 */
	public final java.lang.String getQuery(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Query.toString());
	}

	/**
	 * Set value of Query
	 * @param query
	 */
	public final void setQuery(java.lang.String query)
	{
		setQuery(getContext(), query);
	}

	/**
	 * Set value of Query
	 * @param context
	 * @param query
	 */
	public final void setQuery(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String query)
	{
		getMendixObject().setValue(context, MemberNames.Query.toString(), query);
	}

	/**
	 * @return value of QueryResults
	 */
	public final java.lang.String getQueryResults()
	{
		return getQueryResults(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryResults
	 */
	public final java.lang.String getQueryResults(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QueryResults.toString());
	}

	/**
	 * Set value of QueryResults
	 * @param queryresults
	 */
	public final void setQueryResults(java.lang.String queryresults)
	{
		setQueryResults(getContext(), queryresults);
	}

	/**
	 * Set value of QueryResults
	 * @param context
	 * @param queryresults
	 */
	public final void setQueryResults(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String queryresults)
	{
		getMendixObject().setValue(context, MemberNames.QueryResults.toString(), queryresults);
	}

	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * @return value of EarliestDateAvailable
	 */
	public final java.util.Date getEarliestDateAvailable()
	{
		return getEarliestDateAvailable(getContext());
	}

	/**
	 * @param context
	 * @return value of EarliestDateAvailable
	 */
	public final java.util.Date getEarliestDateAvailable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EarliestDateAvailable.toString());
	}

	/**
	 * Set value of EarliestDateAvailable
	 * @param earliestdateavailable
	 */
	public final void setEarliestDateAvailable(java.util.Date earliestdateavailable)
	{
		setEarliestDateAvailable(getContext(), earliestdateavailable);
	}

	/**
	 * Set value of EarliestDateAvailable
	 * @param context
	 * @param earliestdateavailable
	 */
	public final void setEarliestDateAvailable(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date earliestdateavailable)
	{
		getMendixObject().setValue(context, MemberNames.EarliestDateAvailable.toString(), earliestdateavailable);
	}

	/**
	 * @return value of LatestDateCovered
	 */
	public final java.util.Date getLatestDateCovered()
	{
		return getLatestDateCovered(getContext());
	}

	/**
	 * @param context
	 * @return value of LatestDateCovered
	 */
	public final java.util.Date getLatestDateCovered(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LatestDateCovered.toString());
	}

	/**
	 * Set value of LatestDateCovered
	 * @param latestdatecovered
	 */
	public final void setLatestDateCovered(java.util.Date latestdatecovered)
	{
		setLatestDateCovered(getContext(), latestdatecovered);
	}

	/**
	 * Set value of LatestDateCovered
	 * @param context
	 * @param latestdatecovered
	 */
	public final void setLatestDateCovered(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date latestdatecovered)
	{
		getMendixObject().setValue(context, MemberNames.LatestDateCovered.toString(), latestdatecovered);
	}

	/**
	 * @return value of Records_Query
	 */
	public final salesforce_connector.proxies.Records getRecords_Query() throws com.mendix.core.CoreException
	{
		return getRecords_Query(getContext());
	}

	/**
	 * @param context
	 * @return value of Records_Query
	 */
	public final salesforce_connector.proxies.Records getRecords_Query(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Records result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Records_Query.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Records.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Records_Query
	 * @param records_query
	 */
	public final void setRecords_Query(salesforce_connector.proxies.Records records_query)
	{
		setRecords_Query(getContext(), records_query);
	}

	/**
	 * Set value of Records_Query
	 * @param context
	 * @param records_query
	 */
	public final void setRecords_Query(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Records records_query)
	{
		if (records_query == null)
			getMendixObject().setValue(context, MemberNames.Records_Query.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Records_Query.toString(), records_query.getMendixObject().getId());
	}

	/**
	 * @return value of Query_Query
	 */
	public final salesforce_connector.proxies.Query getQuery_Query() throws com.mendix.core.CoreException
	{
		return getQuery_Query(getContext());
	}

	/**
	 * @param context
	 * @return value of Query_Query
	 */
	public final salesforce_connector.proxies.Query getQuery_Query(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Query result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Query_Query.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Query.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Query_Query
	 * @param query_query
	 */
	public final void setQuery_Query(salesforce_connector.proxies.Query query_query)
	{
		setQuery_Query(getContext(), query_query);
	}

	/**
	 * Set value of Query_Query
	 * @param context
	 * @param query_query
	 */
	public final void setQuery_Query(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Query query_query)
	{
		if (query_query == null)
			getMendixObject().setValue(context, MemberNames.Query_Query.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Query_Query.toString(), query_query.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return queryMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final salesforce_connector.proxies.Query that = (salesforce_connector.proxies.Query) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Salesforce_Connector.Query";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
