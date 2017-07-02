package com.example.android.miwok;

/**
 * Created by Harshit Maheshwari on 27-06-2017.
 */
public class Word {

    private String mMiwokName; //It's miwok transaltion of english word

    private String mEnglishName; // This is the english transaltion of the number.

    private int mImageId = NO_IMAGE_PROVIDED;

    private final static int NO_IMAGE_PROVIDED = -1;

    private int mAudio;

    public Word(String vEnglishName, String vMiwokName, int vImageId, int vAudio){
        mMiwokName = vMiwokName;
        mEnglishName = vEnglishName;
        mImageId = vImageId;
        mAudio = vAudio;
    }


    /* Creating another constructor which takes two parameters as input
    *
    */
    public Word(String vEnglishName, String vMiwokName, int vAudio){
        mMiwokName = vMiwokName;
        mEnglishName = vEnglishName;
        mAudio = vAudio;
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

    public int getAudio(){
        return mAudio;
    }

}
