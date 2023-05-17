package com.jetlight.asma_fourat.inssen;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void GoToDonnors(View view) {
        Intent intent = new Intent(LoginActivity.this,DonnorActivity.class);
        startActivity(intent);
    }
}
