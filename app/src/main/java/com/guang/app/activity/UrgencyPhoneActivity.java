package com.guang.app.activity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.apkfuns.logutils.LogUtils;
import com.guang.app.R;
import com.guang.app.util.FileUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 常用电话
 * Created by xiaoguang on 2017/2/19.
 */
public class UrgencyPhoneActivity extends QueryActivity {
    @Bind(R.id.tv_urgency_phone) TextView tv_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.addTitleBackBtn();
        setTitle(R.string.title_urgencyPhone);
        setContentView(R.layout.urgency_phone);
        ButterKnife.bind(this);
    }

    @Override
    protected void loadData() {
        String phoneContent = FileUtils.getStrFromAssets(this,"urgency_phone.html");
//        phoneContent = phoneContent.replace("\\n",System.getProperty("line.separator"));
//        phoneContent = phoneContent.replace("\\t",String.format("%-5s"," "));
//        phoneContent = Html.fromHtml(phoneContent);
//        LogUtils.e(phoneContent);
        tv_phone.setText(Html.fromHtml(phoneContent));
    }

    @Override
    protected boolean hideLoadingIcon() {
        return true;
    }
}