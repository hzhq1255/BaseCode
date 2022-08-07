package main

import "fmt"

var m map[string]int

func main() {
	m = make(map[string]int)
	m["a"] = 1
	fmt.Println(m["a"])
}
