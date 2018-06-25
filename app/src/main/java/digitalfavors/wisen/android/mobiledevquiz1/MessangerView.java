package digitalfavors.wisen.android.mobiledevquiz1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MessangerView extends Fragment {

    ArrayList<String> messagesList;
    ListView mListView;
    LinearLayout messengerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        messagesList = new ArrayList<String>();

        messagesList.add("Hey Whats Up!");
        messagesList.add("Nothing much, just writing this app ");
        messagesList.add("Are you coming over later? \nI was gonn see if we could go " +
                "to the spot you love ;) \n\nYou don't have to , just let me know!");
        messagesList.add("Ok...give me like 1 hour, if you don't mind.");




    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        messengerView = (LinearLayout) LayoutInflater.from(getContext().getApplicationContext()).inflate(R.layout.msg_screen, null);
        mListView = messengerView.findViewById(R.id.lv_for_messages);
        mListView.setAdapter(new MessengerListViewAdapter(messagesList,getContext().getApplicationContext()));


        return messengerView;
    }
}
