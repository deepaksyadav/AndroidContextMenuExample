package org.professord.contextmenuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edit1;
    EditText edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText)findViewById(R.id.editText1);
        edit2 = (EditText)findViewById(R.id.editText2);
        registerForContextMenu(edit1);
        registerForContextMenu(edit2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case R.id.editText1:
                getMenuInflater().inflate(R.menu.context_menu,menu);
                break;
            case R.id.editText2:
                getMenuInflater().inflate(R.menu.context_menu2,menu);
                break;

        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(this, "Context menu Item 1 Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option2:
                Toast.makeText(this, "Context menu Item 2 Selected",Toast.LENGTH_SHORT).show();
                return true;
        }
        return true;
    }
}