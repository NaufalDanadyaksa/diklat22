package com.example.diklat22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class SecondActivity2 extends AppCompatActivity {
    private ArrayList<itemData>itemValues;
    private RecyclerView recyclerView;
    private itemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        recyclerView=findViewById(R.id.recycler_view);
        itemValues=new ArrayList<>();
        for (int i=1;i<=10;i++){
            itemData item=new itemData();
            item.itemTitle="Title Data"+i;
            item.itemSubTitle="itemSubTitle"+i;
            itemValues.add(item);
        }
        itemAdapter=new itemAdapter(this,itemValues);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemAdapter);
    }

    public void addData(View view) {
        itemData item=new itemData();
        item.itemTitle="Title Data Update";
        item.itemSubTitle="SubTitle Data Update";
        itemValues.add(item);
        itemAdapter.notifyDataSetChanged();
    }
}