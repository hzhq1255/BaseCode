package main

import "fmt"

// 省略参数
func add(x, y int) int {
	return x + y
}

func main() {
	var x = add(42, 11)
	fmt.Println(x)
}
