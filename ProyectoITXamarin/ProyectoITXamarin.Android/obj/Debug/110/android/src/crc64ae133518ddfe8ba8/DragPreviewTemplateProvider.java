package crc64ae133518ddfe8ba8;


public class DragPreviewTemplateProvider
	extends crc64ae133518ddfe8ba8.ViewProviderBase
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxgrid.providers.DragPreviewTemplateProvider
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getDragPreview:(Landroid/content/Context;I)Landroid/view/View;:GetGetDragPreview_Landroid_content_Context_IHandler:DevExpress.XamarinAndroid.Grid.IDragPreviewTemplateProviderInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.DataGrid.Android.DragPreviewTemplateProvider, DevExpress.XamarinForms.Grid.Android", DragPreviewTemplateProvider.class, __md_methods);
	}


	public DragPreviewTemplateProvider ()
	{
		super ();
		if (getClass () == DragPreviewTemplateProvider.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.DataGrid.Android.DragPreviewTemplateProvider, DevExpress.XamarinForms.Grid.Android", "", this, new java.lang.Object[] {  });
	}


	public android.view.View getDragPreview (android.content.Context p0, int p1)
	{
		return n_getDragPreview (p0, p1);
	}

	private native android.view.View n_getDragPreview (android.content.Context p0, int p1);

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
