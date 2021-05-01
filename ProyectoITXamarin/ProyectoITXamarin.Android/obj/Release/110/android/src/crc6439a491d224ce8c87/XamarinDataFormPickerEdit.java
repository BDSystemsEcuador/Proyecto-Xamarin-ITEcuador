package crc6439a491d224ce8c87;


public class XamarinDataFormPickerEdit
	extends crc6439a491d224ce8c87.XamarinDataFormEditorBase_2
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.dataForm.protocols.IDXDataFormPickerItem
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_isActive:()Z:GetIsActiveHandler\n" +
			"n_setActive:(Z)V:GetSetActive_ZHandler\n" +
			"n_setPickerDataProvider:(Lcom/devexpress/editors/dataForm/protocols/IDXDataFormPickerDataProvider;)V:GetSetPickerDataProvider_Lcom_devexpress_editors_dataForm_protocols_IDXDataFormPickerDataProvider_Handler:Com.Devexpress.Editors.DataForm.Protocols.IDXDataFormPickerItemInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormPickerEdit, DevExpress.XamarinForms.Editors.Android", XamarinDataFormPickerEdit.class, __md_methods);
	}


	public XamarinDataFormPickerEdit (android.view.View p0)
	{
		super (p0);
		if (getClass () == XamarinDataFormPickerEdit.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormPickerEdit, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public XamarinDataFormPickerEdit (android.view.View p0, android.view.View p1)
	{
		super (p0, p1);
		if (getClass () == XamarinDataFormPickerEdit.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormPickerEdit, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public XamarinDataFormPickerEdit (android.view.View p0, android.view.View p1, boolean p2)
	{
		super (p0, p1, p2);
		if (getClass () == XamarinDataFormPickerEdit.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormPickerEdit, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public XamarinDataFormPickerEdit (android.view.View p0, android.view.View p1, boolean p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == XamarinDataFormPickerEdit.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormPickerEdit, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public XamarinDataFormPickerEdit (android.view.View p0, android.view.View p1, boolean p2, boolean p3, com.devexpress.editors.dataForm.protocols.DXDataFormDisplayTextProvider p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == XamarinDataFormPickerEdit.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormPickerEdit, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib:System.Boolean, mscorlib:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormDisplayTextProvider, DevExpress.Xamarin.Android.Editors", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}


	public XamarinDataFormPickerEdit (android.view.View p0, android.view.View p1, boolean p2, boolean p3, com.devexpress.editors.dataForm.protocols.DXDataFormDisplayTextProvider p4, com.devexpress.editors.dataForm.protocols.DXDataFormEditorItemListener p5)
	{
		super (p0, p1, p2, p3, p4, p5);
		if (getClass () == XamarinDataFormPickerEdit.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormPickerEdit, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib:System.Boolean, mscorlib:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormDisplayTextProvider, DevExpress.Xamarin.Android.Editors:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormEditorItemListener, DevExpress.Xamarin.Android.Editors", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5 });
	}


	public XamarinDataFormPickerEdit (android.view.View p0, android.view.View p1, boolean p2, boolean p3, com.devexpress.editors.dataForm.protocols.DXDataFormDisplayTextProvider p4, com.devexpress.editors.dataForm.protocols.DXDataFormEditorItemListener p5, java.lang.Object p6)
	{
		super (p0, p1, p2, p3, p4, p5, p6);
		if (getClass () == XamarinDataFormPickerEdit.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.Editors.XamarinDataFormPickerEdit, DevExpress.XamarinForms.Editors.Android", "Android.Views.View, Mono.Android:Android.Views.View, Mono.Android:System.Boolean, mscorlib:System.Boolean, mscorlib:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormDisplayTextProvider, DevExpress.Xamarin.Android.Editors:Com.Devexpress.Editors.DataForm.Protocols.DXDataFormEditorItemListener, DevExpress.Xamarin.Android.Editors:Java.Lang.Object, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5, p6 });
	}


	public boolean isActive ()
	{
		return n_isActive ();
	}

	private native boolean n_isActive ();


	public void setActive (boolean p0)
	{
		n_setActive (p0);
	}

	private native void n_setActive (boolean p0);


	public void setPickerDataProvider (com.devexpress.editors.dataForm.protocols.IDXDataFormPickerDataProvider p0)
	{
		n_setPickerDataProvider (p0);
	}

	private native void n_setPickerDataProvider (com.devexpress.editors.dataForm.protocols.IDXDataFormPickerDataProvider p0);

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
