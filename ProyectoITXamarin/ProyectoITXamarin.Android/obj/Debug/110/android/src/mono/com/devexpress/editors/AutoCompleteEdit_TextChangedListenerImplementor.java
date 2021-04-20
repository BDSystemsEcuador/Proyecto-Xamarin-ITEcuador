package mono.com.devexpress.editors;


public class AutoCompleteEdit_TextChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.AutoCompleteEdit.TextChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTextChanged:(Lcom/devexpress/editors/AutoCompleteEdit;I)V:GetOnTextChanged_Lcom_devexpress_editors_AutoCompleteEdit_IHandler:DevExpress.Xamarin.Android.Editors.AutoCompleteEdit/ITextChangedListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.AutoCompleteEdit+ITextChangedListenerImplementor, DevExpress.Xamarin.Android.Editors", AutoCompleteEdit_TextChangedListenerImplementor.class, __md_methods);
	}


	public AutoCompleteEdit_TextChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AutoCompleteEdit_TextChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.AutoCompleteEdit+ITextChangedListenerImplementor, DevExpress.Xamarin.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public void onTextChanged (com.devexpress.editors.AutoCompleteEdit p0, int p1)
	{
		n_onTextChanged (p0, p1);
	}

	private native void n_onTextChanged (com.devexpress.editors.AutoCompleteEdit p0, int p1);

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
