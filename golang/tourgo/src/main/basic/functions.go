package main

import "fmt"

func add(x int, y int) int {
	return x + y
}

func myPrint(x int) {
	fmt.Println(x)
}

func main() {
	var x = add(42, 11)
	myPrint(x)
}
