package z1835941.niu.edu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    // instance variables
    private TextView messageTV;
    private Button toggleBTN;
    private boolean isHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect the objects on the screen with the variables in the java code
        messageTV = findViewById(R.id.messageTextView);
        toggleBTN = findViewById(R.id.switchButton);

        //init bool var
        isHello = true;

        //handle button click
        toggleBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isHello) {
                    messageTV.setText(R.string.goodbye_str);
                    isHello = false;
                }
                else{
                    messageTV.setText(R.string.hello_str);
                    isHello = true;
                }
            }
        });
    }


}
