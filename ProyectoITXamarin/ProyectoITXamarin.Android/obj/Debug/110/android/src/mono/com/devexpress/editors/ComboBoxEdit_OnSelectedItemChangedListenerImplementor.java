package mono.com.devexpress.editors;


public class ComboBoxEdit_OnSelectedItemChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.ComboBoxEdit.OnSelectedItemChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelectedItemChanged:(Lcom/devexpress/editors/ComboBoxEdit;Ljava/lang/Object;I)V:GetOnSelectedItemChanged_Lcom_devexpress_editors_ComboBoxEdit_Ljava_lang_Object_IHandler:DevExpress.Xamarin.Android.Editors.ComboBoxEdit/IOnSelectedItemChangedListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.ComboBoxEdit+IOnSelectedItemChangedListenerImplementor, DevExpress.Xamarin.Android.Editors", ComboBoxEdit_OnSelectedItemChangedListenerImplementor.class, __md_methods);
	}


	public ComboBoxEdit_OnSelectedItemChangedListenerImplementor ()
	{
		super ();
		if (getClass () == ComboBoxEdit_OnSelectedItemChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.ComboBoxEdit+IOnSelectedItemChangedListenerImplementor, DevExpress.Xamarin.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public void onSelectedItemChanged (com.devexpress.editors.ComboBoxEdit p0, java.lang.Object p1, int p2)
	{
		n_onSelectedItemChanged (p0, p1, p2);
	}

	private native void n_onSelectedItemChanged (com.devexpress.editors.ComboBoxEdit p0, java.lang.Object p1, int p2);

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
