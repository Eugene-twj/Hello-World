package com.example.eugene.bmob_train_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;



public class MainActivity extends AppCompatActivity {
    public static final String TAG = "bmob" ;
    private EditText User_login_name,User_login_password;
    private Button User_login,User_sign_activity_turn;

//    private String user_name,user_password;
//    private int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        //第一：默认初始化
        Bmob.initialize(this, "346d17a05316b79b0ee88abbf9e328cc");
        InitView();
//        SignActivity();
        LoginActivity();

//        user.setId(0);
//        user.setUsername("000");
//        user.setPassword("666");
//        user.save(new SaveListener<String>() {
//            @Override
//            public void done(String s, BmobException e) {
//
//            }
//        });
        /**
         * 添加数据
         */
//        person.setName("Eugene");
//        person.setAddress("shannxi");
//        person.save(new SaveListener<String>() {
//            public static final String TAG = "bmob" ;
//
//            /**
//             *
//             * @param s object id
//             * @param e
//             */
//            @Override
//            public void done(String s, BmobException e) {
//                if (e==null){
//                    Toast.makeText(MainActivity.this,"添加数据成功",Toast.LENGTH_LONG).show();
//                    Log.i(TAG,s);
//                }else {
//                    Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
//                }
//            }
//        });
        /**
         * 查询数据
         */
//        BmobQuery<Person> query = new BmobQuery<>();
//        query.getObject("933db9a6c8", new QueryListener<Person>() {
//            @Override
//            public void done(Person person, BmobException e) {
//                if (e==null){
////                    Toast.makeText(MainActivity.this,"查询成功",Toast.LENGTH_LONG).show();
//                    show(person.toString());
//                }else {
//                    Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
//                }
//            }
//        });
        /**
         * 更新数据
         */
//        person.setName("唐三");
//        person.setAddress("陕西西安");
//        person.update("f8f82efea9",new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if (e==null){
//                    show("update success");
//                }
//            }
//        });
        /**
         * 删除数据
         */
//        person.setObjectId("f8f82efea9");
//        person.delete(new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if (e==null){
//                    show("delete success");
//                }
//            }
//        });
//
    // 注册页面跳转
        User_sign_activity_turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
    public void InitView(){
        //登录view初始化
        User_login_name = (EditText) findViewById(R.id.User_login_name);
        User_login_password = (EditText) findViewById(R.id.User_login_password);

        //注册及登录按钮

        User_login = (Button) findViewById(R.id.User_login);
        //注册页面跳转按钮
        User_sign_activity_turn = (Button) findViewById(R.id.User_sign_activity_turn);
    }

    //登录
    public void LoginActivity(){

        User_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 BmobUser user = new Users();
                user.setUsername(User_login_name.getText().toString());
                user.setPassword(User_login_password.getText().toString());
                user.login(new SaveListener<Users>() {
                    @Override
                    public void done(Users users, BmobException e) {
                        if (e==null){
                            show("登录成功");
                        }else {
                            show("登录失败");
                        }
                    }
                });
            }
        });


    }


    public String getText(EditText editText){

        return editText.getText().toString();
    }
    public void show(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
    }
}

