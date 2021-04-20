package crc64ae133518ddfe8ba8;


public class TotalSummaryViewProvider
	extends crc64ae133518ddfe8ba8.ViewProviderBase
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxgrid.providers.TotalSummaryViewProvider,
		com.devexpress.dxgrid.providers.TotalSummaryViewProviderBase
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_canGet:(I)Z:GetCanGet_IHandler:DevExpress.XamarinAndroid.Grid.ITotalSummaryViewProviderInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_getTotalSummaryView:(Landroid/content/Context;I)Landroid/view/View;:GetGetTotalSummaryView_Landroid_content_Context_IHandler:DevExpress.XamarinAndroid.Grid.ITotalSummaryViewProviderBaseInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.DataGrid.Android.TotalSummaryViewProvider, DevExpress.XamarinForms.Grid.Android", TotalSummaryViewProvider.class, __md_methods);
	}


	public TotalSummaryViewProvider ()
	{
		super ();
		if (getClass () == TotalSummaryViewProvider.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.DataGrid.Android.TotalSummaryViewProvider, DevExpress.XamarinForms.Grid.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean canGet (int p0)
	{
		return n_canGet (p0);
	}

	private native boolean n_canGet (int p0);


	public android.view.View getTotalSummaryView (android.content.Context p0, int p1)
	{
		return n_getTotalSummaryView (p0, p1);
	}

	private native android.view.View n_getTotalSummaryView (android.content.Context p0, int p1);

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
