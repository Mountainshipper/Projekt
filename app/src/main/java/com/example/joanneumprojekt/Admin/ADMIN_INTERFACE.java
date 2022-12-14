/**
 * Autor: Samuel Spencer
 * This is the interface for the administrator
 * 06.06.2022
 */

package com.example.joanneumprojekt.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.joanneumprojekt.Abrechnung;
import com.example.joanneumprojekt.R;
import com.example.joanneumprojekt.SignUP.Login_Interface;


public class ADMIN_INTERFACE extends AppCompatActivity implements View.OnClickListener {

    private Button btn_Add, btn_Work, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_interface);


        setTitle("Admin Interface 1");


        btn_Add = findViewById(R.id.interface_Add_Work);
        btn_Work = findViewById(R.id.Abrechnung);
        logout = findViewById(R.id.logout);

        btn_Add.setOnClickListener(this);
        btn_Work.setOnClickListener(this);
        logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.interface_Add_Work:

                Intent intentUser = new Intent(ADMIN_INTERFACE.this, Interface_ADD.class);
                startActivity(intentUser);
                break;

            case R.id.Abrechnung:
                Intent intentWork = new Intent(ADMIN_INTERFACE.this, Abrechnung.class);
                startActivity(intentWork);
                break;


            case R.id.logout:
                Intent logout = new Intent(ADMIN_INTERFACE.this, Login_Interface.class);
                startActivity(logout);
                break;
        }
    }
}