package mono.com.devexpress.navigation;


public class TabsView_OnTabTappedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.navigation.TabsView.OnTabTappedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTabTapped:(I)Z:GetOnTabTapped_IHandler:Com.Devexpress.Navigation.TabsView/IOnTabTappedListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"";
		mono.android.Runtime.register ("Com.Devexpress.Navigation.TabsView+IOnTabTappedListenerImplementor, DevExpress.Xamarin.Android.Navigation", TabsView_OnTabTappedListenerImplementor.class, __md_methods);
	}


	public TabsView_OnTabTappedListenerImplementor ()
	{
		super ();
		if (getClass () == TabsView_OnTabTappedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Devexpress.Navigation.TabsView+IOnTabTappedListenerImplementor, DevExpress.Xamarin.Android.Navigation", "", this, new java.lang.Object[] {  });
	}


	public boolean onTabTapped (int p0)
	{
		return n_onTabTapped (p0);
	}

	private native boolean n_onTabTapped (int p0);

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
