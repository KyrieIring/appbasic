package com.fedming.bottomnavigationdemo;


/**
 * Created by Administrator on 2018/1/22 0022.
 */

public class FragmentFactory {
    private static NewsFragment sNewsFragment;
    private static BookFragment sBookFragment;
    private static FindFragment sFindFragment;
    private static MoreFragment sMoreFragment;
    public static BaseFragment getFragment(int position){
        BaseFragment baseFragment =null;
        switch (position){
            case 0:
                if (sNewsFragment==null){
                    sNewsFragment = new NewsFragment();
                }
                baseFragment = sNewsFragment;
                break;
            case 1:
                if (sBookFragment==null){
                    sBookFragment = new BookFragment();
                }
                baseFragment = sBookFragment;
                break;
            case 2:
                if (sFindFragment==null){
                    sFindFragment = new FindFragment();
                }
                baseFragment = sFindFragment;
                break;
            case 3:
                if (sMoreFragment==null){
                    sMoreFragment = new MoreFragment();
                }
                baseFragment = sMoreFragment;
                break;
        }
        return baseFragment;
    }
}
