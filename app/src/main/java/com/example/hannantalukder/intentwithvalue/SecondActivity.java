package com.example.hannantalukder.intentwithvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView name;
    private TextView h_name;
    private TextView hnumber;
    private TextView pStation;
    private TextView zCode;
    private TextView depName;
    private TextView departlocation;
    private TextView cName;
    private TextView cCode;
    private TextView cCredit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (TextView) findViewById(R.id.show_Name);
        h_name = (TextView) findViewById(R.id.show_houseName);
        hnumber = (TextView) findViewById(R.id.show_roadNumber);
        pStation = (TextView) findViewById(R.id.show_policeS);
        zCode = (TextView) findViewById(R.id.show_zipCode);
        depName = (TextView) findViewById(R.id.show_DeptName);
        departlocation = (TextView) findViewById(R.id.show_deptLocation);
        cName = (TextView) findViewById(R.id.show_courseName);
        cCode = (TextView) findViewById(R.id.show_courseCode);
        cCredit = (TextView) findViewById(R.id.show_courseCredit);

        String fname = getIntent().getStringExtra("fname");
        String mname = getIntent().getStringExtra("mname");
        String lname = getIntent().getStringExtra("lname");
        String hname = getIntent().getStringExtra("hname");
        String rnumber = getIntent().getStringExtra("rnumber");
        String pstation = getIntent().getStringExtra("pstation");
        double code = getIntent().getDoubleExtra("zipcode",0);


        String dep_name = getIntent().getStringExtra("depname");
        String deplocation = getIntent().getStringExtra("deplocation");
        String Cname = getIntent().getStringExtra("cname");
        String Ccode = getIntent().getStringExtra("ccode");
        double Ccredit = getIntent().getDoubleExtra("ccredit",0);



        name.setText(fname+" "+mname+" "+lname);
        h_name.setText(hname);
        hnumber.setText(rnumber);
        pStation.setText(pstation);
        zCode.setText(String.valueOf(code));
        depName.setText(dep_name);
        departlocation.setText(deplocation);
        cName.setText(Cname);
        cCode.setText(Ccode);
        cCredit.setText(String.valueOf(Ccredit));




    }
}
