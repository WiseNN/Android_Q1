package digitalfavors.wisen.android.mobiledevquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button submitBtn =  findViewById(R.id.btn_submit);
         Button quiz2Btn = findViewById(R.id.btn_quiz_2);


         submitBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getBaseContext(),R.string.toast_msg , Toast.LENGTH_SHORT).show();
             }
         });


         quiz2Btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

//                 android.support.v4.app.FragmentManager fragManager = getSupportFragmentManager();
//                 android.support.v4.app.FragmentTransaction fragTransaction = fragManager.beginTransaction();
////                 fragTransaction.replace(R.id.view_pager_placeholder, new MyViewPager());
//                 fragTransaction.commit();
                    Intent intent = new Intent();
                    String pkgName = "digitalfavors.wisen.android.mobiledevquiz1";
                    String className = "digitalfavors.wisen.android.mobiledevquiz1.CombinedView";
                    intent.setClassName(pkgName ,className );
                    startActivity(intent);



             }
         });
    }
}
