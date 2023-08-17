package com.example.chatapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatapplication.R;
import com.example.chatapplication.databinding.ActivitySignUpBinding;
import com.example.chatapplication.databinding.ActivitySigninBinding;

public class SignUpActivity extends AppCompatActivity {
    private ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListners();
    }

    private void setListners(){
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}