package digitalfavors.wisen.android.mobiledevquiz1;

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

         submitBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getBaseContext(),R.string.toast_msg , Toast.LENGTH_SHORT).show();
             }
         });
    }
}
