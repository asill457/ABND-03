package com.example.android.abnd03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    *Method used to check the quiz answers, show the correct ones
    *in green and display a score with a toast message.
     */
    public void submit(View view) {
        //Checking control of the right button in question1
        RadioButton radioButtonOne = (RadioButton) findViewById(R.id.q1ans3);
        boolean checkedOne = radioButtonOne.isChecked();
        if (checkedOne)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonOne.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question2
        RadioButton radioButtonTwo = (RadioButton) findViewById(R.id.q2ans2);
        boolean checkedTwo = radioButtonTwo.isChecked();
        if (checkedTwo)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonTwo.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question3
        RadioButton radioButtonThree = (RadioButton) findViewById(R.id.q3ans1);
        boolean checkedThree = radioButtonThree.isChecked();
        if (checkedThree)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonThree.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question4
        RadioButton radioButtonFour = (RadioButton) findViewById(R.id.q4ans4);
        boolean checkedFour = radioButtonFour.isChecked();
        if (checkedFour)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonFour.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question5
        CheckBox checkBoxFiveProt1 = (CheckBox) findViewById(R.id.q5ans2);
        boolean checkedProt1 = checkBoxFiveProt1.isChecked();
        CheckBox checkBoxFiveProt2 = (CheckBox) findViewById(R.id.q5ans3);
        boolean checkedProt2 = checkBoxFiveProt2.isChecked();
        if (checkedProt1 && checkedProt2)
            score += 1;
        //Changes the color of the text of the correct checkboxes to green
        checkBoxFiveProt1.setTextColor(rgb(0, 255, 0));
        checkBoxFiveProt2.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question6
        RadioButton radioButtonSix = (RadioButton) findViewById(R.id.q6ans3);
        boolean checkedSix = radioButtonSix.isChecked();
        if (checkedSix)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonSix.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question7
        RadioButton radioButtonSeven = (RadioButton) findViewById(R.id.q7ans2);
        boolean checkedSeven = radioButtonSeven.isChecked();
        if (checkedSeven)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonSeven.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question8
        CheckBox checkBoxEightProtocol1 = (CheckBox) findViewById(R.id.q8ans1);
        boolean checkedProtocol1 = checkBoxEightProtocol1.isChecked();
        CheckBox checkBoxEightProtocol2 = (CheckBox) findViewById(R.id.q8ans4);
        boolean checkedProtocol2 = checkBoxEightProtocol2.isChecked();
        if (checkedProtocol1 && checkedProtocol2)
            score += 1;
        //Changes the color of the text of the correct checkboxes to green
        checkBoxEightProtocol1.setTextColor(rgb(0, 255, 0));
        checkBoxEightProtocol2.setTextColor(rgb(0, 255, 0));


        //Checking for correct answer in question 9
        EditText quest9Name = (EditText) findViewById(R.id.q9ans);

        if

                (quest9Name.getText().toString().equals(getString(R.string.ans9_1)))


        {
            score += 1;
            //Changes the color of the answer to green if correct and show

            quest9Name.setText(getString(R.string.ans9_1));
            quest9Name.setTextColor(rgb(0, 255, 0));

        } else

        {
            //Displays the correct answer compared to the incorrect one in red color
            quest9Name.setText(quest9Name.getText());
            quest9Name.setTextColor(rgb(255, 0, 0));
        }

        //Only one click for submission
        Button myButton = (Button) findViewById(R.id.submit_button);
        myButton.setClickable(false);

        //Displays score in toast message
        Toast.makeText(this, getString(R.string.scoreIs) + " " + score +
                " " + getString(R.string.percent), Toast.LENGTH_LONG).show();
    }
}
