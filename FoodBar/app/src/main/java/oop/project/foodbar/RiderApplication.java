package oop.project.foodbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import oop.project.foodjar.R;

public class RiderApplication extends AppCompatActivity {

    String name, email, address, password;
    int phone;
    EditText namePlainText, phoneNumber, emailAddress, passwordEditText, city;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namePlainText = (EditText)findViewById(R.id.namePlainText);
        phoneNumber = (EditText)findViewById(R.id.phoneNumber);
        emailAddress = (EditText)findViewById(R.id.emailAddress);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);
        city = (EditText)findViewById(R.id.city);
    }
    public void addListenerOnSpinnerItemSelection() {
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }
}
