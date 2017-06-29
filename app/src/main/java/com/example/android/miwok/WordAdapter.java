package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harshit Maheshwari on 28-06-2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColorId;

    public WordAdapter(Activity context, ArrayList<Word> objects, int vBackgroundColorId) {
        super(context, 0, objects);
        mBackgroundColorId = vBackgroundColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameMiwokTextView = (TextView) listItemView.findViewById(R.id.text_miwok );
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameMiwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView nameEnglishTextView = (TextView) listItemView.findViewById(R.id.text_english);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        nameEnglishTextView.setText(currentWord.getEnglishTranslation());

        ImageView miwokImage = (ImageView) listItemView.findViewById(R.id.miwok_image);

        if(currentWord.hasImage()){
            miwokImage.setImageResource(currentWord.getImageId());
        }
        else{
            miwokImage.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.layout_item);
        int color = ContextCompat.getColor(getContext(), mBackgroundColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
