package com.example.sandwichprice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView price;
    int sand;
    int top;
    int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        price = findViewById(R.id.price);

        sand = 0; // 샌드위치 가격을 저장할 변수
        top = 0; // 토핑 가격을 저장할 변수
        total = 0; // 합계 금액을 저장할 변수
    }

    public void onClick(View view) {
        // click 이벤트가 발생한 view 객체 구분
        switch (view.getId()) {
            case R.id.ham:
                // 햄 샌드위치 가격 설정
                sand = 5000;
                break;
            case R.id.tuna:
                // 튜나 샌드위치 가격 설정

                break;
            case R.id.chicken:
                // 치킨 샌드위치 가격 설정

                break;
            case R.id.bacon:
                // 베이컨 체크 박스 이벤트
                if(((CheckBox)view).isChecked())
                    // 베이컨 토핑 가격 더하기
                    top += 1000;
                else
                    // 베이컨 토핑 가격 빼기

                break;
            case R.id.cheese:
                // 치즈 체크 박스 이벤트
                if(((CheckBox)view).isChecked())
                    // 치즈 토핑 가격 더하기
                    ;
                else
                    // 치즈 토핑 가격 빼기

                break;
            case R.id.avocado:
                // 아보카도 체크 박스 이벤트
                if(((CheckBox)view).isChecked())
                    // 아보카도 토핑 가격 더하기
                    ;
                else
                    // 아보카도 토핑 가격 빼기

                break;
        }
        // 합계 금액 계산하기


        // 합계 금액을 화면에 표시하기
        price.setText(Integer.toString(total));
    }
}
