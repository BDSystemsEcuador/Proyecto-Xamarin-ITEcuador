package crc648a6528da278f03de;


public class MultilineSettings
	extends crc648a6528da278f03de.TextSettings
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.DataForm.MultilineSettings, DevExpress.XamarinForms.Editors.Android", MultilineSettings.class, __md_methods);
	}


	public MultilineSettings ()
	{
		super ();
		if (getClass () == MultilineSettings.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.MultilineSettings, DevExpress.XamarinForms.Editors.Android", "", this, new java.lang.Object[] {  });
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
