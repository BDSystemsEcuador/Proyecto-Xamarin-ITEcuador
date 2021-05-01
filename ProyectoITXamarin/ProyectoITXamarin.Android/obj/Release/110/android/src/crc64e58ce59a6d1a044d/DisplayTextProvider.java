package crc64e58ce59a6d1a044d;


public class DisplayTextProvider
	extends com.devexpress.editors.DisplayTextProvider
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getFormattedText:()Ljava/lang/String;:GetGetFormattedTextHandler\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.DisplayTextProvider, DevExpress.XamarinForms.Editors.Android", DisplayTextProvider.class, __md_methods);
	}


	public DisplayTextProvider ()
	{
		super ();
		if (getClass () == DisplayTextProvider.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DisplayTextProvider, DevExpress.XamarinForms.Editors.Android", "", this, new java.lang.Object[] {  });
	}


	public java.lang.String getFormattedText ()
	{
		return n_getFormattedText ();
	}

	private native java.lang.String n_getFormattedText ();

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
