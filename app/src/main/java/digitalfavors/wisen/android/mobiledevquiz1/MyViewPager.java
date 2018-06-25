package digitalfavors.wisen.android.mobiledevquiz1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class MyViewPager extends Fragment
{
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    private int mPageCount = 2;
    //give before loading
    private List<Fragment> fragList = null;







    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        ViewPager viewPager = (ViewPager) inflater.inflate(R.layout.view_pager_activity, container, false);
        //get current cell selection
        int position = 1;

        //change amount of pages based on cell index number
        switch (position)
        {
            case 1 : mPageCount = 2;
                break;
            case 2 : mPageCount = ImageView.ScaleType.values().length;
        }

        mPager = viewPager.findViewById(R.id.my_view_pager);
        FragmentManager supportedFragManager = getActivity().getSupportFragmentManager();
        mPagerAdapter = new ScreenPageSlider(supportedFragManager,position);


        mPager.setAdapter(mPagerAdapter);
        return viewPager;
    }

    public class ScreenPageSlider extends FragmentStatePagerAdapter {


        int cellPosition;
        public ScreenPageSlider(FragmentManager fm, int cellPosition) {
            super(fm);

            this.cellPosition = cellPosition;
        }

        @Override
        public int getCount() {
            return mPageCount;
        }

        @Override
        public Fragment getItem(int position) {

            switch (cellPosition)
            {
                case 1: {
                    switch (position)
                    {
                        case 0 : return new DemoFragment();
                        case 1 : return new WorkFragment();
                    }
                }
                case 2 : {
                    PicFragment picFrag = new PicFragment();
                    picFrag.pagePosition = position;
                    return picFrag;
                }

            }

        return null;
        }


    }
}
