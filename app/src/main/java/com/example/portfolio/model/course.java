package com.example.portfolio.model;

import android.os.Parcel;
import android.os.Parcelable;

public class course implements Parcelable {
    private String name,year,degree;
    public course(String name, String degree, String year)
    {
        this.degree=degree;
        this.name=name;
        this.year=year;
    }

    protected course(Parcel in) {
        name = in.readString();
        year = in.readString();
        degree = in.readString();
    }

    public static final Creator<course> CREATOR = new Creator<course>() {
        @Override
        public course createFromParcel(Parcel in) {
            return new course(in);
        }

        @Override
        public course[] newArray(int size) {
            return new course[size];
        }
    };

    @Override
    public String toString() {
        return "course{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }

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
