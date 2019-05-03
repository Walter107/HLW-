package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private TextView mTextMessage;
    android.support.v7.widget.Toolbar toolbar;
    private SearchView mSearchView;
    private AutoCompleteTextView mAutoCompleteTextView;//搜索输入框
    private ImageView mDeleteButton;//搜索框中的删除按钮
    private Button mBtnNext;//下一界面按钮
    NavigationView navigationView;

    //底部导航栏
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    android.support.constraint.ConstraintLayout constraintLayout = findViewById(R.id.container);
                    constraintLayout.setBackgroundResource(R.drawable.u1);
//                    mTextMessage.setText(R.string.title_clouse);
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_food);
                    android.support.constraint.ConstraintLayout constraintLayout1 = findViewById(R.id.container);
                    constraintLayout1.setBackgroundResource(R.drawable.u2);
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_house);
                    android.support.constraint.ConstraintLayout constraintLayout2 = findViewById(R.id.container);
                    constraintLayout2.setBackgroundResource(R.drawable.u3);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = findViewById(R.id.Navigation_View);
        navigationView.setItemIconTintList(null);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("MyChoose");
        //设置支持toolbar
        setSupportActionBar(toolbar);
        //退出图标设置
        toolbar.setNavigationIcon(R.drawable.tuichu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //右上菜单点击事件设置
        toolbar.setOnMenuItemClickListener(new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String str = null;
                switch (menuItem.getItemId())
                {
                    case R.id.item1:
                        str="magic ball";
                        break;
                    case R.id.item2:
                        str="222";
                        break;
                    case R.id.item3:
                        str="333";
                        break;
                }
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        //抽屉菜单的点击事件
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.item1:
                        break;
                    case R.id.item2:
                        break;
                    case R.id.item3:
                        break;
                    case R.id.item4:
                        break;
                    case R.id.item5:
                        break;
                    case R.id.item6:
                        break;
                }
                return false;
            }
        });


        //下方菜单栏设置
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

    //导入菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }



}
