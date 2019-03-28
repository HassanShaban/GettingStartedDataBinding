package com.example.gettingstarteddatabinding;

import android.databinding.DataBindingUtil;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gettingstarteddatabinding.databinding.ActivityMainBinding;
import com.example.gettingstarteddatabinding.models.SiteData;


public class MainActivity extends AppCompatActivity {


    ActivityMainBinding mBinding;
    SiteData siteData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        siteData = new SiteData();
        siteData.setSiteName("Amazon");
        siteData.setSiteLink("Amazon.com");
        siteData.setSiteDescription("Super pay Online");
        mBinding.setSitedata(siteData);


        new CountDownTimer(4000 , 1000){


            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

                siteData.setSiteName("Payfort");
                siteData.setSiteLink("Payfort.com");
                siteData.setSiteDescription("Sub pay Online");
                mBinding.setSitedata(siteData);


            }
        }.start();




    }
}
