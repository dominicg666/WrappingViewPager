package viewpagerwc.ui.dom.wcviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import viewpagerwc.ui.dom.wrapping.WrappingFragmentStatePagerAdapter;
import viewpagerwc.ui.dom.wrapping.WrappingViewPager;

public class MainActivity extends AppCompatActivity {

    private WrappingViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViewPager();
    }
    private void setupViewPager() {
        viewPager = (WrappingViewPager) findViewById(R.id.viewpager);

        // Using one of the provided adapter so we don't have to implement page changing logic ourselves
        viewPager.setAdapter(new WrappingFragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return ContentFragment.newInstance(getString(R.string.tab_foo_content));
                    case 1:
                        return ContentFragment.newInstance(getString(R.string.tab_foobar_content));
                    case 2:
                        return ContentFragment.newInstance(getString(R.string.tab_bar_content));
                    default:
                        return ContentFragment.newInstance(getString(R.string.tab_wtf));
                }
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return getString(R.string.tab_foo);
                    case 1:
                        return getString(R.string.tab_foobar);
                    case 2:
                        return getString(R.string.tab_bar);
                    default:
                        return getString(R.string.tab_wtf);
                }
            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(viewPager);
        }
    }
}
