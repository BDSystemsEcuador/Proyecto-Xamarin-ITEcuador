package crc643542ea94a76fed83;


public class GridAction
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxgrid.providers.GridAction
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_canDragRow:(I)Z:GetCanDragRow_IHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_canDropRow:(II)Z:GetCanDropRow_IIHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_canLoadMore:()Z:GetCanLoadMoreHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_canPullToRefresh:()Z:GetCanPullToRefreshHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_cellDoubleTap:(Lcom/devexpress/dxgrid/models/GridElement;II)V:GetCellDoubleTap_Lcom_devexpress_dxgrid_models_GridElement_IIHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_cellLongPress:(Lcom/devexpress/dxgrid/models/GridElement;II)V:GetCellLongPress_Lcom_devexpress_dxgrid_models_GridElement_IIHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_cellTap:(Lcom/devexpress/dxgrid/models/GridElement;II)V:GetCellTap_Lcom_devexpress_dxgrid_models_GridElement_IIHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_cellTapConfirmed:(Lcom/devexpress/dxgrid/models/GridElement;II)V:GetCellTapConfirmed_Lcom_devexpress_dxgrid_models_GridElement_IIHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_closeEditor:(Z)Z:GetCloseEditor_ZHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_dropRow:(II)V:GetDropRow_IIHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_loadMore:()V:GetLoadMoreHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_pullTeRefresh:()V:GetPullTeRefreshHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"n_selectionChanged:(Landroid/view/View;II)V:GetSelectionChanged_Landroid_view_View_IIHandler:DevExpress.XamarinAndroid.Grid.IGridActionInvoker, DevExpress.Xamarin.Android.Grid\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.DataGrid.Android.NativeBridge.GridAction, DevExpress.XamarinForms.Grid.Android", GridAction.class, __md_methods);
	}


	public GridAction ()
	{
		super ();
		if (getClass () == GridAction.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.DataGrid.Android.NativeBridge.GridAction, DevExpress.XamarinForms.Grid.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean canDragRow (int p0)
	{
		return n_canDragRow (p0);
	}

	private native boolean n_canDragRow (int p0);


	public boolean canDropRow (int p0, int p1)
	{
		return n_canDropRow (p0, p1);
	}

	private native boolean n_canDropRow (int p0, int p1);


	public boolean canLoadMore ()
	{
		return n_canLoadMore ();
	}

	private native boolean n_canLoadMore ();


	public boolean canPullToRefresh ()
	{
		return n_canPullToRefresh ();
	}

	private native boolean n_canPullToRefresh ();


	public void cellDoubleTap (com.devexpress.dxgrid.models.GridElement p0, int p1, int p2)
	{
		n_cellDoubleTap (p0, p1, p2);
	}

	private native void n_cellDoubleTap (com.devexpress.dxgrid.models.GridElement p0, int p1, int p2);


	public void cellLongPress (com.devexpress.dxgrid.models.GridElement p0, int p1, int p2)
	{
		n_cellLongPress (p0, p1, p2);
	}

	private native void n_cellLongPress (com.devexpress.dxgrid.models.GridElement p0, int p1, int p2);


	public void cellTap (com.devexpress.dxgrid.models.GridElement p0, int p1, int p2)
	{
		n_cellTap (p0, p1, p2);
	}

	private native void n_cellTap (com.devexpress.dxgrid.models.GridElement p0, int p1, int p2);


	public void cellTapConfirmed (com.devexpress.dxgrid.models.GridElement p0, int p1, int p2)
	{
		n_cellTapConfirmed (p0, p1, p2);
	}

	private native void n_cellTapConfirmed (com.devexpress.dxgrid.models.GridElement p0, int p1, int p2);


	public boolean closeEditor (boolean p0)
	{
		return n_closeEditor (p0);
	}

	private native boolean n_closeEditor (boolean p0);


	public void dropRow (int p0, int p1)
	{
		n_dropRow (p0, p1);
	}

	private native void n_dropRow (int p0, int p1);


	public void loadMore ()
	{
		n_loadMore ();
	}

	private native void n_loadMore ();


	public void pullTeRefresh ()
	{
		n_pullTeRefresh ();
	}

	private native void n_pullTeRefresh ();


	public void selectionChanged (android.view.View p0, int p1, int p2)
	{
		n_selectionChanged (p0, p1, p2);
	}

	private native void n_selectionChanged (android.view.View p0, int p1, int p2);

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
