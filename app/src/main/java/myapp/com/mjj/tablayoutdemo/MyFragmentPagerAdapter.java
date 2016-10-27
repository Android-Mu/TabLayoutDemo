package myapp.com.mjj.tablayoutdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Viewpager适配器
 */
class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] titles = new String[]{"军事", "热点", "正能量", "数码", "科技", "视频", "游戏", "历史", "音乐"};
    private Context context;
    private List<String> list;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    public MyFragmentPagerAdapter(FragmentManager fm, List<String> list, Context context) {
        super(fm);
        this.list = list;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return BlankFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return titles.length; //list.size();
    }

    // TabLayout关联viewpager时会调用此方法.
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position]; // list.get(position)
    }

}
