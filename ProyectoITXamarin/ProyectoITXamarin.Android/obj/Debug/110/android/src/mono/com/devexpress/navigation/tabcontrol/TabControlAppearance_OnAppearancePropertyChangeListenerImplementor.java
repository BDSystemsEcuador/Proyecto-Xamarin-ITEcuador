package mono.com.devexpress.navigation.tabcontrol;


public class TabControlAppearance_OnAppearancePropertyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.navigation.tabcontrol.TabControlAppearance.OnAppearancePropertyChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onIndicatorPropertyChanged:()V:GetOnIndicatorPropertyChangedHandler:Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance/IOnAppearancePropertyChangeListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"n_onItemPaddingPropertyChanged:()V:GetOnItemPaddingPropertyChangedHandler:Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance/IOnAppearancePropertyChangeListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"n_onItemSelectedPropertyChanged:(Lcom/devexpress/navigation/tabs/models/SelectedStyleProperty;)V:GetOnItemSelectedPropertyChanged_Lcom_devexpress_navigation_tabs_models_SelectedStyleProperty_Handler:Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance/IOnAppearancePropertyChangeListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"n_onItemSpacingPropertyChanged:()V:GetOnItemSpacingPropertyChangedHandler:Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance/IOnAppearancePropertyChangeListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"n_onItemStylePropertyChanged:(Lcom/devexpress/navigation/tabs/models/StyleProperty;)V:GetOnItemStylePropertyChanged_Lcom_devexpress_navigation_tabs_models_StyleProperty_Handler:Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance/IOnAppearancePropertyChangeListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"n_onPanelBackgroundPropertyChanged:()V:GetOnPanelBackgroundPropertyChangedHandler:Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance/IOnAppearancePropertyChangeListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"n_onPanelIndentPropertyChanged:()V:GetOnPanelIndentPropertyChangedHandler:Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance/IOnAppearancePropertyChangeListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"n_onPanelSpacingPropertyChanged:()V:GetOnPanelSpacingPropertyChangedHandler:Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance/IOnAppearancePropertyChangeListenerInvoker, DevExpress.Xamarin.Android.Navigation\n" +
			"";
		mono.android.Runtime.register ("Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance+IOnAppearancePropertyChangeListenerImplementor, DevExpress.Xamarin.Android.Navigation", TabControlAppearance_OnAppearancePropertyChangeListenerImplementor.class, __md_methods);
	}


	public TabControlAppearance_OnAppearancePropertyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == TabControlAppearance_OnAppearancePropertyChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Devexpress.Navigation.Tabcontrol.TabControlAppearance+IOnAppearancePropertyChangeListenerImplementor, DevExpress.Xamarin.Android.Navigation", "", this, new java.lang.Object[] {  });
	}


	public void onIndicatorPropertyChanged ()
	{
		n_onIndicatorPropertyChanged ();
	}

	private native void n_onIndicatorPropertyChanged ();


	public void onItemPaddingPropertyChanged ()
	{
		n_onItemPaddingPropertyChanged ();
	}

	private native void n_onItemPaddingPropertyChanged ();


	public void onItemSelectedPropertyChanged (com.devexpress.navigation.tabs.models.SelectedStyleProperty p0)
	{
		n_onItemSelectedPropertyChanged (p0);
	}

	private native void n_onItemSelectedPropertyChanged (com.devexpress.navigation.tabs.models.SelectedStyleProperty p0);


	public void onItemSpacingPropertyChanged ()
	{
		n_onItemSpacingPropertyChanged ();
	}

	private native void n_onItemSpacingPropertyChanged ();


	public void onItemStylePropertyChanged (com.devexpress.navigation.tabs.models.StyleProperty p0)
	{
		n_onItemStylePropertyChanged (p0);
	}

	private native void n_onItemStylePropertyChanged (com.devexpress.navigation.tabs.models.StyleProperty p0);


	public void onPanelBackgroundPropertyChanged ()
	{
		n_onPanelBackgroundPropertyChanged ();
	}

	private native void n_onPanelBackgroundPropertyChanged ();


	public void onPanelIndentPropertyChanged ()
	{
		n_onPanelIndentPropertyChanged ();
	}

	private native void n_onPanelIndentPropertyChanged ();


	public void onPanelSpacingPropertyChanged ()
	{
		n_onPanelSpacingPropertyChanged ();
	}

	private native void n_onPanelSpacingPropertyChanged ();

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
