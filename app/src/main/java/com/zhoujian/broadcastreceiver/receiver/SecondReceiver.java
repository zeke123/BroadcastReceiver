package com.zhoujian.broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by zhoujian on 2016/12/27.
 */

public class SecondReceiver extends BroadcastReceiver
{

    private String mMsg;

    @Override
    public void onReceive(Context context, Intent intent)
    {
        //注意此方法内部不能做耗时操作，容易引起ANR
        if (intent.getAction().equals("zhoujian.define.broadastreceiver"))
        {
            Bundle bundle = getResultExtras(true);
            mMsg = bundle.getString("message");
            Toast.makeText(context, mMsg, Toast.LENGTH_SHORT).show();
        }
    }
}
