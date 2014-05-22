package com.e1231231.testandriodapp;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, btnClear, btnPlusMinus, btnDot, btnAdd, btnEquals, btnMinus, btnMultiply, btnDevide;
	private TextView ansField;
	static double firstNum, secondNum, ans, negpos;
	static int clearField = 0, addClick = 0, subClick = 0, multiClick = 0, divClick = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        clearField = 0;
        
        
        ansField = (TextView) findViewById(R.id.ansField);
        
        num1 = (Button) findViewById(R.id.btnNum1); num1.setOnClickListener(this);
        num2 = (Button) findViewById(R.id.btnNum2); num2.setOnClickListener(this);
        num3 = (Button) findViewById(R.id.btnNum3); num3.setOnClickListener(this);
        num4 = (Button) findViewById(R.id.btnNum4); num4.setOnClickListener(this);
        num5 = (Button) findViewById(R.id.btnNum5); num5.setOnClickListener(this);
        num6 = (Button) findViewById(R.id.btnNum6); num6.setOnClickListener(this);
        num7 = (Button) findViewById(R.id.btnNum7); num7.setOnClickListener(this);
        num8 = (Button) findViewById(R.id.btnNum8); num8.setOnClickListener(this);
        num9 = (Button) findViewById(R.id.btnNum9); num9.setOnClickListener(this);
        num0 = (Button) findViewById(R.id.btnNum0); num0.setOnClickListener(this);
        
        btnClear = (Button) findViewById(R.id.btnClear); btnClear.setOnClickListener(this);
        
        //add btn
        btnAdd = (Button) findViewById(R.id.btnAdd); btnAdd.setOnClickListener(this);
        
        //minus
        btnMinus = (Button) findViewById(R.id.btnMinus); btnMinus.setOnClickListener(this);
        
        // multiply
        btnMultiply = (Button) findViewById(R.id.btnMultiply); btnMultiply.setOnClickListener(this);
        
        
        //devide 
        btnDevide = (Button) findViewById(R.id.btnDivide); btnDevide.setOnClickListener(this);
        
        //equals
        btnEquals = (Button) findViewById(R.id.btnEquals); btnEquals.setOnClickListener(this);
        
        //decimal DOT
        btnDot = (Button) findViewById(R.id.btnDot); btnDot.setOnClickListener(this);
        
        //plusminus
        btnPlusMinus = (Button) findViewById(R.id.btnPlusMinus); btnPlusMinus.setOnClickListener(this);
        
        
       
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()) {
			case R.id.btnNum1:
					if ( ansField.getText().length() < 16) {
						if ( clearField == 1) {
							ansField.setText("1");
							clearField = 0;
						} else {
							ansField.setText(ansField.getText() + "1");
						}
					}
					break;

			case R.id.btnNum2:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("2");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "2");
					}
				}
				break;

			case R.id.btnNum3:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("3");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "3");
					}
				}
				break;
				
			case R.id.btnNum4:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("4");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "4");
					}
				}
				break;
				
			case R.id.btnNum5:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("5");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "5");
					}
				}
				break;
				
			case R.id.btnNum6:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("6");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "6");
					}
				}
				break;
				
			case R.id.btnNum7:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("7");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "7");
					}
				}
				break;
				
			case R.id.btnNum8:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("8");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "8");
					}
				}
				break;
				
			case R.id.btnNum9:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("9");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "9");
					}
				}
				break;
				
			case R.id.btnNum0:
				if ( ansField.getText().length() < 16) {
					if ( clearField == 1) {
						ansField.setText("0");
						clearField = 0;
					} else {
						ansField.setText(ansField.getText() + "0");
					}
				}
				break;
				
			case R.id.btnPlusMinus:
				if (ansField.getText().equals("") || ansField.getText().equals("-")) {
					ansField.setText("-");
				} else {
					negpos = (Double.parseDouble(String.valueOf(ansField.getText())));
					negpos *= -1;
					ansField.setText(String.valueOf(negpos));
				}
				break;
				
			case R.id.btnDot:
				if ( ((String) ansField.getText()).contains(".")) {
					ansField.setText(ansField.getText());
				} else {
					ansField.setText(ansField.getText() + ".");
				}
				break;
				
			case R.id.btnClear:
				ansField.setText("");
				clearField = 1;
				firstNum = 0;
				secondNum = 0;
				addClick = 0;
				multiClick = 0;
				subClick = 0;
				divClick = 0;
				break;
			

			
			case R.id.btnEquals:
				secondNum = Double.parseDouble((String) ansField.getText());
				if (addClick == 1) {
					ans = firstNum + secondNum;
					ansField.setText(String.valueOf(ans));
					addClick = 0;
				}
				if (subClick == 1) {
					ans = firstNum - secondNum;
					ansField.setText(String.valueOf(ans));
					subClick = 0;
				}
				if (multiClick == 1) {
					ans = firstNum * secondNum;
					ansField.setText(String.valueOf(ans));
					multiClick = 0;
				}
				if (divClick == 1) {
					ans = firstNum / secondNum;
					ansField.setText(String.valueOf(ans));
					divClick = 0;
				}
				break; 
				
			case R.id.btnAdd:
					if (ansField.getText() != null) {
						firstNum = Double.parseDouble((String) ansField.getText());
						addClick = 1;
						clearField = 1;
					}
				break;
				
			case R.id.btnMinus:
					if (ansField.getText() != null) {
						firstNum = Double.parseDouble((String) ansField.getText());
						subClick = 1;
						clearField = 1;
					}
				break;
				
			case R.id.btnMultiply:
					if (ansField.getText() != null) {
						firstNum = Double.parseDouble((String) ansField.getText());
						multiClick = 1;
						clearField = 1;
					}
				break;
				
			case R.id.btnDivide:
					if (ansField.getText() != null) {
						firstNum = Double.parseDouble((String) ansField.getText());
						divClick = 1;
						clearField = 1;
					}
				break;
		}
		
	}  

}
