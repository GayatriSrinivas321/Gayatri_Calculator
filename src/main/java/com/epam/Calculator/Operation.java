package com.epam.Calculator;

import java.math.BigInteger;

public class Operation {

BigInteger Addition(long num1, long num2) {
	return BigInteger.valueOf(num1+num2);
}

BigInteger Subtraction(long num1, long num2) {
	return BigInteger.valueOf(num1-num2);
}

BigInteger Multplication(long num1, long num2) {
	return BigInteger.valueOf(num1*num2);
}

BigInteger Division(long num1 ,long num2) {
	return BigInteger.valueOf(num1/num2);
}

BigInteger Modulo(long num1, long num2) {
	return BigInteger.valueOf(num1%num2);
}

}
