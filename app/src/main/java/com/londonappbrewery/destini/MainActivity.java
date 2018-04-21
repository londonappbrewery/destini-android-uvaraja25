package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private Button buttonTop;
    private Button buttonBottom;
    private TextView mTextView;
    int index=1;
    int buttonIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] storiesArray={R.string.T1_Story,R.string.T2_Story,R.string.T3_Story,R.string.T4_End,R.string.T5_End,R.string.T6_End};
        final int[] buttonTopText={R.string.T1_Ans1,R.string.T2_Ans1,R.string.T3_Ans1};
        final int[] buttonBottomText={R.string.T1_Ans2,R.string.T2_Ans2,R.string.T3_Ans2};

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView=findViewById(R.id.storyTextView);
        buttonTop=findViewById(R.id.buttonTop);
        buttonBottom=findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 1 || index==2) {
                    index = 3;
                    mTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                } else {
                    mTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 1) {
                    index = 2;
                    mTextView.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                } else if (index == 2) {
                    mTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                } else  {
                    mTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }
            }
        });
    }
}
