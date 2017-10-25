package com.ckt.test.androidslidetoolbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by D22432 on 2017/10/20.
 */

public class ToolbarFragment extends Fragment {
    public static String TABLAYOUT_FRAGMENT = "tab_fragment";
    private TextView txt;
    private int type;

    public static ToolbarFragment newInstance(int type) {
        ToolbarFragment fragment = new ToolbarFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(TABLAYOUT_FRAGMENT, type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            type = (int) getArguments().getSerializable(TABLAYOUT_FRAGMENT);
        }

    }
    public static final String[] tabTitle = new String[]{"综艺", "体育", "新闻", "热点", "头条", "军事", "历史", "科技", "人文", "地理"};
    private TabLayout tab;
    private ViewPager vp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tablayout, container, false);
        initView(view);

//        tab = view.findViewById(R.id.tab);
//        vp = view.findViewById(R.id.viewpager);
//
//        for (String str : tabTitle){
//            tab.addTab(tab.newTab().setText(str));
//        }

        /**
         * 还要写点东西，你ViewPager的Adapter写好了吗
         *
         * 把剩下的补上，就可以动起来了。
         * 0o0
         * 好的
         */

        return view;
    }


    protected void initView(View view) {
        txt =  view.findViewById(R.id.tab_txt);


        switch (type) {
            case 1:
                txt.setText("这是综艺Fragment");
                break;
            case 2:
                txt.setText("这是体育Fragment");
                break;
            case 3:
                txt.setText("这是新闻Fragment");
                break;
            case 4:
                txt.setText("这是热点Fragment");
                break;
            case 5:
                txt.setText("这是头条Fragment");
                break;
            case 6:
                txt.setText("这是军事Fragment");
                break;
            case 7:
                txt.setText("这是历史Fragment");
                break;
            case 8:
                txt.setText("这是科技Fragment");
                break;
            case 9:
                txt.setText("这是人文Fragment");
                break;
            case 10:
                txt.setText("这是地理Fragment");
                break;
        }


    }

}
