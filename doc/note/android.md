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

---

*  close the Cursor!

---

View - 手机屏幕上可见的东西都是view
Activity - 应用于用户交互的窗口
Intent - 一个信息包，表达了你的意图（请愿）

---

Activities are organized as a stack:
1. Top Activity is visiable;
2. Other Activities are stopped;
3. BACK button to traverse the Activities stack;
4. Long press HOME button shows the content of the stack.

---

创建notification的步骤
1. 创建一个PendingIntent
2. 创建一个Notification.Builder
3. 将1中对象传给2中对象，通过2的setContentIntent接口
4. build
5. 获得系统服务NotificationManager并把4中构建的notification通过其notify接口传给它

---

添加动画步骤
1. 在 res/animator/id.xml定义一个set
2. 在代码中AnimatorInflator.loadAnimator()加载这个动画
3. setTarget()
4. start()

---

允许子view超出容器[android:clipChildren](http://developer.android.com/reference/android/view/ViewGroup.html#attr_android:clipChildren)
```xml
android:clipChildren="false"
```
