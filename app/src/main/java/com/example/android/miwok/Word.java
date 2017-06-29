package com.example.android.miwok;

/**
 * Created by Harshit Maheshwari on 27-06-2017.
 */
public class Word {

    private String mMiwokName; //It's miwok transaltion of english word

    private String mEnglishName; // This is the english transaltion of the number.

    private int mImageId = NO_IMAGE_PROVIDED;

    private final static int NO_IMAGE_PROVIDED = -1;

    public Word(String vEnglishName, String vMiwokName, int vImageId){
        mMiwokName = vMiwokName;
        mEnglishName = vEnglishName;
        mImageId = vImageId;
    }


    /* Creating another constructor which takes two parameters as input
    *
    */
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

    public int getImageId(){ return mImageId; }

    public boolean hasImage(){
        return mImageId != NO_IMAGE_PROVIDED;
    }

}
