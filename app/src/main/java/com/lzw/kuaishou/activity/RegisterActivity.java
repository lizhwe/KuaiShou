package com.lzw.kuaishou.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.widget.EditText;

import com.lzw.kuaishou.R;

public class RegisterActivity extends AppCompatActivity {

    EditText et, et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et = (EditText) findViewById(R.id.et_register_input_number);
        SpannableString ss = new SpannableString("手机号码");
        AbsoluteSizeSpan ass = new AbsoluteSizeSpan(14,true);
        ss.setSpan(ass, 0, ss.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        et.setHint(new SpannableString(ss));

        et1 = (EditText) findViewById(R.id.et_register_input_password);
        SpannableString ss1 = new SpannableString("输入密码");
        AbsoluteSizeSpan ass1 = new AbsoluteSizeSpan(14,true);
        ss1.setSpan(ass1, 0, ss1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        et1.setHint(new SpannableString(ss1));

        et3 = (EditText) findViewById(R.id.et_register_repeat_input_password);
        SpannableString ss3 = new SpannableString("再次输入密码");
        AbsoluteSizeSpan ass3 = new AbsoluteSizeSpan(14,true);
        ss3.setSpan(ass3, 0, ss3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        et3.setHint(new SpannableString(ss3));

        et2 = (EditText) findViewById(R.id.et_register_input_code);
        SpannableString ss2 = new SpannableString("输入验证码");
        AbsoluteSizeSpan ass2 = new AbsoluteSizeSpan(14,true);
        ss2.setSpan(ass2, 0, ss2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        et2.setHint(new SpannableString(ss2));

    }

}
