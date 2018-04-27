# WrappingViewPager
Android Library for wrap content ViewPager

<img src="https://github.com/dominicg666/WrappingViewPager/blob/master/ezgif.com-video-to-gif%20(1).gif" width="300">


 #gradle
  Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 Add the dependency

	dependencies {
		implementation 'com.github.dominicg666:WrappingViewPager:1.0'
	}
	
#Example	

	<viewpagerwc.ui.dom.wrapping.WrappingViewPager
        android:id="@+id/viewpager"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:background="@color/colorAccent" />
