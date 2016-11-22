package com.lzw.kuaishou.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.lzw.kuaishou.R;

public class LoginActivity extends AppCompatActivity{

    EditText et, et1;
    TextView tv, tv1;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUtils();

        textViewUtils();

    }

    private void textViewUtils() {
        tv = (TextView) findViewById(R.id.tv_login_register);
        tv.setClickable(true);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });

        tv1 = (TextView) findViewById(R.id.tv_login_forget_pwd);
        tv1.setClickable(true);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FindPasswordActivity.class);
                startActivity(intent);
            }
        });

        rb = (RadioButton) findViewById(R.id.rb_login);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DefaultActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     *  EditText相关操作
     * */
    private void editTextUtils() {

        et = (EditText) findViewById(R.id.et_login_username);
        SpannableString ss = new SpannableString("♀用户名");
        AbsoluteSizeSpan ass = new AbsoluteSizeSpan(14,true);
        ss.setSpan(ass, 0, ss.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        et.setHint(new SpannableString(ss));

        et1 = (EditText) findViewById(R.id.et_login_password);
        SpannableString ss1 = new SpannableString("● ● ● ● ● ● ● ●");
        AbsoluteSizeSpan ass1 = new AbsoluteSizeSpan(6,true);
        ss1.setSpan(ass1, 0, ss1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        et1.setHint(new SpannableString(ss1));
    }

}
