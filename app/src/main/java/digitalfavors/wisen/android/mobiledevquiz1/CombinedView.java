package digitalfavors.wisen.android.mobiledevquiz1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;

public class CombinedView extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combined_layout);

//       FrameLayout frameLayoutViewPager =  findViewById(R.id.view_pager_placeholder);
//       FrameLayout frameLayoutMessenger = findViewById(R.id.messenger_placeholder);

        android.support.v4.app.FragmentManager fragManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragTransaction = fragManager.beginTransaction();
        fragTransaction.replace(R.id.view_pager_placeholder, new MyViewPager());
        fragTransaction.commit();


        android.support.v4.app.FragmentTransaction fragTransaction2 = fragManager.beginTransaction();
        fragTransaction2.replace(R.id.messenger_placeholder, new MessangerView());
        fragTransaction2.commit();





    }
}
