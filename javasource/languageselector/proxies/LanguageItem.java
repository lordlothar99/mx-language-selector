// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package languageselector.proxies;

public class LanguageItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject languageItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "LanguageSelector.LanguageItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Code("Code"),
		LanguageItem_Language("LanguageSelector.LanguageItem_Language");

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

	public LanguageItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "LanguageSelector.LanguageItem"));
	}

	protected LanguageItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject languageItemMendixObject)
	{
		if (languageItemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("LanguageSelector.LanguageItem", languageItemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a LanguageSelector.LanguageItem");

		this.languageItemMendixObject = languageItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LanguageItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static languageselector.proxies.LanguageItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return languageselector.proxies.LanguageItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static languageselector.proxies.LanguageItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new languageselector.proxies.LanguageItem(context, mendixObject);
	}

	public static languageselector.proxies.LanguageItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return languageselector.proxies.LanguageItem.initialize(context, mendixObject);
	}

	public static java.util.List<languageselector.proxies.LanguageItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<languageselector.proxies.LanguageItem> result = new java.util.ArrayList<languageselector.proxies.LanguageItem>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//LanguageSelector.LanguageItem" + xpathConstraint))
			result.add(languageselector.proxies.LanguageItem.initialize(context, obj));
		return result;
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
	 * @return value of Code
	 */
	public final java.lang.String getCode()
	{
		return getCode(getContext());
	}

	/**
	 * @param context
	 * @return value of Code
	 */
	public final java.lang.String getCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Code.toString());
	}

	/**
	 * Set value of Code
	 * @param code
	 */
	public final void setCode(java.lang.String code)
	{
		setCode(getContext(), code);
	}

	/**
	 * Set value of Code
	 * @param context
	 * @param code
	 */
	public final void setCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String code)
	{
		getMendixObject().setValue(context, MemberNames.Code.toString(), code);
	}

	/**
	 * @return value of LanguageItem_Language
	 */
	public final system.proxies.Language getLanguageItem_Language() throws com.mendix.core.CoreException
	{
		return getLanguageItem_Language(getContext());
	}

	/**
	 * @param context
	 * @return value of LanguageItem_Language
	 */
	public final system.proxies.Language getLanguageItem_Language(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Language result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LanguageItem_Language.toString());
		if (identifier != null)
			result = system.proxies.Language.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LanguageItem_Language
	 * @param languageitem_language
	 */
	public final void setLanguageItem_Language(system.proxies.Language languageitem_language)
	{
		setLanguageItem_Language(getContext(), languageitem_language);
	}

	/**
	 * Set value of LanguageItem_Language
	 * @param context
	 * @param languageitem_language
	 */
	public final void setLanguageItem_Language(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Language languageitem_language)
	{
		if (languageitem_language == null)
			getMendixObject().setValue(context, MemberNames.LanguageItem_Language.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LanguageItem_Language.toString(), languageitem_language.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return languageItemMendixObject;
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
			final languageselector.proxies.LanguageItem that = (languageselector.proxies.LanguageItem) obj;
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
		return "LanguageSelector.LanguageItem";
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
