package com.bigkoo.pickerview.listener;

import android.view.View;

import java.util.Date;

/**
 * Created by fudetian on 2017/11/7.
 */

public interface OnScollStopListener {
    void OnItemScollStop(Date date, View v);
    void OnItemScollStop(int[] posArr, View v);
}
