package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        int buttonId = v.getId(); // 사용자가 누른 사칙연산 버튼의 Id
        EditText et1 = findViewById(R.id.num1); // 첫번째 입력 숫자를 표시하는 객체
        EditText et2 = findViewById(R.id.num2); // 두번째 입력 숫자를 표시하는 걕체
        TextView res = findViewById(R.id.result); // 계산 결과를 표시하는 객체
        float result; // 계산 결과 값을 저장하는 변수

        if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "계산을 할 두 개의 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        int n1 = Integer.parseInt(et1.getText().toString()); // 첫번째 칸에 입력한 숫자
        int n2 = Integer.parseInt(et2.getText().toString()); // 두번째 칸에 입력한 숫자


        if(buttonId == R.id.plus) {
            // 덧셈 계산
            result = n1 + n2;

            // 계산 결과를 화면에 표시하기 위한 명령문
            //res.setText(Float.toString(result));

        } else if(buttonId == R.id.minus) {
            // 뺄셈 계산

            // 계산 결과를 화면에 표시하기 위한 명령문

        } else if(buttonId == R.id.multiply) {
            // 곱셈 계산

            // 계산 결과를 화면에 표시하기 위한 명령문

        } else if(buttonId == R.id.divide) {
            // 나눗셈 계산

            // 계산 결과를 화면에 표시하기 위한 명령문

        } else if(buttonId == R.id.clear) {
            // 초기화 - 모든 내용 삭제

            // 화면 상에 초기화 메시지 표시
            Toast.makeText(getApplicationContext(), "초기화합니다.", Toast.LENGTH_SHORT).show();
        }
    }
}
