package com.parse.dukehack;

import com.parse.dukehack.model.Sponsor;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static final List<Sponsor> sponsors = new ArrayList<>();

    static {
        sponsors.add(new Sponsor(R.drawable.tacobell, "TacoBell", R.color.sienna, "Sport", "Literature", "Music", "Art", "Technology"));
        sponsors.add(new Sponsor(R.drawable.mcdonalds, "MCDonalds", R.color.saffron, "Travelling", "Flights", "Books", "Painting", "Design"));
        sponsors.add(new Sponsor(R.drawable.tgif, "Tgif", R.color.green, "Sales", "Pets", "Skiing", "Hairstyles", "Сoffee"));
        sponsors.add(new Sponsor(R.drawable.tacobell, "Tacobell", R.color.pink, "Android", "Development", "Design", "Wearables", "Pets"));
        sponsors.add(new Sponsor(R.drawable.mcdonalds, "McDonalds", R.color.orange, "Design", "Fitness", "Healthcare", "UI/UX", "Chatting"));
        sponsors.add(new Sponsor(R.drawable.tgif, "Tgif", R.color.saffron, "Development", "Android", "Healthcare", "Sport", "Rock Music"));
        sponsors.add(new Sponsor(R.drawable.tacobell, "Tacobell", R.color.green, "Cinema", "Music", "Tatoo", "Animals", "Management"));
        sponsors.add(new Sponsor(R.drawable.mcdonalds, "McDonalds", R.color.purple, "Android", "IOS", "Application", "Development", "Company"));
    }
}
