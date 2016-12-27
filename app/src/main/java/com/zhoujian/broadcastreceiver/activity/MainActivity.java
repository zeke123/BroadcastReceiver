package com.zhoujian.broadcastreceiver.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.zhoujian.broadcastreceiver.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.bt_send)
    Button mBtSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        clickEvent();
    }

    private void clickEvent()
    {
        mBtSend.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                //设置Action
                intent.setAction("zhoujian.define.broadastreceiver");
                intent.putExtra("msg","广播来啦！");
                //发送有序广播
                sendOrderedBroadcast(intent,null);

            }
        });
    }
}
