package com.thecodeslinger;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ComplexOperationService {
    
    private final Calculator calculator;

    public void doComplexOperation(final int a, final int b) {
        System.out.println(calculator.sum(a, b));
    }
}