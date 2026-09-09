package com.vynzzdev.nexusai;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;

public class MainActivity extends Activity {

    private static final String TARGET_URL = "https://ai-nexus.my.id/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            builder.setShowTitle(false);
            builder.setUrlBarHidingEnabled(true);
            builder.setShareState(CustomTabsIntent.SHARE_STATE_OFF);
            
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.intent.setData(Uri.parse(TARGET_URL));
            customTabsIntent.intent.setPackage("com.android.chrome");
            
            startActivity(customTabsIntent.intent);
        } catch (Exception e) {
            try {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(this, Uri.parse(TARGET_URL));
            } catch (Exception ex) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(TARGET_URL));
                startActivity(browserIntent);
            }
        }

        finish();
    }
}

