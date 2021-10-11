package com.zjxjwxk.leetcode._0352_Data_Stream_as_Disjoint_Intervals;

import com.zjxjwxk.leetcode.util.DSUtil;
import org.junit.jupiter.api.Test;

class SummaryRanges2Test {

    @Test
    void test() {
        SummaryRanges2 summaryRanges2 = new SummaryRanges2();
        // arr = [1]
        summaryRanges2.addNum(1);
        // 返回 [[1, 1]]
        DSUtil.printlnArr(DSUtil.boxIntArr(summaryRanges2.getIntervals()));
        // arr = [1, 3]
        summaryRanges2.addNum(3);
        // 返回 [[1, 1], [3, 3]]
        DSUtil.printlnArr(DSUtil.boxIntArr(summaryRanges2.getIntervals()));
        // arr = [1, 3, 7]
        summaryRanges2.addNum(7);
        // 返回 [[1, 1], [3, 3], [7, 7]]
        DSUtil.printlnArr(DSUtil.boxIntArr(summaryRanges2.getIntervals()));
        // arr = [1, 2, 3, 7]
        summaryRanges2.addNum(2);
        // 返回 [[1, 3], [7, 7]]
        DSUtil.printlnArr(DSUtil.boxIntArr(summaryRanges2.getIntervals()));
        // arr = [1, 2, 3, 6, 7]
        summaryRanges2.addNum(6);
        // 返回 [[1, 3], [6, 7]]
        DSUtil.printlnArr(DSUtil.boxIntArr(summaryRanges2.getIntervals()));
    }
}