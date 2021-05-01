package mono.com.devexpress.editors;


public class AutoCompleteEdit_QuerySubmittedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.AutoCompleteEdit.QuerySubmittedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onQuerySubmitted:(Lcom/devexpress/editors/AutoCompleteEdit;Ljava/lang/CharSequence;Ljava/lang/Object;)V:GetOnQuerySubmitted_Lcom_devexpress_editors_AutoCompleteEdit_Ljava_lang_CharSequence_Ljava_lang_Object_Handler:DevExpress.Xamarin.Android.Editors.AutoCompleteEdit/IQuerySubmittedListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.AutoCompleteEdit+IQuerySubmittedListenerImplementor, DevExpress.Xamarin.Android.Editors", AutoCompleteEdit_QuerySubmittedListenerImplementor.class, __md_methods);
	}


	public AutoCompleteEdit_QuerySubmittedListenerImplementor ()
	{
		super ();
		if (getClass () == AutoCompleteEdit_QuerySubmittedListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.AutoCompleteEdit+IQuerySubmittedListenerImplementor, DevExpress.Xamarin.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public void onQuerySubmitted (com.devexpress.editors.AutoCompleteEdit p0, java.lang.CharSequence p1, java.lang.Object p2)
	{
		n_onQuerySubmitted (p0, p1, p2);
	}

	private native void n_onQuerySubmitted (com.devexpress.editors.AutoCompleteEdit p0, java.lang.CharSequence p1, java.lang.Object p2);

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
