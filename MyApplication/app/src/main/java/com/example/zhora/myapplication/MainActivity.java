package com.example.zhora.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    EditText edtLogin, edtPassword;
    TextView txtError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtLogin = findViewById(R.id.edt_login);
        edtPassword = findViewById(R.id.edt_password);
        txtError = findViewById(R.id.txt_error);
        intent = new Intent(getApplicationContext(), QweActivity.class);
        Button btnLogin = findViewById(R.id.btn_sign);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtLogin.getText().toString().equals("жора") && edtPassword.getText().toString().equals("1234")){
                    txtError.setText("success");
                    txtError.setTextColor(Color.GREEN);
                    startActivity(intent);
                }
                else {
                    txtError.setText("error");
                    txtError.setTextColor(Color.RED);
                }

            }
        });
    }
}
