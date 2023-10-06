package com.certif.testing.springunittests.services;

import com.certif.testing.springunittests.repositories.ProductRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;
    @BeforeAll
    public static void beforeClass() {
        System.out.println("=*=*=*=*=*=*=*=*= WELCOME, WE'RE RUNNING YOUR TESTS =*=*=*=*=*=*=*=*=");
    }
    @AfterEach
    public void after() {
        System.out.println("Running test finished \uD83D\uDE0B");
    }
    @AfterAll
    public static void afterClass() {
        System.out.println("=*=*=*=*=*=*=*=*= GOODBYE, WE FINISHED RUNNING YOUR TESTS =*=*=*=*=*=*=*=*=");
    }
    @Test
    public void itShouldReturnEmptyProductList(){
        // given
        given(productRepository.getProductNames()).willReturn(Collections.emptyList());
        // when
        List<String> results = productService.getProductNamesWithEvenNoOfChar();
        // assertion
        assertTrue(results.isEmpty());
    }
    @Test
    public void itShouldReturnMoreProducts() {
        // given
        List<String> input = Arrays.asList("aa","bbbb","ccc");
        given(productRepository.getProductNames()).willReturn(input);
        // when
        List<String> res = productService.getProductNamesWithEvenNoOfChar();
        // assertion
        assertEquals(2, res.size());
    }
}