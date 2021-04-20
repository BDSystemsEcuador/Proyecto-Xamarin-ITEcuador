package mono.com.devexpress.editors;


public class OnEditActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.OnEditActionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEditorAction:(I)Z:GetOnEditorAction_IHandler:DevExpress.Xamarin.Android.Editors.IOnEditActionListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.IOnEditActionListenerImplementor, DevExpress.Xamarin.Android.Editors", OnEditActionListenerImplementor.class, __md_methods);
	}


	public OnEditActionListenerImplementor ()
	{
		super ();
		if (getClass () == OnEditActionListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.IOnEditActionListenerImplementor, DevExpress.Xamarin.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public boolean onEditorAction (int p0)
	{
		return n_onEditorAction (p0);
	}

	private native boolean n_onEditorAction (int p0);

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
