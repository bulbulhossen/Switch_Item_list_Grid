package com.bulbulhossen.switch_item_list_grid;

/**
 * Created by dev-pc on 11/18/16.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by bulbulkhan on 10/25/2015.
 */
public class BanglaFont_Details extends TextView {
    public static Typeface m_typeFace = null;

    public BanglaFont_Details(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    public BanglaFont_Details(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    public BanglaFont_Details(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    private void loadTypeFace(Context context) {
        if (m_typeFace == null)
            m_typeFace = Typeface.createFromAsset(context.getAssets(),
                    "solaimanLipi.ttf");
        this.setTypeface(m_typeFace);
    }
}