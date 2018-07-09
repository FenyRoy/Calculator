package in.teamcodesparrow.calculator;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.faendir.rhino_android.RhinoAndroidHelper;

import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    //Declare All Variables
    Button btnClear;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Integer isSmallBracketOpen=0;
    Double result;
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
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor+"1");
            }
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

                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor+"(");
                    isSmallBracketOpen+=1;



            };
        });
        btnRpara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(isSmallBracketOpen>0)
                {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor+")");
                    isSmallBracketOpen-=1;
                }


            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    processor = tvProcessor.getText().toString();
                    result = evaluate(processor);
                    tvResult.setText(result.toString());
                    processor=result.toString();
                    tvProcessor.setText(processor);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tvResult.setText("");
                        }
                    }, 5000);
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Check The Expression",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    public static double evaluate(final String str)  {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }


}