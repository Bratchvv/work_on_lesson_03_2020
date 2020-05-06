package com.company.lab19;

import com.company.lab15.abstracts.AbstractDevice;
import com.company.lab15.abstracts.EltTv;
import com.company.lab15.abstracts.LedTv;
import com.company.lab15.abstracts.Mobile;
import com.company.lab15.abstracts.Tv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args) {
        List<AbstractDevice> list = new ArrayList<>();

        Tv eltTv = new EltTv();
        eltTv.setName("5 Десна");
        list.add(eltTv);

        AbstractDevice mobile = new Mobile();
        mobile.setName("2 Motorola");
        list.add(mobile);


        Tv ledTv = new LedTv();
        ledTv.setName("1 Samsung led2");
        list.add(ledTv);

        Mobile mobile2 = new Mobile();
        mobile2.setName("3 Iphone");
        list.add(mobile2);

        System.out.println(list);
        Collections.sort(list, new Comparator<AbstractDevice>() {
            @Override
            public int compare(AbstractDevice o1, AbstractDevice o2) {
                int v = o1.compareTo(o2);
                return v; // it can also return 0, and 1
            }
        });
        System.out.println(list);
    }
}
