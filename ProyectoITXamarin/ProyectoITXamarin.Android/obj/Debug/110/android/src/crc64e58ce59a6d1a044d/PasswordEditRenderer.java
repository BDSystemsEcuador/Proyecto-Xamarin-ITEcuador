package crc64e58ce59a6d1a044d;


public class PasswordEditRenderer
	extends crc64e58ce59a6d1a044d.TextEditRendererBase_3
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.PasswordEditRenderer, DevExpress.XamarinForms.Editors.Android", PasswordEditRenderer.class, __md_methods);
	}


	public PasswordEditRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == PasswordEditRenderer.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.PasswordEditRenderer, DevExpress.XamarinForms.Editors.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public PasswordEditRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == PasswordEditRenderer.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.PasswordEditRenderer, DevExpress.XamarinForms.Editors.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public PasswordEditRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == PasswordEditRenderer.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.PasswordEditRenderer, DevExpress.XamarinForms.Editors.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
