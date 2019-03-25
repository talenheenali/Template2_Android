package net.simplifiedcoding.navigationdrawerexample;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
/**
 * Created by Heenali on 20/2/2019.
 */

public class Login extends AppCompatActivity {

    TextView txt_forgotpass,txt_regi;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(Login.this, R.color.appcolor2));
        }
        txt_forgotpass=(TextView)findViewById(R.id.txt_forgotpass);
        txt_regi=(TextView)findViewById(R.id.txt_regi);
        btn_login=(Button) findViewById(R.id.btn_login);

        txt_forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent i=new Intent(getApplicationContext(),Activity_passcreate.class);
                startActivity(i);
            }
        });

        txt_regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(getApplicationContext(),Activity_regi.class);
                startActivity(i);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
