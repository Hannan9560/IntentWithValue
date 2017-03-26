package com.example.hannantalukder.intentwithvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText firtName;
    private EditText middleName;
    private EditText lastName;
    private EditText houseName;
    private EditText roadNumber;
    private EditText policeStation;
    private EditText zipCode;
    private EditText dep_Name;
    private EditText dep_Location;
    private EditText courseName;
    private EditText courseCode;
    private EditText courseCredit;
    private Button submit;

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

    private  Student student;
    private Department department;
    private StudentAddress address;
    private Course course;
    private ArrayList<Course> courselist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firtName = (EditText) findViewById(R.id.firstName);
        middleName = (EditText) findViewById(R.id.middleName);
        lastName = (EditText) findViewById(R.id.lastName);
        houseName = (EditText) findViewById(R.id.houseName);
        roadNumber = (EditText) findViewById(R.id.roadNumber);
        policeStation = (EditText) findViewById(R.id.policeSta);
        zipCode = (EditText) findViewById(R.id.zipCode);
        dep_Name = (EditText) findViewById(R.id.dep_Name);
        dep_Location = (EditText) findViewById(R.id.dep_location);
        courseName = (EditText) findViewById(R.id.course_Name);
        courseCode = (EditText) findViewById(R.id.course_Code);
        courseCredit = (EditText) findViewById(R.id.course_Credit);
        submit = (Button) findViewById(R.id.submit);



        student = new Student();
        department = new Department();
        address = new StudentAddress();
        course = new Course();
        courselist = new ArrayList<Course>();
    }

    public void Submit(View view) {
        try {
            String fname = firtName.getText().toString();
            String mname = middleName.getText().toString();
            String lname = lastName.getText().toString();
            String hname = houseName.getText().toString();
            String rnumber = roadNumber.getText().toString();
            String pstation = policeStation.getText().toString();
            double code = Double.parseDouble(zipCode.getText().toString());
            String dep_name = dep_Name.getText().toString();
            String deplocation = dep_Location.getText().toString();
            String cname = courseName.getText().toString();
            String ccode = courseCode.getText().toString();
            double ccredit = Double.parseDouble(courseCredit.getText().toString());

            student.setFirstName(fname);
            student.setMiddleName(mname);
            student.setLastName(lname);


            address.setHouseName(hname);
            address.setHouseRoad(rnumber);
            address.setThana(pstation);
            address.setZipCode((int) code);

            student.setAddress(address);

            department.setDepName(dep_name);
            department.setDepLocation(deplocation);



            course.setCourseName(cname);
            course.setCourseCode(ccode);
            course.setCourseCredit(ccredit);

            courselist.add(course);

            department.setCourseList(courselist);

            student.setDepartment(department);

            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            i.putExtra("fname",fname);
            i.putExtra("mname",mname);
            i.putExtra("lname",lname);
            i.putExtra("hname",hname);
            i.putExtra("rnumber",rnumber);
            i.putExtra("pstation",pstation);
            i.putExtra("zipcode",code);
            i.putExtra("depname",dep_name);
            i.putExtra("deplocation",deplocation);
            i.putExtra("cname",cname);
            i.putExtra("ccode",ccode);
            i.putExtra("ccredit",ccredit);
            startActivity(i);
        }catch (Exception e)
        {
            Toast.makeText(this, "Field is Emplty", Toast.LENGTH_SHORT).show();
        }


    }
}
