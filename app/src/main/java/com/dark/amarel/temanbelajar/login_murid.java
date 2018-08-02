package com.dark.amarel.temanbelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_murid extends AppCompatActivity {
    private Button mButtonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_murid);

        mButtonStart= (Button)findViewById(R.id.btn_daftar);

        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login_murid.this,daftar_aktivity.class);
                startActivity(intent);
            }
        });
    }
}
