package com.example.donorsanddrives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class donorHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_home);

        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button11 = findViewById(R.id.button11);
        Button button16 = findViewById(R.id.button16);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewDonationHistory();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewDonorLeaderboard();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewdBloodDrives();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editProfile();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logOut();
            }
        });
    }

        public void viewDonationHistory() {
            Intent intent = new Intent(this, viewDonHistory.class);
            startActivity(intent);
        }

    public void viewDonorLeaderboard() {
        Intent intent = new Intent(this, viewDonLead.class);
        startActivity(intent);
    }

    public void viewdBloodDrives() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void editProfile() {
        Intent intent = new Intent(this, editDonAcc.class);
        startActivity(intent);
    }

    public void logOut() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}