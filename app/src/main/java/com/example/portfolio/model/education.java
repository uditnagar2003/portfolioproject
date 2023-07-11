package com.example.portfolio.model;

import android.os.Parcel;
import android.os.Parcelable;

public class education implements Parcelable {
    private String name,year,degree;

    protected education(Parcel in) {
        name = in.readString();
        year = in.readString();
        degree = in.readString();
    }

    public static final Creator<education> CREATOR = new Creator<education>() {
        @Override
        public education createFromParcel(Parcel in) {
            return new education(in);
        }

        @Override
        public education[] newArray(int size) {
            return new education[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "education{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }

    public education(String name, String degree, String year)
    {
        this.degree=degree;
        this.name=name;
        this.year=year;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(year);
        parcel.writeString(degree);
    }
}
