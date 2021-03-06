// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package taskqueuehelpers.proxies;

public class CreateTaskParameters
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject createTaskParametersMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TaskQueueHelpers.CreateTaskParameters";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Successful("Successful"),
		NonSuccessful("NonSuccessful"),
		Sort("Sort");

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

	public CreateTaskParameters(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TaskQueueHelpers.CreateTaskParameters"));
	}

	protected CreateTaskParameters(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject createTaskParametersMendixObject)
	{
		if (createTaskParametersMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TaskQueueHelpers.CreateTaskParameters", createTaskParametersMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TaskQueueHelpers.CreateTaskParameters");

		this.createTaskParametersMendixObject = createTaskParametersMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CreateTaskParameters.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static taskqueuehelpers.proxies.CreateTaskParameters initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return taskqueuehelpers.proxies.CreateTaskParameters.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static taskqueuehelpers.proxies.CreateTaskParameters initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new taskqueuehelpers.proxies.CreateTaskParameters(context, mendixObject);
	}

	public static taskqueuehelpers.proxies.CreateTaskParameters load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return taskqueuehelpers.proxies.CreateTaskParameters.initialize(context, mendixObject);
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
	 * @return value of Successful
	 */
	public final java.lang.Boolean getSuccessful()
	{
		return getSuccessful(getContext());
	}

	/**
	 * @param context
	 * @return value of Successful
	 */
	public final java.lang.Boolean getSuccessful(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Successful.toString());
	}

	/**
	 * Set value of Successful
	 * @param successful
	 */
	public final void setSuccessful(java.lang.Boolean successful)
	{
		setSuccessful(getContext(), successful);
	}

	/**
	 * Set value of Successful
	 * @param context
	 * @param successful
	 */
	public final void setSuccessful(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean successful)
	{
		getMendixObject().setValue(context, MemberNames.Successful.toString(), successful);
	}

	/**
	 * @return value of NonSuccessful
	 */
	public final java.lang.Boolean getNonSuccessful()
	{
		return getNonSuccessful(getContext());
	}

	/**
	 * @param context
	 * @return value of NonSuccessful
	 */
	public final java.lang.Boolean getNonSuccessful(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.NonSuccessful.toString());
	}

	/**
	 * Set value of NonSuccessful
	 * @param nonsuccessful
	 */
	public final void setNonSuccessful(java.lang.Boolean nonsuccessful)
	{
		setNonSuccessful(getContext(), nonsuccessful);
	}

	/**
	 * Set value of NonSuccessful
	 * @param context
	 * @param nonsuccessful
	 */
	public final void setNonSuccessful(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean nonsuccessful)
	{
		getMendixObject().setValue(context, MemberNames.NonSuccessful.toString(), nonsuccessful);
	}

	/**
	 * @return value of Sort
	 */
	public final java.lang.Boolean getSort()
	{
		return getSort(getContext());
	}

	/**
	 * @param context
	 * @return value of Sort
	 */
	public final java.lang.Boolean getSort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Sort.toString());
	}

	/**
	 * Set value of Sort
	 * @param sort
	 */
	public final void setSort(java.lang.Boolean sort)
	{
		setSort(getContext(), sort);
	}

	/**
	 * Set value of Sort
	 * @param context
	 * @param sort
	 */
	public final void setSort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean sort)
	{
		getMendixObject().setValue(context, MemberNames.Sort.toString(), sort);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return createTaskParametersMendixObject;
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
			final taskqueuehelpers.proxies.CreateTaskParameters that = (taskqueuehelpers.proxies.CreateTaskParameters) obj;
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
		return "TaskQueueHelpers.CreateTaskParameters";
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
