package com.example.android.miwok;

/**
 * Created by avishai on 7/29/2017.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public int getAudioResourceId(){ return mAudioResourceId;}

    public Boolean hasImage(){
        return mImageResourceId != 0? true: false;
    }

}
