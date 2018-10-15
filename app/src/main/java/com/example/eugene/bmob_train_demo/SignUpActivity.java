package com.example.eugene.bmob_train_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * Created by Administrator on 2018/10/1.
 */

public class SignUpActivity extends AppCompatActivity {
    private EditText User_sign_name,User_sign_password,User_sign_password_confirm;
    private String user_name_1,user_password_1,user_password_confirm_1;
    private Button User_sign;


    private String TAG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);
        InitView();
        SignActivity();
    }

    public void InitView(){
        //注册view初始化
        User_sign_name = (EditText) findViewById(R.id.User_sign_name);
        User_sign_password = (EditText) findViewById(R.id.User_sign_password);
//        User_sign_password_confirm = (EditText) findViewById(R.id.User_sign_password_confirm);
        //注册按钮
        User_sign = (Button) findViewById(R.id.User_sign);

    }
    //注册
    public void SignActivity(){

//        user_1.setEmail("10344142322@qq.com");
//        user_1.setPassword_confirm(user_password_confirm_1);
//        if (user_password_1.equals(user_password_confirm_1)){
        User_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BmobUser users = new BmobUser();
                users.setUsername(User_sign_name.getText().toString());

                users.setPassword(User_sign_password.getText().toString());
                Log.i(TAG,"密码：" + User_sign_password.getText().toString());
//                if (user_password_confirm_1.equals(user_password_1))
                users.signUp(new SaveListener<Users>() {
                    @Override
                    public void done(Users users, BmobException e) {
                        if (e==null){
                            show(" 注册成功");
                            Log.i(TAG,"密码：" + User_sign_password.getText().toString());
                        }else {
                            show("注册失败");
//                            Log.i(TAG,"用户名"+ user_name_1);
                        }
                    }
                });
            }
        });
//        }else {
//            show("两次输入的密码不一致，请再次输入");
//        }

    }
//    public String getText(EditText editText){
//
//        return editText.getText().toString();
//    }
    public void show(String msg){
        Toast.makeText(SignUpActivity.this,msg,Toast.LENGTH_LONG).show();
    }
}
