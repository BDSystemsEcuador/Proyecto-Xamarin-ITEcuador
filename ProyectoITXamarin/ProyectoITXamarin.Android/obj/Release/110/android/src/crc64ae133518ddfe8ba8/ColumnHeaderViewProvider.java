package crc64ae133518ddfe8ba8;


public class ColumnHeaderViewProvider
	extends crc64ae133518ddfe8ba8.ViewProviderBase
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxgrid.providers.ColumnHeaderViewProvider
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getColumnHeaderView:(Landroid/content/Context;I)Landroid/view/View;:GetGetColumnHeaderView_Landroid_content_Context_IHandler:DevExpress.XamarinAndroid.Grid.IColumnHeaderViewProviderInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.DataGrid.Android.ColumnHeaderViewProvider, DevExpress.XamarinForms.Grid.Android", ColumnHeaderViewProvider.class, __md_methods);
	}


	public ColumnHeaderViewProvider ()
	{
		super ();
		if (getClass () == ColumnHeaderViewProvider.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.DataGrid.Android.ColumnHeaderViewProvider, DevExpress.XamarinForms.Grid.Android", "", this, new java.lang.Object[] {  });
	}


	public android.view.View getColumnHeaderView (android.content.Context p0, int p1)
	{
		return n_getColumnHeaderView (p0, p1);
	}

	private native android.view.View n_getColumnHeaderView (android.content.Context p0, int p1);

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
