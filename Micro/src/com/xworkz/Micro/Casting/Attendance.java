package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Campus;
import com.xworkz.Micro.External.College;

public class Attendance {
    public void compulsory(College college){
        college.rating();
        college.lecturers();
        college.library();
        college.students();
        college.construction();

        if(college instanceof Campus){
            Campus campus=new Campus();
            campus.read();
        }
    }
}
