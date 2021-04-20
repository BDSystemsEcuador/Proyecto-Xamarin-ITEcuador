package crc64e58ce59a6d1a044d;


public class PlatformCultureService
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.PlatformCultureService, DevExpress.XamarinForms.Editors.Android", PlatformCultureService.class, __md_methods);
	}


	public PlatformCultureService ()
	{
		super ();
		if (getClass () == PlatformCultureService.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.PlatformCultureService, DevExpress.XamarinForms.Editors.Android", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
