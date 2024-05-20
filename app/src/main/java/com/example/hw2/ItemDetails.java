package com.example.hw2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetails extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        getIncomingContent();
        setUpUrlButton();
    }

    private void getIncomingContent() {
        String itemName = getIntent().getStringExtra("itemName");
        Integer itemImage = getIntent().getIntExtra("itemImage", 0);
        String itemDesc = getIntent().getStringExtra("itemDesc");
        String itemUrl = getIntent().getStringExtra("itemUrl");
        setDetails(itemName, itemImage, itemDesc, itemUrl);
    }

    private void setDetails(String itemName, Integer itemImage, String itemDesc, String itemUrl) {
        ImageView detailItemImage = findViewById(R.id.detailItemImage);
        TextView detailItemName = findViewById(R.id.detailItemName);
        TextView detailItemDesc = findViewById(R.id.detailItemDesc);
        detailItemImage.setImageResource(itemImage);
        detailItemName.setText("Name: " + itemName);
        detailItemDesc.setText("Introduction: " + itemDesc);
    }

    private void setUpUrlButton() {
        Button urlButton = findViewById(R.id.urlButton);
        urlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = getIntent().getStringExtra("itemUrl");
                if (url != null && !url.isEmpty()) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            }
        });
    }

}
