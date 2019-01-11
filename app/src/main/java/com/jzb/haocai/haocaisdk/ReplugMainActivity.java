package com.jzb.haocai.haocaisdk;

import android.content.Intent;

import co.bxvip.sdk.ui.BxStartActivityImpl;

/**
 * Created by ${Evan927} on 2018/9/29.
 */
public class ReplugMainActivity extends BxStartActivityImpl {

    @Override
    public void toYourMainActivity() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        intent.setClass(this,MainActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);

    }
}
