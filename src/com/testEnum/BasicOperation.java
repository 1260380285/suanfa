package com.testEnum;

/**
 * @author: yuanbing
 * @created time: 2017/11/18 下午5:37
 * @description:
 */

enum BasicOperation implements Operation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("X") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String mSymbol;

    BasicOperation(String symbol) {
        this.mSymbol = symbol;
    }

    @Override
    public String toString() {
        return mSymbol;
    }
}
