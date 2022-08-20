package main

import "fmt"

// 每个没有初始化的变量都有零值
func main() {
	var i int
	var f float64
	var b bool
	var s string
	fmt.Printf("%v %v %v %q\n", i, f, b, s)
}
