package com.example.customview08102019;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Editwithtext extends LinearLayout {

    private TextView mTvTitle;

    private String mTextTitle;
    private Integer mColorTitle;


    public Editwithtext(Context context) {
        super(context);
        initView(null);
    }

    public Editwithtext(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(attrs);
    }

    public Editwithtext(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.item_edit_with_title,this,true);
        mapview(view);
        loadAttrToView(attrs);
        setUpView();
    }

    private void loadAttrToView(AttributeSet attrs) {
        if (attrs == null) return;
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs,R.styleable.Editwithtext);
        mTextTitle = typedArray.getString(R.styleable.Editwithtext_title);
        mColorTitle = typedArray.getColor(R.styleable.Editwithtext_colorTitle,0);
    }

    private void mapview(View view) {
        mTvTitle = view.findViewById(R.id.textviewItemTitle);
        mTvTitle.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setOnClickText();
            }
        });
    }
    private void setUpView() {
        mTvTitle.setText(mTextTitle);
        mTvTitle.setTextColor(mColorTitle);
    }
    private void setOnClickText(){

    }

}
