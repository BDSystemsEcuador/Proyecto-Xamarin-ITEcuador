package crc643542ea94a76fed83;


public class SwipeButtonAction
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxgrid.providers.SwipeButtonAction
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTap:(I)V:GetOnTap_IHandler:DevExpress.XamarinAndroid.Grid.ISwipeButtonActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.DataGrid.Android.NativeBridge.SwipeButtonAction, DevExpress.XamarinForms.Grid.Android", SwipeButtonAction.class, __md_methods);
	}


	public SwipeButtonAction ()
	{
		super ();
		if (getClass () == SwipeButtonAction.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.DataGrid.Android.NativeBridge.SwipeButtonAction, DevExpress.XamarinForms.Grid.Android", "", this, new java.lang.Object[] {  });
	}


	public void onTap (int p0)
	{
		n_onTap (p0);
	}

	private native void n_onTap (int p0);

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
