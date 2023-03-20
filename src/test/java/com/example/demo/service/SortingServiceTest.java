package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingServiceTest {

    private SortingService sortingService;

    @BeforeEach
    void setUp() {
        sortingService = new SortingService();
    }


    @Test
    @DisplayName("should merge two empty arrays")
    void mergeTwoEmptyArrays() {
        int[] arr = new int[0];
        int[] expected = new int[0];

        int[] actual = sortingService.mergeSort(arr);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("should return the same array when the input array has only one element")
    void mergeSortWhenInputArrayHasOneElement() {
        int[] input = {1, 2};
        int[] expected = {1, 2};
        int[] actual = sortingService.mergeSort(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("should return a sorted array when the input array is unsorted")
    void mergeSortWhenInputArrayIsUnsorted() {
        int[] input = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = sortingService.mergeSort(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("should return a sorted array when the input array contains negative numbers")
    void mergeSortWhenInputArrayContainsNegativeNumbers() {
        int[] inputArray = {-1, -2, -3, -4, -5};
        int[] expectedArray = {-5, -4, -3, -2, -1};
        int[] actualArray = sortingService.mergeSort(inputArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    @DisplayName("should return a sorted array when the input array is already sorted")
    void mergeSortWhenInputArrayIsAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = sortingService.mergeSort(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("should return a sorted array when the input array is sorted in descending order")
    void mergeSortWhenInputArrayIsSortedInDescendingOrder() {
        int[] inputArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = sortingService.mergeSort(inputArray);
        assertArrayEquals(expectedArray, actualArray);
    }
}