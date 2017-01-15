package com.example.android.samplelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView trendingFoodsRecyclerView = (RecyclerView) findViewById(R.id.trendingfoods_recycle_view);
        LinearLayoutManager trendingLayoutManager = new LinearLayoutManager(this);
        trendingLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        trendingFoodsRecyclerView.setLayoutManager(trendingLayoutManager);

        CustomRecyclerAdapter trendingFoodsAdapter = new CustomRecyclerAdapter(trendingFoodList(), R.layout.item);
        trendingFoodsRecyclerView.setAdapter(trendingFoodsAdapter);

        RecyclerView bestDealsRecyclerView = (RecyclerView) findViewById(R.id.bestdeal_recycle_view);
        LinearLayoutManager dealLayoutManager = new LinearLayoutManager(this);
        dealLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        bestDealsRecyclerView.setLayoutManager(dealLayoutManager);

        CustomRecyclerAdapter bestDealsAdapter = new CustomRecyclerAdapter(bestDealsList(), R.layout.item);
        bestDealsRecyclerView.setAdapter(bestDealsAdapter);

        RecyclerView restaurantsRecyclerView = (RecyclerView) findViewById(R.id.restaurant_recycle_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        restaurantsRecyclerView.setLayoutManager(gridLayoutManager);

        CustomRecyclerAdapter restaurantAdapter = new CustomRecyclerAdapter(restaurantsList(), R.layout.item);
        restaurantsRecyclerView.setAdapter(restaurantAdapter);

    }

    private List<Item> trendingFoodList() {

        List<Item> items = new ArrayList<>();

        items.add(new Item(0, "BURGER", "#5C6BC0","#FFFFFF", 88, 88));
        items.add(new Item(1, "SET MENU", "#7E57C2","#FFFFFF", 88, 88 ));
        items.add(new Item(2, "TEHARI", "#5C6BC0","#FFFFFF", 88, 88));
        items.add(new Item(3, "BURGER", "#7E57C2","#FFFFFF", 88, 88));
        items.add(new Item(4, "BURGER", "#5C6BC0","#FFFFFF", 88, 88));
        items.add(new Item(5, "SET MENU", "#7E57C2","#FFFFFF", 88, 88 ));
        items.add(new Item(6, "TEHARI", "#5C6BC0","#FFFFFF", 88, 88));
        items.add(new Item(7, "BURGER", "#7E57C2","#FFFFFF", 88, 88));
        items.add(new Item(8, "BURGER", "#5C6BC0","#FFFFFF", 88, 88));
        items.add(new Item(9, "SET MENU", "#7E57C2","#FFFFFF", 88, 88 ));
        items.add(new Item(10, "TEHARI", "#5C6BC0","#FFFFFF", 88, 88));
        items.add(new Item(11, "BURGER", "#7E57C2","#FFFFFF", 88, 88));
        return items;
    }

    private List<Item> bestDealsList() {

        List<Item> items = new ArrayList<>();

        items.add(new Item(0, "", "#3949AB","#FFFFFF", 188, 88));
        items.add(new Item(1, "", "#3949AB","#FFFFFF", 188, 88));

        return items;
    }

    private List<Item> restaurantsList() {

        List<Item> items = new ArrayList<>();

        items.add(new Item(0, "ORDERS UP", "#5E35B1","#FFFFFF", 88, 88));
        items.add(new Item(1, "2 CUPS", "#5E35B1","#FFFFFF", 88, 88 ));
        items.add(new Item(2, "FRIZZLES", "#5E35B1","#FFFFFF", 88, 88));
        items.add(new Item(3, "RAHAMANIA", "#5E35B1","#FFFFFF", 88, 88));
        items.add(new Item(4, "KHAN TEHARI", "#5E35B1","#FFFFFF", 88, 88));
        items.add(new Item(5, "ORDERS UP", "#5E35B1","#FFFFFF", 88, 88));
        items.add(new Item(6, "2 CUPS", "#5E35B1","#FFFFFF", 88, 88 ));
        items.add(new Item(7, "FRIZZLES", "#5E35B1","#FFFFFF", 88, 88));
        items.add(new Item(8, "RAHAMANIA", "#5E35B1","#FFFFFF", 88, 88));
        items.add(new Item(9, "KHAN TEHARI", "#5E35B1","#FFFFFF", 88, 88));

        return items;
    }

}
