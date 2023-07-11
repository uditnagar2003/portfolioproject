package com.example.portfolio.model;

import android.os.Parcel;
import android.os.Parcelable;

public class portfolio implements Parcelable {
    private String name,position,git;

    public portfolio(String name, String position, String git, education edu, course cou) {
        this.name = name;
        this.position = position;
        this.git = git;
        this.edu = edu;
        this.cou = cou;
    }

    private education edu;

    protected portfolio(Parcel in) {
        name = in.readString();
        position = in.readString();
        git = in.readString();
        edu = in.readParcelable(education.class.getClassLoader());
        cou = in.readParcelable(course.class.getClassLoader());
    }

    public static final Creator<portfolio> CREATOR = new Creator<portfolio>() {
        @Override
        public portfolio createFromParcel(Parcel in) {
            return new portfolio(in);
        }

        @Override
        public portfolio[] newArray(int size) {
            return new portfolio[size];
        }
    };

    @Override
    public String toString() {
        return "portfolio{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", git='" + git + '\'' +
                ", edu=" + edu +
                ", cou=" + cou +
                '}';
    }

    private course cou;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public education getEdu() {
        return edu;
    }

    public void setEdu(education edu) {
        this.edu = edu;
    }

    public course getCou() {
        return cou;
    }

    public void setCou(course cou) {
        this.cou = cou;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(position);
        parcel.writeString(git);
        parcel.writeParcelable(edu, i);
        parcel.writeParcelable(cou, i);
    }
}
