package mono.com.devexpress.editors;


public class OnDataFromChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.OnDataFromChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_groupCollapseChanged:(IZ)V:GetGroupCollapseChanged_IZHandler:DevExpress.Xamarin.Android.Editors.IOnDataFromChangedListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"n_sizeChanged:(Lcom/devexpress/editors/DataFormView;)V:GetSizeChanged_Lcom_devexpress_editors_DataFormView_Handler:DevExpress.Xamarin.Android.Editors.IOnDataFromChangedListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.IOnDataFromChangedListenerImplementor, DevExpress.Xamarin.Android.Editors", OnDataFromChangedListenerImplementor.class, __md_methods);
	}


	public OnDataFromChangedListenerImplementor ()
	{
		super ();
		if (getClass () == OnDataFromChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.IOnDataFromChangedListenerImplementor, DevExpress.Xamarin.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public void groupCollapseChanged (int p0, boolean p1)
	{
		n_groupCollapseChanged (p0, p1);
	}

	private native void n_groupCollapseChanged (int p0, boolean p1);


	public void sizeChanged (com.devexpress.editors.DataFormView p0)
	{
		n_sizeChanged (p0);
	}

	private native void n_sizeChanged (com.devexpress.editors.DataFormView p0);

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
