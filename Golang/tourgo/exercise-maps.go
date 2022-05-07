package main

import (
	"fmt"
	"strings"

	"golang.org/x/tour/wc"
)

func WordCount(s string) map[string]int {
	var m map[string]int = make(map[string]int)
	var j, k int = 0, 0
	for i, word := range s {
		if string(word) == " " {
			// fmt.Println(i, j, k)
			m[s[j:i]] += 1
			j = i + 1
			k++
		}
		if k != 0 && i == len(s)-1 {
			m[s[j:i+1]] += 1
		}
	}
	if k == 0 && len(m) != 0 {
		m[s] = 1
	}
	// fmt.Println(m)
	return m
}

func WordCount1(s string) map[string]int {
	m := make(map[string]int)
	words := strings.Fields(s)
	// fmt.Println(words)
	for _, word := range words {
		m[string(word)] += 1
	}
	fmt.Println(m)
	return m
}

func main() {
	// WordCount("aaaa")
	WordCount1("aaa")
	wc.Test(WordCount1)
}
