package com.testEnum;

/**
 * @author: yuanbing
 * @created time: 2017/11/18 下午5:37
 * @description:
 */

enum ExtendOperation implements Operation {

    EXP("^") {
        @Override
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMINDER("%") {
        @Override
        public double apply(double x, double y) {
            return x % y;
        }
    };
    private final String mSymbol;

    ExtendOperation(String symbol) {
        this.mSymbol = symbol;
    }

    @Override
    public String toString() {
        return mSymbol;
    }
}
