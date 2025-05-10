package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Bluetooth;
import com.xworkz.Micro.External.Earphone;

public class Device {
    public void deviceConnect(Earphone earphone){
        earphone.device();
        earphone.connect();
        earphone.mobile();
        earphone.purchase();
        earphone.share();

        if(earphone instanceof Bluetooth){
            Bluetooth bluetooth=new Bluetooth();
            bluetooth.wireless();
        }
    }
}
