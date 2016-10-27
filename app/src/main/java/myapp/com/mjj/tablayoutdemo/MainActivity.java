package myapp.com.mjj.tablayoutdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * TabLayout使用
 * <p>
 * tabLayout.getSelectedTabPosition()返回tab当前选中的tab的索引.
 */
public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<String> tabList = new ArrayList<>(); // 第一种添加方式时使用

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TabLayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

//        for (int i = 0; i < 5; i++) {
//            tabList.add("add方式添加 " + i);
//        }

        //为TabLayout添加tab名称
//        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(0)));
//        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(1)));
//        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(2)));
//        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(3)));

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        // 第一种方式添加tab时使用
//        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),
//                tabList,this);
        // 第二种方式添加tab时使用
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),
                this);
        viewPager.setAdapter(adapter);

        // 一站式管理方式：setupWithViewPager()方法底部会调用FragmentPagerAdapter中的getPageTitle()方法.
        tabLayout.setupWithViewPager(viewPager);
    }
}
