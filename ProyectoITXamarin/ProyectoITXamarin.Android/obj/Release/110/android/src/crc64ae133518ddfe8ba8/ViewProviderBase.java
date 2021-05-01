package crc64ae133518ddfe8ba8;


public class ViewProviderBase
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.DataGrid.Android.ViewProviderBase, DevExpress.XamarinForms.Grid.Android", ViewProviderBase.class, __md_methods);
	}


	public ViewProviderBase ()
	{
		super ();
		if (getClass () == ViewProviderBase.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.DataGrid.Android.ViewProviderBase, DevExpress.XamarinForms.Grid.Android", "", this, new java.lang.Object[] {  });
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
