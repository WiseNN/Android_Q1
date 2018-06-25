package digitalfavors.wisen.android.mobiledevquiz1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WorkFragment extends android.support.v4.app.Fragment
{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //if container exists, inflate fragment container view, and return
        if(container != null)
        {
            return inflater.inflate(R.layout.fragment_work, container, false);
        }
        //else, return generic superview
        else{
            return  super.onCreateView(inflater, container, savedInstanceState);
        }


    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
