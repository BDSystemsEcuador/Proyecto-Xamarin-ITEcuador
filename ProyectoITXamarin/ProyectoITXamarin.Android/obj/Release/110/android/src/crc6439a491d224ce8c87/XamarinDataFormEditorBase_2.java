package crc6439a491d224ce8c87;


public abstract class XamarinDataFormEditorBase_2
	extends com.devexpress.editors.dataForm.protocols.DXDataFormEditorItem
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_isReadOnly:()Z:GetIsReadOnlyHandler\n" +
			"n_setReadOnly:(Z)V:GetSetReadOnly_ZHandler\n" +
			"n_getContainerView:()Landroid/view/View;:GetGetContainerViewHandler\n" +
			"n_setContainerView:(Landroid/view/View;)V:GetSetContainerView_Landroid_view_View_Handler\n" +
			"n_getView:()Landroid/view/View;:GetGetViewHandler\n" +
			"n_setView:(Landroid/view/View;)V:GetSetView_Landroid_view_View_Handler\n" +
			"n_getValue:()Ljava/lang/Object;:GetGetValueHandler\n" +
			"n_setValue:(Ljava/lang/Object;)V:GetSetValue_Ljava_lang_Object_Handler\n" +
			"n_configure:(Ljava/lang/Object;)V:GetConfigure_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormEditorBase`2, DevExpress.XamarinForms.Editors.Android", XamarinDataFormEditorBase_2.class, __md_methods);
	}


	public XamarinDataFormEditorBase_2 (android.view.View p0)
	{
		super (p0);
		if (getClass () == XamarinDataFormEditorBase_2.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormEditorBase`2, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public XamarinDataFormEditorBase_2 (android.view.View p0, android.view.View p1)
	{
		super (p0, p1);
		if (getClass () == XamarinDataFormEditorBase_2.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormEditorBase`2, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public XamarinDataFormEditorBase_2 (android.view.View p0, android.view.View p1, boolean p2)
	{
		super (p0, p1, p2);
		if (getClass () == XamarinDataFormEditorBase_2.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormEditorBase`2, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public XamarinDataFormEditorBase_2 (android.view.View p0, android.view.View p1, boolean p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == XamarinDataFormEditorBase_2.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormEditorBase`2, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public XamarinDataFormEditorBase_2 (android.view.View p0, android.view.View p1, boolean p2, boolean p3, com.devexpress.editors.dataForm.protocols.DXDataFormDisplayTextProvider p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == XamarinDataFormEditorBase_2.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormEditorBase`2, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib:System.Boolean, mscorlib:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormDisplayTextProvider, DevExpress.Xamarin.Android.Editors", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}


	public XamarinDataFormEditorBase_2 (android.view.View p0, android.view.View p1, boolean p2, boolean p3, com.devexpress.editors.dataForm.protocols.DXDataFormDisplayTextProvider p4, com.devexpress.editors.dataForm.protocols.DXDataFormEditorItemListener p5)
	{
		super (p0, p1, p2, p3, p4, p5);
		if (getClass () == XamarinDataFormEditorBase_2.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormEditorBase`2, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib:System.Boolean, mscorlib:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormDisplayTextProvider, DevExpress.Xamarin.Android.Editors:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormEditorItemListener, DevExpress.Xamarin.Android.Editors", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5 });
	}


	public XamarinDataFormEditorBase_2 (android.view.View p0, android.view.View p1, boolean p2, boolean p3, com.devexpress.editors.dataForm.protocols.DXDataFormDisplayTextProvider p4, com.devexpress.editors.dataForm.protocols.DXDataFormEditorItemListener p5, java.lang.Object p6)
	{
		super (p0, p1, p2, p3, p4, p5, p6);
		if (getClass () == XamarinDataFormEditorBase_2.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormEditorBase`2, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib:System.Boolean, mscorlib:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormDisplayTextProvider, DevExpress.Xamarin.Android.Editors:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormEditorItemListener, DevExpress.Xamarin.Android.Editors:Java.Lang.Object, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5, p6 });
	}


	public boolean isReadOnly ()
	{
		return n_isReadOnly ();
	}

	private native boolean n_isReadOnly ();


	public void setReadOnly (boolean p0)
	{
		n_setReadOnly (p0);
	}

	private native void n_setReadOnly (boolean p0);


	public android.view.View getContainerView ()
	{
		return n_getContainerView ();
	}

	private native android.view.View n_getContainerView ();


	public void setContainerView (android.view.View p0)
	{
		n_setContainerView (p0);
	}

	private native void n_setContainerView (android.view.View p0);


	public android.view.View getView ()
	{
		return n_getView ();
	}

	private native android.view.View n_getView ();


	public void setView (android.view.View p0)
	{
		n_setView (p0);
	}

	private native void n_setView (android.view.View p0);


	public java.lang.Object getValue ()
	{
		return n_getValue ();
	}

	private native java.lang.Object n_getValue ();


	public void setValue (java.lang.Object p0)
	{
		n_setValue (p0);
	}

	private native void n_setValue (java.lang.Object p0);


	public void configure (java.lang.Object p0)
	{
		n_configure (p0);
	}

	private native void n_configure (java.lang.Object p0);

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
