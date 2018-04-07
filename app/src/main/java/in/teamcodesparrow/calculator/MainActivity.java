package in.teamcodesparrow.calculator;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.faendir.rhino_android.RhinoAndroidHelper;


public class MainActivity extends AppCompatActivity {

    //Declare All Variables
    Button btnClear;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Boolean isSmallBracketOpen;
    String processor;
    Button btnMultiply, btnPlus, btnMinus, btnDivide, btnPoint, btnLpara, btnRpara, btnEqual;
    ImageButton btnBack;
    TextView tvProcessor, tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClear=(Button) findViewById(R.id.clear);
        tvProcessor=(TextView) findViewById(R.id.txtproc);
        tvResult=(TextView) findViewById(R.id.txtres);

        tvProcessor.setText("");
        tvResult.setText("");
        btnOne=(Button) findViewById(R.id.one);
        btnTwo=(Button) findViewById(R.id.two);
        btnThree=(Button) findViewById(R.id.three);
        btnFour=(Button) findViewById(R.id.four);
        btnFive=(Button) findViewById(R.id.five);
        btnSix=(Button) findViewById(R.id.six);
        btnSeven=(Button) findViewById(R.id.seven);
        btnEight=(Button) findViewById(R.id.eight);
        btnNine=(Button) findViewById(R.id.nine);
        btnZero=(Button) findViewById(R.id.zero);

        btnMultiply=(Button) findViewById(R.id.multiply);
        btnDivide=(Button) findViewById(R.id.divide);
        btnPlus=(Button) findViewById(R.id.plus);
        btnMinus=(Button) findViewById(R.id.minus);
        btnPoint=(Button) findViewById(R.id.dot);
        btnBack=(ImageButton) findViewById(R.id.back);
        btnLpara=(Button) findViewById(R.id.Lpara);
        btnRpara=(Button) findViewById(R.id.Rpara);
        btnEqual=(Button) findViewById(R.id.equalto);


        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvProcessor.setText("");
                tvResult.setText("");
            };
        });

        btnOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"1");
            };
        });
        btnTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"2");
            };
        });
        btnThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"3");
            };
        });
        btnFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"4");
            };
        });
        btnFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"5");
            };
        });
        btnSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"6");
            };
        });
        btnSeven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"7");
            };
        });
        btnEight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"8");
            };
        });
        btnNine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"9");
            };
        });
        btnZero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"0");
            };
        });


        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"*");
            };
        });
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"/");
            };
        });
        btnPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"+");
            };
        });
        btnMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"-");
            };
        });

        btnPoint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+".");
            };
        });

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                if (processor.length()>0) {
                    processor = processor.substring(0, processor.length() - 1);
                    tvProcessor.setText(processor);
                }else {
                    tvProcessor.setText(processor);
                }
            };
        });
        btnLpara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(isSmallBracketOpen)
                {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor+")");
                }
                else {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor+"(");
                }

            };
        });
        btnRpara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(isSmallBracketOpen)
                {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor+")");
                    isSmallBracketOpen=false;
                }
                else {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor+"(");
                    isSmallBracketOpen=true;
                }

            };
        });

        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                            };
        });

    }
}