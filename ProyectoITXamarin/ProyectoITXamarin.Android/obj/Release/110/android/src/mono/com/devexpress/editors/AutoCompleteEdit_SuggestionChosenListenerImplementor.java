package mono.com.devexpress.editors;


public class AutoCompleteEdit_SuggestionChosenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.AutoCompleteEdit.SuggestionChosenListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSuggestionChosen:(Lcom/devexpress/editors/AutoCompleteEdit;Ljava/lang/Object;)V:GetOnSuggestionChosen_Lcom_devexpress_editors_AutoCompleteEdit_Ljava_lang_Object_Handler:DevExpress.Xamarin.Android.Editors.AutoCompleteEdit/ISuggestionChosenListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.AutoCompleteEdit+ISuggestionChosenListenerImplementor, DevExpress.Xamarin.Android.Editors", AutoCompleteEdit_SuggestionChosenListenerImplementor.class, __md_methods);
	}


	public AutoCompleteEdit_SuggestionChosenListenerImplementor ()
	{
		super ();
		if (getClass () == AutoCompleteEdit_SuggestionChosenListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.AutoCompleteEdit+ISuggestionChosenListenerImplementor, DevExpress.Xamarin.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public void onSuggestionChosen (com.devexpress.editors.AutoCompleteEdit p0, java.lang.Object p1)
	{
		n_onSuggestionChosen (p0, p1);
	}

	private native void n_onSuggestionChosen (com.devexpress.editors.AutoCompleteEdit p0, java.lang.Object p1);

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
