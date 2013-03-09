The BitmapFactory clas provides several decoding methods (decodeByteArray(), decodeFile(), decodeResource(), etc.) for creating a Bitmap from various sources. These methods attempt to allocate memory for the constracted bitmap and therefore can easily result in an OutofMemory exception.
Each type of decode method has additional signatures that let you specify decoding options via the BitmapFactory.Options class.

Setting the inJustDecodeBounds property to true whie decoding avoids memory allocation, returnning null for the bitmap object but setting outWidth, outHeight and outMimeType. This technique allows you to read the dimensions and type of the image data prior to construction (and memory allocation) of the bitmap.

The AsyncTask class provides and easy way to execute soe work in a background thread and publish the results back on the UI thread.

---

##### add log in JNI
	#include <android/log.h>
	#define TAG "you tag here"
	#define LOGE(...)	__android_log_write(ANDROID_LOG_ERROR, TAG, __VA_ARGS__);
	
	void fun() {
		// add log info in code
		LOGE("fun() is called at %d\n", __LINE__);
	}
	
---

##### set attributes to a button
###### in XML file  
	style="?android:attr/buttonStyleSmall"
###### in Java file  
	Button btn = new Button(this, null, android.R.attr.buttonStyleSmall);

---

##### measure a view
	contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
	contentView.getMeasuredWidth();
	contentView.getMeasuredWidth();
