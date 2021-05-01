package crc64e58ce59a6d1a044d;


public class DateTimeFormatter
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.DateTimeFormatter
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_formatDate:(Ljava/util/Date;IIIIII)Ljava/lang/CharSequence;:GetFormatDate_Ljava_util_Date_IIIIIIHandler:DevExpress.Xamarin.Android.Editors.IDateTimeFormatterInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"n_formatTime:(Ljava/util/Date;)Ljava/lang/CharSequence;:GetFormatTime_Ljava_util_Date_Handler:DevExpress.Xamarin.Android.Editors.IDateTimeFormatterInvoker, DevExpress.Xamarin.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.XamarinForms.Editors.Android.DateTimeFormatter, DevExpress.XamarinForms.Editors.Android", DateTimeFormatter.class, __md_methods);
	}


	public DateTimeFormatter ()
	{
		super ();
		if (getClass () == DateTimeFormatter.class)
			mono.android.TypeManager.Activate ("DevExpress.XamarinForms.Editors.Android.DateTimeFormatter, DevExpress.XamarinForms.Editors.Android", "", this, new java.lang.Object[] {  });
	}


	public java.lang.CharSequence formatDate (java.util.Date p0, int p1, int p2, int p3, int p4, int p5, int p6)
	{
		return n_formatDate (p0, p1, p2, p3, p4, p5, p6);
	}

	private native java.lang.CharSequence n_formatDate (java.util.Date p0, int p1, int p2, int p3, int p4, int p5, int p6);


	public java.lang.CharSequence formatTime (java.util.Date p0)
	{
		return n_formatTime (p0);
	}

	private native java.lang.CharSequence n_formatTime (java.util.Date p0);

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
