package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

//    int count = 0 ;
    private Button loginButton ;
    private Button logoutButton ;
    private Button refreshButton;
    private TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButtonId);
        logoutButton = (Button) findViewById(R.id.logoutButtonId);
        refreshButton = (Button) findViewById(R.id.refreshButtonId);
        textView = (TextView) findViewById(R.id.textViewId);


        Handler handler = new Handler();
        loginButton.setOnClickListener(handler);
        logoutButton.setOnClickListener(handler);






        /*  //*public class MainActivity extends AppCompatActivity implements View.OnClickListener

            loginButton.setOnClickListener(this);
            logoutButton.setOnClickListener(this);

       loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //count++;
                //textView.setText("Login Button is Clicked "+count+" times");
                textView.setText("Login Button is Clicked times");
            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("logout button is clicked");
            }
        });*/

    }

    public  void showMessage(View view)
    {
        textView.setText("");
    }


    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if (view.getId()==R.id.loginButtonId)
            {
                textView.setText("Login Button is clicked");
            }
            else if(view.getId()==  R.id.logoutButtonId)
            {
                textView.setText("Logout is button is cliceked");
            }

        }
    }

//    @Override
//    public void onClick(View view) {
//
//        if(view.getId()==R.id.logoutButtonId)
//        {
//            textView.setText("Lggout Button is Clicked");
//        }
//        else if(view.getId()==R.id.loginButtonId) {
//            textView.setText("Login Button is Clicked times");
//        }
//    }


}