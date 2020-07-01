// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package languageselector.proxies;

public class LanguageSelector
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject languageSelectorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "LanguageSelector.LanguageSelector";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LanguageSelector_LanguageItem("LanguageSelector.LanguageSelector_LanguageItem"),
		LanguageSelector_User("LanguageSelector.LanguageSelector_User");

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

	public LanguageSelector(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "LanguageSelector.LanguageSelector"));
	}

	protected LanguageSelector(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject languageSelectorMendixObject)
	{
		if (languageSelectorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("LanguageSelector.LanguageSelector", languageSelectorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a LanguageSelector.LanguageSelector");

		this.languageSelectorMendixObject = languageSelectorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LanguageSelector.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static languageselector.proxies.LanguageSelector initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return languageselector.proxies.LanguageSelector.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static languageselector.proxies.LanguageSelector initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new languageselector.proxies.LanguageSelector(context, mendixObject);
	}

	public static languageselector.proxies.LanguageSelector load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return languageselector.proxies.LanguageSelector.initialize(context, mendixObject);
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
	 * @return value of LanguageSelector_LanguageItem
	 */
	public final languageselector.proxies.LanguageItem getLanguageSelector_LanguageItem() throws com.mendix.core.CoreException
	{
		return getLanguageSelector_LanguageItem(getContext());
	}

	/**
	 * @param context
	 * @return value of LanguageSelector_LanguageItem
	 */
	public final languageselector.proxies.LanguageItem getLanguageSelector_LanguageItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		languageselector.proxies.LanguageItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LanguageSelector_LanguageItem.toString());
		if (identifier != null)
			result = languageselector.proxies.LanguageItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LanguageSelector_LanguageItem
	 * @param languageselector_languageitem
	 */
	public final void setLanguageSelector_LanguageItem(languageselector.proxies.LanguageItem languageselector_languageitem)
	{
		setLanguageSelector_LanguageItem(getContext(), languageselector_languageitem);
	}

	/**
	 * Set value of LanguageSelector_LanguageItem
	 * @param context
	 * @param languageselector_languageitem
	 */
	public final void setLanguageSelector_LanguageItem(com.mendix.systemwideinterfaces.core.IContext context, languageselector.proxies.LanguageItem languageselector_languageitem)
	{
		if (languageselector_languageitem == null)
			getMendixObject().setValue(context, MemberNames.LanguageSelector_LanguageItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LanguageSelector_LanguageItem.toString(), languageselector_languageitem.getMendixObject().getId());
	}

	/**
	 * @return value of LanguageSelector_User
	 */
	public final system.proxies.User getLanguageSelector_User() throws com.mendix.core.CoreException
	{
		return getLanguageSelector_User(getContext());
	}

	/**
	 * @param context
	 * @return value of LanguageSelector_User
	 */
	public final system.proxies.User getLanguageSelector_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LanguageSelector_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LanguageSelector_User
	 * @param languageselector_user
	 */
	public final void setLanguageSelector_User(system.proxies.User languageselector_user)
	{
		setLanguageSelector_User(getContext(), languageselector_user);
	}

	/**
	 * Set value of LanguageSelector_User
	 * @param context
	 * @param languageselector_user
	 */
	public final void setLanguageSelector_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User languageselector_user)
	{
		if (languageselector_user == null)
			getMendixObject().setValue(context, MemberNames.LanguageSelector_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LanguageSelector_User.toString(), languageselector_user.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return languageSelectorMendixObject;
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
			final languageselector.proxies.LanguageSelector that = (languageselector.proxies.LanguageSelector) obj;
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
		return "LanguageSelector.LanguageSelector";
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
