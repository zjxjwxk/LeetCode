package com.zjxjwxk.leetcode._0065_Valid_Number;

import java.util.HashMap;
import java.util.Map;

/**
 * 确定有限状态自动机
 * @author Xinkang Wu
 * @date 2021/6/19 21:38
 */
public class Solution {

    public boolean isNumber(String s) {
        char[] chArr = s.toCharArray();
        Map<State, Map<CharType, State>> transferMap = new HashMap<>();
        Map<CharType, State> initialMap = new HashMap<CharType, State>(3){{
            put(CharType.CHAR_SIGN, State.STATE_INT_SIGN);
            put(CharType.CHAR_NUMBER, State.STATE_INT);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
        }};
        transferMap.put(State.STATE_INITIAL, initialMap);
        Map<CharType, State> intSignMap = new HashMap<CharType, State>(2) {{
            put(CharType.CHAR_NUMBER, State.STATE_INT);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
        }};
        transferMap.put(State.STATE_INT_SIGN, intSignMap);
        Map<CharType, State> intMap = new HashMap<CharType, State>(2) {{
            put(CharType.CHAR_NUMBER, State.STATE_INT);
            put(CharType.CHAR_POINT, State.STATE_POINT);
            put(CharType.CHAR_EXP, State.STATE_EXP);
        }};
        transferMap.put(State.STATE_INT, intMap);
        Map<CharType, State> pointMap = new HashMap<CharType, State>(2){{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
        }};
        transferMap.put(State.STATE_POINT, pointMap);
        Map<CharType, State> pointWithoutIntMap = new HashMap<CharType, State>(){{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
        }};
        transferMap.put(State.STATE_POINT_WITHOUT_INT, pointWithoutIntMap);
        Map<CharType, State> fractionMap = new HashMap<CharType, State>(2){{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
        }};
        transferMap.put(State.STATE_FRACTION, fractionMap);
        Map<CharType, State> expMap = new HashMap<CharType, State>(2){{
            put(CharType.CHAR_SIGN, State.STATE_EXP_SIGN);
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transferMap.put(State.STATE_EXP, expMap);
        Map<CharType, State> expSignMap = new HashMap<CharType, State>(1) {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transferMap.put(State.STATE_EXP_SIGN, expSignMap);
        Map<CharType, State> expNumberMap = new HashMap<CharType, State>(1) {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transferMap.put(State.STATE_EXP_NUMBER, expNumberMap);
        State curState = State.STATE_INITIAL;
        for (char ch : chArr) {
            Map<CharType, State> map = transferMap.get(curState);
            State nextState = map.get(toCharType(ch));
            if (nextState == null) {
                return false;
            }
            curState = nextState;
        }
        return curState == State.STATE_INT || curState == State.STATE_POINT || curState == State.STATE_FRACTION || curState == State.STATE_EXP_NUMBER;
    }

    private CharType toCharType(char ch) {
        if (ch == '-' || ch == '+') {
            return CharType.CHAR_SIGN;
        } else if (ch >= '0' && ch <= '9') {
            return CharType.CHAR_NUMBER;
        } else if (ch == '.') {
            return CharType.CHAR_POINT;
        } else if (ch == 'e' || ch == 'E') {
            return CharType.CHAR_EXP;
        }
        return CharType.CHAR_ILLEGAL;
    }

    enum State {
        STATE_INITIAL,
        STATE_INT_SIGN,
        STATE_INT,
        STATE_POINT,
        STATE_POINT_WITHOUT_INT,
        STATE_FRACTION,
        STATE_EXP,
        STATE_EXP_SIGN,
        STATE_EXP_NUMBER
    }

    enum CharType {
        CHAR_SIGN,
        CHAR_NUMBER,
        CHAR_POINT,
        CHAR_EXP,
        CHAR_ILLEGAL
    }
}
