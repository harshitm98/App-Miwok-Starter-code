package com.example.android.miwok;

/**
 * Created by Harshit Maheshwari on 27-06-2017.
 */
public class Word {

    private String mMiwokName; //It's miwok transaltion of english word

    private String mEnglishName; // This is the english transaltion of the number.

    public Word(String vEnglishName, String vMiwokName){
        mMiwokName = vMiwokName;
        mEnglishName = vEnglishName;
    }

    public String getMiwokTranslation(){
        return mMiwokName;
    }

    public String getEnglishTranslation(){
        return mEnglishName;
    }

}
