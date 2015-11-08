package com.parse.dukehack;

import com.parse.dukehack.model.Sponsor;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static final List<Sponsor> sponsors = new ArrayList<>();

    static {
        sponsors.add(new Sponsor(R.drawable.yikyak, "YikYak", R.color.sienna, "Sport", "Literature", "Music", "Art", "Technology"));
        sponsors.add(new Sponsor(R.drawable.fb320x320, "Bluemix", R.color.saffron, "Travelling", "Flights", "Books", "Painting", "Design"));
        sponsors.add(new Sponsor(R.drawable.fb320x320, "Facebook", R.color.green, "Sales", "Pets", "Skiing", "Hairstyles", "Сoffee"));
        sponsors.add(new Sponsor(R.drawable.twitter, "SnapChat", R.color.pink, "Android", "Development", "Design", "Wearables", "Pets"));
        sponsors.add(new Sponsor(R.drawable.yikyak, "YikYak", R.color.orange, "Design", "Fitness", "Healthcare", "UI/UX", "Chatting"));
        sponsors.add(new Sponsor(R.drawable.yikyak, "SnapChat", R.color.saffron, "Development", "Android", "Healthcare", "Sport", "Rock Music"));
        sponsors.add(new Sponsor(R.drawable.twitter, "twitter", R.color.green, "Cinema", "Music", "Tatoo", "Animals", "Management"));
        sponsors.add(new Sponsor(R.drawable.yalantis, "YALANTIS", R.color.purple, "Android", "IOS", "Application", "Development", "Company"));
    }
}
