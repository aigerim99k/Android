package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView textView = findViewById(R.id.forgot_password);
        final SpannableStringBuilder sb = new SpannableStringBuilder("Forgot your login details? Get help signing in.");
        final ForegroundColorSpan fcs = new ForegroundColorSpan(Color.rgb(21, 34, 56));
        final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);
        sb.setSpan(fcs, 27, 47, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        sb.setSpan(bss, 27, 47, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textView.setText(sb);


        TextView textView1 = findViewById(R.id.haventaccount);
        final SpannableStringBuilder sbb = new SpannableStringBuilder("Don't have an account? Sign up.");
        final ForegroundColorSpan fcss = new ForegroundColorSpan(Color.rgb(21, 34, 56));
        final StyleSpan bsss = new StyleSpan(android.graphics.Typeface.BOLD);
        sbb.setSpan(fcss, 23, 31, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        sbb.setSpan(bsss, 23, 31, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textView1.setText(sbb);


    }
}
