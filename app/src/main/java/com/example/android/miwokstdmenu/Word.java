package com.example.android.miwokstdmenu;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

       /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // audible resource ID
    private int mAudioResourceId;
    /**
     * Create a new Word object.

     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param audioResourceId is an integer representing the id of the audio to populate
     * *
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    /**
     * Create a new Word object.
          * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param imageResourceId is an integer representing the id of the image to populate
     * *
     *
     * @param audioResourceId is an integer representing the id of the audio to populate
     * *
     */
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId,int audioResourceId) {


        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
       /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {return mImageResourceId;}
    /**
     * Get the audio resource ID
     */
    public int getAudioResourceId() {return mAudioResourceId;}

    public Boolean hasImage() {

        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
