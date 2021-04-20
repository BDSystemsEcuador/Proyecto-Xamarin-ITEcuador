package crc648a6528da278f03de;


public class XamarinEditorsCreator
	extends com.devexpress.editors.dataForm.protocols.DataFormEditorFactory
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_create:(Landroid/content/Context;Lcom/devexpress/editors/dataForm/protocols/EditorType;)Lcom/devexpress/editors/dataForm/protocols/DXDataFormEditorItem;:GetCreate_Landroid_content_Context_Lcom_devexpress_editors_dataForm_protocols_EditorType_Handler\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.DataForm.XamarinEditorsCreator, DevExpress.XamarinForms.Editors.Android", XamarinEditorsCreator.class, __md_methods);
	}


	public XamarinEditorsCreator ()
	{
		super ();
		if (getClass () == XamarinEditorsCreator.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DataForm.XamarinEditorsCreator, DevExpress.XamarinForms.Editors.Android", "", this, new java.lang.Object[] {  });
	}


	public com.devexpress.editors.dataForm.protocols.DXDataFormEditorItem create (android.content.Context p0, com.devexpress.editors.dataForm.protocols.EditorType p1)
	{
		return n_create (p0, p1);
	}

	private native com.devexpress.editors.dataForm.protocols.DXDataFormEditorItem n_create (android.content.Context p0, com.devexpress.editors.dataForm.protocols.EditorType p1);

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
