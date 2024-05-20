package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<ItemData> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();

        items.add(new ItemData(R.drawable.img1, "Chiang Kai-shek Memorial Hall", "The Chiang Kai-shek Memorial Hall is a national monument and tourist attraction erected in memory of Chiang Kai-shek, former President of the Republic of China. It is located in Taipei, Taiwan. The monument, surrounded by a park, stands at the east end of Memorial Hall Square.", "https://maps.app.goo.gl/yNvh4nV4SBqf48JV9"));
        items.add(new ItemData(R.drawable.img2, "National Palace Museum", "The National Palace Museum is a museum in Taipei, Taiwan. It has a permanent collection of nearly 700,000 pieces of Chinese artifacts and artworks, the majority of which were moved from the Palace Museum in the Forbidden City as well as five other institutions in mainland China during the ROC retreat.", "https://maps.app.goo.gl/3WCE2exdLDoPHR5KA"));
        items.add(new ItemData(R.drawable.img3, "Lungshan Temple", "Bangka Lungshan Temple is a Chinese folk religious temple in Wanhua District, Taipei, Taiwan. The temple was built in Taipei in 1738 by settlers from Fujian during Qing rule in honor of Guanyin. It served as a place of worship and a gathering place for the Chinese settlers.","https://maps.app.goo.gl/65N6uqRTHpDkD2Jv9"));
        items.add(new ItemData(R.drawable.img4, "Taipei Zoo", "The Taipei Zoo, sometimes referred to as the Muzha Zoo, is a public zoological garden in Wenshan District, Taipei, Taiwan. It is the most famous zoological garden in Taiwan and a leader in conservation, research and education, and recreation", "https://maps.app.goo.gl/4d9GWMcNUcqNRS9o8"));
        items.add(new ItemData(R.drawable.img5, "Yangmingshan National Park", "Yangmingshan National Park is one of the nine national parks in Taiwan, located in both Taipei and New Taipei City. The districts that are partially in the park include Taipei's Beitou and Shilin Districts; and New Taipei's Wanli, Jinshan, Sanzhi and Tamsui Districts.","https://maps.app.goo.gl/xakXoQtKYiM5DZjS7"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, items);
        recyclerView.setAdapter(adapter);

    }

}