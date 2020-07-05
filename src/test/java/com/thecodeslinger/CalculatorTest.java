package com.thecodeslinger;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest 
{
    @Mock
    Calculator calculator;

    @InjectMocks
    ComplexOperationService complexOperationService;

    @Test
    public void verify_with_when()
    {
        when(calculator.sum(40, 2)).thenReturn(42);
        complexOperationService.doComplexOperation(40, 2);
    }

    @Test
    public void verify_with_when_fails()
    {
        when(calculator.sum(40, 2)).thenReturn(42);
        complexOperationService.doComplexOperation(20, 1);
    }
    
    @Test
    public void verify_with_verify_anyInt()
    {
        when(calculator.sum(anyInt(), anyInt())).thenReturn(42);
        complexOperationService.doComplexOperation(40, 2);
        verify(calculator).sum(40, 2);
    }
    
    @Test
    public void verify_with_verify_anyInt_fails()
    {
        when(calculator.sum(anyInt(), anyInt())).thenReturn(42);
        complexOperationService.doComplexOperation(20, 1);
        verify(calculator).sum(40, 2);
    }
    
    @Test
    public void verify_with_verify_explicit_values()
    {
        when(calculator.sum(40, 2)).thenReturn(42);
        complexOperationService.doComplexOperation(40, 2);
        verify(calculator).sum(40, 2);
    }
    
    @Test
    public void verify_with_verify_explicit_values_fails()
    {
        when(calculator.sum(40, 2)).thenReturn(42);
        complexOperationService.doComplexOperation(20, 1);
        verify(calculator).sum(40, 2);
    }
}
