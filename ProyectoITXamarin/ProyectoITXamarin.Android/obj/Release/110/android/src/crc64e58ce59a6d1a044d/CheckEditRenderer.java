package crc64e58ce59a6d1a044d;


public class CheckEditRenderer
	extends crc643f46942d9dd1fff9.ViewRenderer_2
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.CheckEdit.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onValueChanged:(Lcom/devexpress/editors/CheckEdit;I)V:GetOnValueChanged_Lcom_devexpress_editors_CheckEdit_IHandler:DevExpress.Xamarin.Android.Editors.CheckEdit/IListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.CheckEditRenderer, DevExpress.XamarinForms.Editors.Android", CheckEditRenderer.class, __md_methods);
	}


	public CheckEditRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CheckEditRenderer.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.CheckEditRenderer, DevExpress.XamarinForms.Editors.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CheckEditRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CheckEditRenderer.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.CheckEditRenderer, DevExpress.XamarinForms.Editors.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CheckEditRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CheckEditRenderer.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.CheckEditRenderer, DevExpress.XamarinForms.Editors.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onValueChanged (com.devexpress.editors.CheckEdit p0, int p1)
	{
		n_onValueChanged (p0, p1);
	}

	private native void n_onValueChanged (com.devexpress.editors.CheckEdit p0, int p1);

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
