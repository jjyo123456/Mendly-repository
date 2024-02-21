package com.example.laston;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.zegocloud.uikit.prebuilt.call.invite.widget.ZegoSendCallInvitationButton;
import com.zegocloud.uikit.service.defines.ZegoUIKitUser;

import java.util.Collections;

public class callingone extends AppCompatActivity {

    public EditText targe;
    public Button begin;
   public ZegoSendCallInvitationButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callingone);


         targe = findViewById(R.id.tagerfg);
         begin = findViewById(R.id.begin);
         button = findViewById(R.id.v);
        String a = targe.getText().toString().trim();

        begin.setOnClickListener(v -> {

         se(a);
        });



    }

    public void se(String a ){
        // ZegoSendCallInvitationButton button = new ZegoSendCallInvitationButton(getApplicationContext());
        button.setIsVideoCall(true);
        button.setResourceID("zego_uikit_call"); // Please fill in the resource ID name that has been configured in the ZEGOCLOUD's console here.
        button.setInvitees(Collections.singletonList(new ZegoUIKitUser("b","b")));
    }
}