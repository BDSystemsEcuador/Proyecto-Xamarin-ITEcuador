package mono.com.devexpress.editors;


public class TimeEdit_TimeChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.TimeEdit.TimeChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTimeChanged:(Lcom/devexpress/editors/TimeEdit;Ljava/util/Date;)V:GetOnTimeChanged_Lcom_devexpress_editors_TimeEdit_Ljava_util_Date_Handler:DevExpress.Xamarin.Android.Editors.TimeEdit/ITimeChangedListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.TimeEdit+ITimeChangedListenerImplementor, DevExpress.Xamarin.Android.Editors", TimeEdit_TimeChangedListenerImplementor.class, __md_methods);
	}


	public TimeEdit_TimeChangedListenerImplementor ()
	{
		super ();
		if (getClass () == TimeEdit_TimeChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.TimeEdit+ITimeChangedListenerImplementor, DevExpress.Xamarin.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public void onTimeChanged (com.devexpress.editors.TimeEdit p0, java.util.Date p1)
	{
		n_onTimeChanged (p0, p1);
	}

	private native void n_onTimeChanged (com.devexpress.editors.TimeEdit p0, java.util.Date p1);

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
