package com.jzb.haocai.haocaisdk;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.Replaceable;

import com.qihoo360.replugin.RePlugin;

import cn.jpush.android.api.JPushInterface;
import co.bxvip.sdk.BxRePluginAppLicationMakeImpl;

public class App extends BxRePluginAppLicationMakeImpl {

    @Override
    public void initJPushYouNeed() {
        JPushInterface.init(this);
    }

    @Override
    public void initRePluginYourNeed() {

    }
}
