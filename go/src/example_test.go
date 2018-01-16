package main

import "testing"

func TestSum(t *testing.T) {
	result := Sum(1, 10)
	if result != 55 {
		t.Error("Expected 55, got ", result)
	}
}
