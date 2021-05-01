package mono.com.devexpress.editors;


public class EditorGestureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.EditorGestureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDoubleTap:()Z:GetOnDoubleTapHandler:DevExpress.Xamarin.Android.Editors.IEditorGestureListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"n_onLongPress:()Z:GetOnLongPressHandler:DevExpress.Xamarin.Android.Editors.IEditorGestureListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"n_onSingleTapUp:()Z:GetOnSingleTapUpHandler:DevExpress.Xamarin.Android.Editors.IEditorGestureListenerInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.IEditorGestureListenerImplementor, DevExpress.Xamarin.Android.Editors", EditorGestureListenerImplementor.class, __md_methods);
	}


	public EditorGestureListenerImplementor ()
	{
		super ();
		if (getClass () == EditorGestureListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.IEditorGestureListenerImplementor, DevExpress.Xamarin.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public boolean onDoubleTap ()
	{
		return n_onDoubleTap ();
	}

	private native boolean n_onDoubleTap ();


	public boolean onLongPress ()
	{
		return n_onLongPress ();
	}

	private native boolean n_onLongPress ();


	public boolean onSingleTapUp ()
	{
		return n_onSingleTapUp ();
	}

	private native boolean n_onSingleTapUp ();

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
