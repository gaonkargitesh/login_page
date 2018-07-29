package com.example.admin.login_page;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class sinup extends AppCompatActivity {

    private EditText fullname;

    private EditText email;

    private EditText username;

    private EditText password;

    private Button button;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinup);
        context = this;
        fullname = findViewById(R.id.fullname1);
        email = findViewById(R.id.email1);
        username = findViewById(R.id.username1);
        password = findViewById(R.id.password1);
        button = findViewById(R.id.button4);
       /* DatabaseHelper databaseHelper =  new DatabaseHelper(context);
        UserModel userModel = new UserModel();
        userModel.setFullname("Yograj");
        userModel.setEmail_id("yograj@gmail.com");
        userModel.setUsername("yograj");
        userModel.setPassword("12345");
        databaseHelper.inert_user(userModel);*/

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper databaseHelper =  new DatabaseHelper(context);
                UserModel userModel = new UserModel();
                userModel.setFullname(fullname.getText().toString());
                userModel.setEmail_id(email.getText().toString());
                userModel.setUsername(username.getText().toString());
                userModel.setPassword(password.getText().toString());
                databaseHelper.inert_user(userModel);
            }
        });
    }

}

